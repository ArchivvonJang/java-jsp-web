<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	//method 추가는 <%! 느낌표!붙이기
	public String dateFormat(int year, int month, int date){
		return year + "년 " + month + "월 " + date + "일";
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
</head>
<body>

<%
	//instance를 얻어오는 그 시점의 년, 월, 일로 setting
	Calendar cal = Calendar.getInstance(); 
// 	out.println("<h1>"
// 				+ cal.get(Calendar.YEAR) + "년 " 
// 				+ (cal.get(Calendar.MONTH) + 1) + "월 " 
// 				+ cal.get(Calendar.DATE) + "일"
// 				+ "</h1>");

%>


<!-- Expression 표현식 -->
<h1><%=dateFormat(cal.get(Calendar.YEAR)
		, cal.get(Calendar.MONTH) + 1
		, cal.get(Calendar.DATE)) %></h1>

</body>
</html>