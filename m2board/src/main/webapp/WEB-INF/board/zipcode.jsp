<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>우편번호 검색</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
<script type="text/javascript">
	function setZipcode(zip1, zip2, addr1){
		let f = opener.document.regist; //회원가입화면(member.jsp)의 폼태그(<form> name = regist)에 접근
		f.zipcode.value = zip1 + '-' + zip2;//회원가입화면의 우편번호에 입력될 값
		f.address1.value = addr1; //회원가입화면의 주소 값
		
		self.close(); //주소찾기화면(zipcode.jsp) 닫기
	}
</script>
</head>
<body>
<form> <!-- form에 action이 설정되어있지 않으면, 현재 url을 요청하게 된다. 즉,화면 변화X -->
<table>
	<caption>우편번호 검색</caption>
<tr>
	<th colspan="2"> 동 : 
		<input type="text" name="area" 
		autofocus="autofocus" required="required" 
		style="width:100px;" value="${area}" /><!-- value에 검색한 값이 유지될 수 있도록 설정 -->
		<input type="submit" value="검색" />
	</th>
</tr>
<!-- jstl로 반복문 -->
<!-- 검색했지만, 주소목록을 얻어오지(찾지) 못했다면 -->
<c:if test="${area != null && list.size() == 0 }">
	<tr>
		<td colspan="2">
			검색한 [${area}]동을 포함한 주소는 존재하지 않습니다.
		</td>
	</tr>
</c:if>
<!-- 그게 아니라면(주소목록을 잘 얻어온 경우) 주소목록을 출력 -->
<c:if test="${list != null}">
	<c:forEach items="${list}" var="dto">
		<tr>
			<td width="65">
				<a href="javascript:;" onclick="setZipcode('${dto.zipcode1}', '${dto.zipcode2}', '${dto.address1}')">
					${dto.zipcode1}-${dto.zipcode2}
				</a>
			</td>
			<td>${dto.address1}</td>
		</tr>
	</c:forEach>
</c:if>
</table>
</form>
</body>
</html>