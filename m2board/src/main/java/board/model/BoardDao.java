package board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//DAO (Data Access Object)
	
	private static BoardDao boardDao = null;
	
	//constructor 생성자
	private BoardDao() {
		try {
			//oracle binding
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//참조 메서드 (싱글턴패턴으로 만들기)
	public static BoardDao getInstance() {
		//BoardDao 객체 만들기
		if(boardDao == null) boardDao = new BoardDao();	
		return boardDao;
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
	
	public boolean insertBoard(BoardDto boardDto) {
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = "insert into tbl_board(no, title, content, id) "
					+ " values(seq_board.nextval, ?, ?, ?) ";
		
		boolean result = false;
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			
			ps.setString(1, boardDto.getTitle());
			ps.setString(2, boardDto.getContent());
			ps.setString(3, boardDto.getMemberDto().getId());
		
			ps.executeUpdate();
			
			result = true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		return result;
	}
	
	public List<BoardDto> getBoardList() {
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<BoardDto> list = new ArrayList<BoardDto>();
		 
		String sql = "select b.no, b.title, b.id, b.regdate, b.readcount, m.name "
				+ "from tbl_board b "
				+ "join tbl_member m "
				+ "on b.id = m.id "
				+ "order by b.no desc ";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			rs = ps.executeQuery();
		
			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
				memberDto.setId(rs.getString("id"));
				memberDto.setName(rs.getString("name"));
				
				BoardDto boardDto = new BoardDto();
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setRegdate(rs.getString("regdate"));
				boardDto.setReadcount(rs.getInt("readcount"));
				boardDto.setMemberDto(memberDto);
				
				//list에 담기
				list.add(boardDto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return list;
	}
	
}
