<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<link rel="stylesheet" href="resources/css/mvccss.css"/>
</head>
<body>
	<table>
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>이메일</td>
		</tr>
		<tr>
			<td>${info.idx}</td>
			<td>${info.id}</td>
			<td>${info.name}</td>
			<td>${info.pw}</td>
			<td>${info.email}</td>
		</tr>
	</table>
	<a href="main">처음으로</a> 
</body>
</html>