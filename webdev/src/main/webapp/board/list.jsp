<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
<link rel="stylesheet" href="../css/board.css" type="text/css"/>
</head>
<body>
	<table width="600">
		<caption>게시판 리스트</caption>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>이름</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
<%
	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null; //결과데이터를 받아오는 객체참조변수
	
	String sql = "SELECT no, title, name, to_char(writeday, 'YYYY-MM-DD') as writeday, readcount " +
					"FROM m1board " +
					"ORDER BY no DESC ";
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"oraclejava", "oraclejava");
		
		//conncetion 기반으로 ps를 얻어온다.
		ps = cn.prepareStatement(sql);
		//select 데이터 조회 -> executeQuery()
		ps.executeQuery(sql);
		//query를 rs로 받는다.
		rs = ps.executeQuery();
		//더이상 조회되는 레코드가 없을 때까지 반복
		while(rs.next()){
			//출력
%>
			<tr>
				<td><%=rs.getLong("no") %>     		</td>
				<td><%=rs.getString("title") %>		</td>
				<td><%=rs.getString("name") %>		</td>
				<td><%=rs.getString("writeday") %>	</td>
				<td align="right"><%=rs.getInt("readcount") %></td>
			</tr>
<%
	
			
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		  if(rs!=null) try{ps.close();} catch(Exception e){}
		  if(ps!=null) try{ps.close();} catch(Exception e){}
		  if(cn!=null) try{cn.close();} catch(Exception e){}
	}

%>		
	</table>
	<a href="insert.jsp">[글쓰기]</a>
</body>
</html>