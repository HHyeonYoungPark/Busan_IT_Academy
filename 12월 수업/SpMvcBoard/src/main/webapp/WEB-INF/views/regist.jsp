<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<link rel="stylesheet" href="resources/css/mvccss.css"/>
</head>
<body>
	<c:if test="${memCnt > 0}">
		<script>
			alert("이미 있는 id 입니다.");
			location.href="regist";
		</script>
	</c:if>


	<h2>회원가입</h2>
	
	<form action="registProc" method="post">	
	<table>
		<tr>
			<td>아 이 디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pw"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="회원가입">
				<input type="button" value="취소" onclick="javascript:location.href='main'">
			</td>			
		</tr>
	</table>
	</form>
	
</body>
</html>