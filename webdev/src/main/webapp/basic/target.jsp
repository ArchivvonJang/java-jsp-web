<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//request.setCharacterEncoding("UTF-8"); -> web.xml에서 설정
	String name = request.getParameter("name"); 
	String str = "Yes I'm " + name  + " . It's me!!";
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Target</title>
</head>
<body>
	<h1><%=str %></h1>
</body>
</html>