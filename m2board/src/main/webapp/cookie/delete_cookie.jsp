<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 쿠키삭제 -->
<%
	Cookie cookie = new Cookie("id", URLEncoder.encode("김에이", "UTF-8")); //인코딩
	cookie.setMaxAge(0); //<----이게 바로 쿠키 삭제 쿠기가 만들어지지 않기 때문이다.
	response.addCookie(cookie);  //해당 클라이언트에 대한 정보를 가져올 수 있다.
	response.sendRedirect("using_cookie.jsp");//쿠키타입의 배열로 꺼내올 jsp
%>