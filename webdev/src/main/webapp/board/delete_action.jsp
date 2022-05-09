<%@page import="board.model.BoardDao"%>
<%@page import="board.model.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Long no = Long.parseLong(request.getParameter("no")); 
  String password = request.getParameter("password");  

  BoardDto boardDto = new BoardDto();
  boardDto.setNo(no);
  boardDto.setPassword(password);
  
  //BoardDto를 DAO에 넘겨준다. 
  BoardDao boardDao = BoardDao.getInstance();
  //dto를 담아서 실행한 dao결과를 result에 담는다.
  //boolean result = boardDao.deleteBoard(no, password);
  boolean result = boardDao.deleteBoard(boardDto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete_action</title>
</head>
<body>
	<script type="text/javascript">
		<%if(result){%>
			alert('게시물이 삭제되었습니다.');
			location.href = 'list.jsp'; //다음 이동할 페이지
		<%}else{%>
			alert('삭제 실패하였습니다.');
			location.href = 'javascript:history.back();'; //다음 이동할 페이지
		<%}%>
	</script>

</body>
</html>