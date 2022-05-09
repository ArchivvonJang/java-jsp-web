<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection cn = null; //Connection 역할하는 객체를 참조 -> Connection interface 구성가능
	boolean result = false; //DB 연결에 성공하면 true로 변경
	try{
		Class.forName("oracle.jdbc.OracleDriver"); //oracle driver 존재 유무 확인
		cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oraclejava", "oraclejava");
		result = true;
	}catch(Exception e){
		e.printStackTrace();
	}finally{ //사용한 자원 역순으로 해제 
		if(cn!=null) try{cn.close();} catch(Exception e){}
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(result==true){ %>
데이터베이스 연결 성공
<%}else{ %>
데이터베이스 연결 실패
<%} %>
</body>
</html>