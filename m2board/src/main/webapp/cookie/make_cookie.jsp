<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 쿠키객체 -->
<%
	Cookie cookie = new Cookie("id", URLEncoder.encode("김에이", "UTF-8")); //인코딩
	cookie.setMaxAge(10); //10sec 쿠키 유지 60*60*24*30 <-한달
	response.addCookie(cookie);  //해당 클라이언트에 대한 정보를 가져올 수 있다.
	response.sendRedirect("using_cookie.jsp");//쿠키타입의 배열로 꺼내올 jsp
%>