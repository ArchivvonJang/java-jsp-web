package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	//DAO (Data Access Object)
	
	private static UserDao userDao = null;
	
	//constructor 생성자
	private UserDao() {
		try {
			//oracle binding
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//참조 메서드 (싱글턴패턴으로 만들기)
	public static UserDao getInstance() {
		//BoardDao 객체 만들기
		if(userDao == null) userDao = new UserDao();	
		return userDao;
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
	
	public int countID(String id) {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // 1 or 0
		
		int result = 0;
		
		String sql = "select count(id) as cnt "
				+ "from userid "
				+ "where id = ? ";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery(); 
			//id가 sql에 결합되서 쿼리 실행 -> id가 존재하면 rs는 1 아니면 0
			
			if(rs.next()) {
				//cnt값을 얻어와서 result에 담고 반환
				result = rs.getInt("cnt");
			}
		}catch(Exception e) {
			e.printStackTrace();
			result = -1;
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return result;
	}
	

}
