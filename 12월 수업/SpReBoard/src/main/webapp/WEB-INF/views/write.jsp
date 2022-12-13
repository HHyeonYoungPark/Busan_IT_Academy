<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/recss.css"/>
</head>
<body>
	<form action="writeProc" method="post">
	<table>
		<tr>			
			<th>제목</th>
			<td colspan="3"><input type="text" name="title"></td>			
		</tr>
		<tr>
			<th>아이디</th>
			<td><input type="text" name="id"></td>			
			<th>비밀번호</th>
			<td><input type="password" name="pw"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3"><textarea name="content"></textarea></td>
		</tr>			
	</table>
	<input type="submit" value="작성">
	<input type="button" value="취소" onclick="javascript:history.back()">	
	</form>
</body>
</html>