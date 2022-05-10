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
	
	//글쓰기 Insert
	public boolean insertBoard(BoardDto boardDto) {
	  //DB에 insert
	  String sql =
	  		"INSERT INTO m1board(no, title, name, password, content) "
	  		+ "VALUES(m1board_seq.nextval, ?, ?, ?, ?) ";
	  
	  boolean result = false; 
	  Connection cn = null;
	  PreparedStatement ps = null; //sql query 실행하는 객체 참조 변수
	  
	  try{
		  
		  cn = getConnection();
		  ps = cn.prepareStatement(sql);
		  
		  ps.setString(1, boardDto.getTitle());  
		  ps.setString(2, boardDto.getName());
		  ps.setString(3, boardDto.getPassword());
		  ps.setString(4, boardDto.getContent());
		  
		  //insert, delete, edit , executeQuery -> select
		  ps.executeUpdate();
		  //connection , insert success
		  result = true;
	  }catch(Exception e){
		  e.printStackTrace();
	  }finally{
		 dbClose(cn, ps);
	  }
	  
	return result; //글 등록 성공 true, 실패 false
	  
	}

	
	//글 조회 List
	public List<BoardDto> getBoardList(){
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; //결과데이터를 받아오는 객체참조변수
		List<BoardDto> list = new ArrayList<BoardDto>();
		
		String sql = "SELECT no, title, name, to_char(writeday, 'YYYY-MM-DD') as writeday, readcount " +
						"FROM m1board " +
						"ORDER BY no DESC ";
		
		try{
			
			cn = getConnection();
			//conncetion 기반으로 ps를 얻어온다.
			ps = cn.prepareStatement(sql);
			//select 데이터 조회 -> executeQuery()
			ps.executeQuery(sql);
			//query를 rs로 받는다.
			rs = ps.executeQuery();
			//더이상 조회되는 레코드가 없을 때까지 반복
			while(rs.next()){
				//출력
				BoardDto boardDto = new BoardDto();
				//레코드 정보를 dto에 담은 후 
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setName(rs.getString("name"));
				boardDto.setWriteday(rs.getString("writeday"));
				boardDto.setReadcount(rs.getInt("readcount"));
				//dto를 list에 담아준다.
				list.add(boardDto);
		
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			  dbClose(cn, ps, rs);
		}
		
		return list;
	}
	
	//상세보기 content
	public BoardDto getBoardView(Long no) {
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		BoardDto boardDto = null;
		
		String sql = "SELECT no, title, name, content, writeday, readcount "
					+ "FROM m1board "
					+ "WHERE no = ? ";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			
			ps.setLong(1, no);
			//no가 위 query와 결합되면서 쿼리문 완성!
			rs = ps.executeQuery();
			
			if(rs.next()) {
				//content.jsp로 넘겨줄 데이터
				boardDto = new BoardDto();
				
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setName(rs.getString("name"));
				boardDto.setContent(rs.getString("content"));
				boardDto.setWriteday(rs.getString("writeday"));
				boardDto.setReadcount(rs.getInt("readcount"));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return boardDto;
	}

	
	//조회수 증가
	public boolean updateReadcount(Long no) {
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = "UPDATE m1board " 
					+ "SET readcount = readcount + 1 "
					+ "WHERE no = ? ";
		
		boolean result = false; //true 방문 false 방문X
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			
			ps.setLong(1, no);
			//반영된 레코드 수를 반환해준다.
			//ps.executeUpdate();
			//조회수 증가가 제대로 되었을 때 true로 변경
			if(ps.executeUpdate() > 0) result = true;

		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			dbClose(cn, ps);
		}
		
		return result;
	}
	
	//수정하기
	public boolean updateBoard(BoardDto boardDto) {
		boolean result = false;
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = "UPDATE m1board " 
					+ "SET title = ?, name = ?, content = ? "
					+ "WHERE no = ? AND password = ? ";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			//binding
			ps.setString(1, boardDto.getTitle());
			ps.setString(2, boardDto.getName());
			ps.setString(3, boardDto.getContent());
			ps.setLong(4, boardDto.getNo());
			ps.setString(5, boardDto.getPassword());		
			
			//반영된 레코드 수를 반환해준다.
			ps.executeUpdate();
			//조회수 증가가 제대로 되었을 때 true로 변경
			if(ps.executeUpdate() > 0) result = true;

		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			dbClose(cn, ps);
		}
		
		return result;
	}
	//삭제하기
	public boolean deleteBoard(BoardDto boardDto) {
		boolean result = false;
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM m1board " 
					+ "WHERE no = ? AND password = ? ";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			//binding
			//ps.setLong(1, no);
			ps.setLong(1, boardDto.getNo());
			ps.setString(2, boardDto.getPassword());		
			
			//반영된 레코드 수를 반환해준다.
			//ps.executeUpdate(sql);
			//조회수 증가가 제대로 되었을 때 true로 변경
			if(ps.executeUpdate() > 0) result = true;

		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			dbClose(cn, ps);
		}
		
		return result;
	}
}
