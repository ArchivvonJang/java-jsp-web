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
	
	public List<BoardDto> getBoardList(Long startnum, Long endnum) { //시작번호와 끝번호를 받기
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<BoardDto> list = new ArrayList<BoardDto>();
		 
//		String sql = "select b.no, b.title, b.id, " 
//					+ "case when to_char(b.regdate, 'YYYY-MM-DD') = to_char(sysdate, 'YYYY-MM-DD') "
//					+ "then to_char(b.regdate, 'HH24:MI:SS') "
//					+ "else to_char(b.regdate, 'YYYY-MM-DD') end as "
//				+ "regdate, b.readcount, m.name "
//				+ "from tbl_board b "
//				+ "join tbl_member m "
//				+ "on b.id = m.id "
//				+ "order by b.no desc ";
		
		//페이징처리하면서 목록가져오기
		String sql = "SELECT B.* " 
						+ "FROM (SELECT rownum AS rnum, A.* " 
			            + 	"FROM (SELECT b.no, b.title, m.id, "
			            + 			"case when to_char(b.regdate, 'YYYY-MM-DD') = to_char(sysdate, 'YYYY-MM-DD') "
			            + 			"then to_char(b.regdate, 'HH24:MI:SS') "
			            + 			"else to_char(b.regdate, 'YYYY-MM-DD') end AS regdate, b.readcount, m.name "
			            + 		"FROM tbl_board b join tbl_member m "
			            + 		"ON b.id = m.id  "
			            + 	"ORDER BY no DESC) A) B "
			            + "WHERE ?<=rnum AND rnum<=? ";
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			
			ps.setLong(1, startnum);
			ps.setLong(2, endnum);
			
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
	
	public BoardDto getBoardView(Long no) {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		BoardDto boardDto = null;
		
		String sql = "select b.no, b.title, b.content, b.id, b.regdate, b.readcount, m.name "
					+ "from tbl_board b "
					+ "join tbl_member m "
					+ "on b.id = m.id "
					+ "where b.no = ? ";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			ps.setLong(1, no);
			
			rs = ps.executeQuery();		

			if(rs.next()) {
				//id,name 꺼내기 <- memberDto
				MemberDto memberDto = new MemberDto();
				memberDto.setId("id");
				memberDto.setName(rs.getString("name"));
				//담아주기
				boardDto = new BoardDto();
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setContent(rs.getString("content"));
				boardDto.setRegdate(rs.getString("regdate"));
				boardDto.setReadcount(rs.getInt("readcount"));
				boardDto.setMemberDto(memberDto);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return boardDto;
	}
	public boolean updateReadCount(Long no) {
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = "update tbl_board "
				+ "set readcount = readcount + 1 "
				+ "where no = ? ";
		
		boolean result = false;
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			ps.setLong(1, no);

			if(ps.executeUpdate() > 0) {
				result = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		return result;
	}
	public boolean updateBoard(BoardDto boardDto) {
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = "update tbl_board "
				+ "set title = ?, content = ? "
				+ "where no = ? and id = ? ";
	
		boolean result = false;
	
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			
			ps.setString(1, boardDto.getTitle());
			ps.setString(2, boardDto.getContent());
			ps.setLong(3, boardDto.getNo());		
			ps.setString(4, boardDto.getMemberDto().getId());

			if(ps.executeUpdate() > 0) {
				result = true;
				
			}		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		
		return result;
	}
	public boolean deleteBoard(BoardDto boardDto) {
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = "delete from tbl_board where no = ? and id = ? ";
	
		boolean result = false;
	
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);

			ps.setLong(1, boardDto.getNo());		
			ps.setString(2, boardDto.getMemberDto().getId());

			if(ps.executeUpdate() > 0) {
				result = true;		
			}		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		
		return result;
	}
	
	//전체 레코드 수 
	public long getRecordCount() {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		long result = 0L;
		
		String sql = "select count(*) cnt from tbl_board ";
		
		try {
			cn = getConnection();
			ps= cn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) result = rs.getLong("cnt");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		return result;
	}
	
}
