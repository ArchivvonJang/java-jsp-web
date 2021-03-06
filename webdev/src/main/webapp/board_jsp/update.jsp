<%@page import="board.model.BoardDto"%>
<%@page import="board.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Long no = Long.parseLong(request.getParameter("no"));
	BoardDao boardDao = BoardDao.getInstance();
	
	//게시판보기
	BoardDto boardDto = boardDao.getBoardView(no);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<link rel="stylesheet" href="../css/board.css" type="text/css"/>
</head>
<body>
	<form action="update_action.jsp" method="post">
		<table>
			<caption>글쓰기</caption>
			<tr>
				<th>번호</th>
				<td><%=boardDto.getNo() %>
					<input type="hidden" name="no" autofocus="autofocus" required="required" value="<%=boardDto.getNo()%>" readonly="readonly"/>
				</td>
			</tr>		
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" autofocus="autofocus" required="required" value="<%=boardDto.getTitle()%>"/></td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" required="required" value="<%=boardDto.getName()%>"/></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="password" required="required" /><br/>
					<span style="color:red">*처음 글 작성시 입력한 비밀번호를 동일하게 재입력해주세요.</span>
				</td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><textarea rows="5" cols="50" name="content" required="required"><%=boardDto.getContent()%></textarea></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="수정" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>