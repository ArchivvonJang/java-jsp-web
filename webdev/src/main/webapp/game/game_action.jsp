<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>game_action</title>
</head>
<body>	
	<h1>가위바위보 결과</h1>
	<h2>
		<span style="color:orange">YOU : ${you}</span><br/> <!-- EL Expression Language 표현언어 -->
		<span style="color:navy">COM : ${com}</span> <br/>	
		<br/>
		${win}
	</h2>
</body>
</html>