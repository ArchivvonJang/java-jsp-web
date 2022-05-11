package board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	//DAO (Data Access Object)
	
	private static MemberDao memberDao = null;
	
	//constructor 생성자
	private MemberDao() {
		try {
			//oracle binding
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//참조 메서드 (싱글턴패턴으로 만들기)
	public static MemberDao getInstance() {
		//memberDao 객체 만들기
		if(memberDao == null) memberDao = new MemberDao();	
		return memberDao;
	}
	
	private Connection getConnection() throws SQLException {
		 return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"oraclejava", "oraclejava");				
	}
	
	private void dbClose(Connection cn, PreparedStatement ps, ResultSet rs) {
		if(rs!=null) try{rs.close();} catch(Exception e){}
		if(ps!=null) try{ps.close();} catch(Exception e){}
		if(cn!=null) try{cn.close();} catch(Exception e){}		
	}
	
	private void dbClose(Connection cn, PreparedStatement ps) {
		if(ps!=null) try{ps.close();} catch(Exception e){}
		if(cn!=null) try{cn.close();} catch(Exception e){}		
	}
	
	//우편번호 가져오기
	public List<ZipcodeDto> searchZipcode(String area) {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//sql실행 결과를 List에 담아준다.
		List<ZipcodeDto> zipcodeList = new ArrayList<ZipcodeDto>();
		
		
		String sql ="select substr(zipcode, 1, 3) as zipcode1, "
				+ " 	   substr(zipcode, 5, 3) as zipcode2, "
				+ " 	   sido || ' ' || gugun || ' ' || dong || ' ' || "
				+ " 	   ri || ' ' || bunji as address1 "
				+ "from zipcode "
				+ "where dong like '%' || ? || '%' ";
		
	
		try{
			//연결
			cn = getConnection();
			//sql연결
			ps = cn.prepareStatement(sql);
			//?에 area를 남는다.
			ps.setString(1, area);
			rs = ps.executeQuery();
			
			//while 돌면서 zipcodedto에 담아준다.
			while(rs.next()) {
				ZipcodeDto zipcodeDto = new ZipcodeDto();
				zipcodeDto.setZipcode1(rs.getString("zipcode1"));
				zipcodeDto.setZipcode2(rs.getString("zipcode2"));
				zipcodeDto.setAddress1(rs.getString("address1"));
				
				//zipcodedto에 담긴 값들을 zipcodelist에 담는다.
				zipcodeList.add(zipcodeDto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		return zipcodeList;
	}
	//아이디 중복확인
	public int checkID(String id) {
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int result = -1;
		
		String sql = "select count(*) cnt from TBL_MEMBER where id = ? ";
		
		try {
			//연결
			cn = getConnection();
			//sql연결
			ps = cn.prepareStatement(sql);
			//?에 area를 남는다.
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return result;
	}
	
	
	public boolean registerMember(MemberDto memberDto) {
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		boolean result = false;
		
		String sql = "insert into tbl_member(id, password, name, birth, phone, zipcode, address1, address2) "
					+"values(?, ? ,? ,? ,? ,? ,? ,?) ";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			ps.setString(1, memberDto.getId());
			ps.setString(2, memberDto.getPassword());
			ps.setString(3, memberDto.getName());
			ps.setString(4, memberDto.getBirth());
			ps.setString(5, memberDto.getPhone());
			ps.setString(6, memberDto.getZipcode());
			ps.setString(7, memberDto.getAddress1());
			ps.setString(8, memberDto.getAddress2());
			
			
			ps.executeUpdate();
			result = true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		
		return result;
	}
	
	public MemberDto getUser(MemberDto memberDto) {
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; //로그인 성공한 회원의 id,name을 담을 결과값
		
		//반환값
		MemberDto userInfo = null;
		
		String sql = "select id, name from tbl_member "
					+ "where id = ? and password =? ";
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			
			ps.setString(1, memberDto.getId());
			ps.setString(2, memberDto.getPassword());
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				userInfo = new MemberDto();
				System.out.println("MemberDao getUser userInfo 확인 : " + userInfo);
				userInfo.setId(rs.getString("id"));
				userInfo.setName(rs.getString("name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return userInfo;
	}
	
}
