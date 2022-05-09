<%@page import="board.model.BoardDao"%>
<%@page import="board.model.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Long no = Long.parseLong(request.getParameter("no"));
  String title = request.getParameter("title");  
  String name = request.getParameter("name");  
  String password = request.getParameter("password");  
  String content = request.getParameter("content");  

  BoardDto boardDto = new BoardDto();
  
  boardDto.setNo(no);
  boardDto.setTitle(title);
  boardDto.setName(name);
  boardDto.setPassword(password);
  boardDto.setContent(content);
  
  //BoardDto를 DAO에 넘겨준다. 
  BoardDao boardDao = BoardDao.getInstance();
  //list와 insert가 같은 객체를 사용하고 있는지 확인 
  System.out.println("boardDao hashcode : " + boardDao.hashCode());
  //dto를 담아서 실행한 dao결과를 result에 담는다.
  boolean result = boardDao.updateBoard(boardDto);
  
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update_action</title>
</head>
<body>
	<script type="text/javascript">
		<%if(result){%>
			alert('글이 수정되었습니다.');
			location.href = 'content.jsp?no=<%=boardDto.getNo() %>'; 
		<%}else{%>
			alert('글 수정이 실패하였습니다. 비밀번호를 확인해주세요.');
			location.href = 'javascript:history.back();'; 
		<%}%>
	</script>

</body>
</html>