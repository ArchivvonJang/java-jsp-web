<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String msg = null;
	
	if(name.equals("김아무개")){
		msg = "안녕하세요. 제 이름은 " + name + "입니다.";
	}else if(name.equals("직장인")){
		msg = "안녕하세요. 직업은 " + name + "입니다.";
	}else if(name.equals("김와와")){
		msg = "안녕하세요. 오늘은 " + name + "입니다.";
	}else{
		msg = "야아아!!!! " + name + "!!!";
	}
%>
<%=msg%>