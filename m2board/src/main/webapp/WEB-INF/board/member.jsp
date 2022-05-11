<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript">
	//전역변수 선언
	let user_id_count = -1; //-1 : 시스템 오류, 0 : 사용할 수 있는 아이디, 1 : 이미 존재하는 아이디
	let user_id = '';

	function openZipcode(){
		window.open('Zipcode.do', 'zipcode', 'width=400, height=400');
	}
	
	function validate(){
		const f = document.regist; // <form>의 name = regist로 접근
		
		if(f.user_id.value.length < 3 || f.user_id.value.length >= 12){
			alert('아이디는 3글자 이상 12글자 이하로 입력하세요.');
			f.user_id.focus();
			return;
		}

		if(f.user_name.value.length < 2 || f.user_name.value.length >= 6){
			alert('이름은 2글자 이상 6글자 이하로 입력하세요.');
			f.user_name.focus();
			return;
		}		
		
		if(f.user_pw.value.length < 4 || f.user_pw.value.length >= 20){
			alert('비밀번호는 4글자 이상 20글자 이하로 입력하세요.');
			f.user_pw.focus();
			return;
		}
		
		if(f.user_pw.value != f.user_pw2.value){
			alert('비밀번호 확인이 일치하지 않습니다.');
			f.user_pw.focus();
			return;
		}
		
		if(f.user_birth.value == ''){
			alert('생년월일을 입력하세요.');
			f.user_birth.focus();
			return;
		}
		
		if(f.user_phone.value == ''){
			alert('연락처를 입력하세요.');
			f.user_phone.focus();
			return;
		}

		if(f.zipcode.value == ''){
			alert('우편번호를 입력하세요.');
			f.zipcode.focus();
			return;
		}
		
		if(f.address1.value == ''){
			alert('주소를 입력하세요.');
			f.address1.focus();
			return;
		}
		
		if(f.address2.value == ''){
			alert('상세주소를 입력하세요.');
			f.address2.focus();
			return;
		}
		
		if(user_id_count != 0){ //사용할 수 없는 아이디
			alert('사용할 수 있는 아이디가 아닙니다.');
			f.user_id.focus();
			return;
		}
		
		//form 에 action 주기! (이런 방식으로도 줄 수 있다.)
		f.method = 'POST';
		f.action = 'MemberRegisterAction.do';
		f.submit();
		
	}
	
	//아이디 입력란 키보드 입력시 자동 호출
 	function change_user_id(){
// 		console.log(document.regist.user_id.value);
		const f = document.regist;
		user_id = f.user_id.value;
		
		if(user_id.length < 3 || user_id.length >= 12){
			document.getElementById('check_id_result').innerHTML 
			= '<font color="salmon">아이디는 3글자 이상 12글자 이하로 입력하세요.</font>';
			f.user_id.focus();
			return;
		}
		
		//ajax - 생성자함수
		new Request('CheckID.do', 'user_id='+user_id, callback, 'POST');
 	}
	
	function callback(xhr){
		if(xhr.readyState == 4){
			if(xhr.status == 200){
				user_id_count = parseInt(xhr.responseText.trim());
				
				//alert('user_id_count : ' + user_id_count);
				
				if(user_id_count == 1){
					document.getElementById('check_id_result').innerHTML 
							= '<font color="red">'+ user_id +'는 이미 사용중인 아이디입니다.</font>';
					return;
				}else if(user_id_count == 0){
					document.getElementById('check_id_result').innerHTML 
							= '<font color="green">'+ user_id +'는 사용가능한 아이디입니다.</font>';
					return;
				}else{
					alert('시스템오류');
				}
			}
		}
	}
</script>
</head>
<body>
<form name="regist" method="post">
<table border="1">
	<caption>회원 가입</caption>
<tr>
	<th>아이디</th>
	<td><input type="text" name="user_id" id="user_id" onkeyup="change_user_id()"/>
		<div id="check_id_result">영문자 + 숫자 포함 3 ~ 12 글자수로 입력하세요.</div>
	</td>
</tr>
<tr>
	<th>이름</th>
	<td><input type="text" name="user_name" id="user_name" /> 2 ~ 6 글자수</td>
</tr>
<tr>
	<th>비밀번호</th>
	<td><input type="password" name="user_pw" id="user_pw" /> 4 ~ 20 글자수</td> 
</tr>
<tr>
	<th>비밀번호 확인</th>
	<td><input type="password" name="user_pw2" id="user_pw2" /></td>
</tr>
<tr>
	<th>생일</th>
	<td><input type="date" name="user_birth" id="user_birth" /></td>
</tr>
<tr>
	<th>전화</th>
	<td><input type="text" name="user_phone" id="user_phone" /></td>
</tr>
<tr>
	<th>우편번호</th>
	<td>
		<input type="text" name="zipcode" readonly="readonly"
		onclick="alert('검색버튼을 이용하여 입력하세요');" 
		style="width:55px;"/>
		<input type="button" value="검색" name="btnZipcode"
		onclick="openZipcode()"
		/>
	</td>
</tr>
<tr>
	<th>주소</th>
	<td>
		<input type="text" name="address1" style="width:250px;"/><br/>
	</td>
</tr>
<tr>
	<th>상세 주소</th>
	<td>
		<input type="text" name="address2" /><br/>
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="button" value="완료" onclick="validate()" />
	</td>
</tr>
</table>
</form>
</body>
</html>