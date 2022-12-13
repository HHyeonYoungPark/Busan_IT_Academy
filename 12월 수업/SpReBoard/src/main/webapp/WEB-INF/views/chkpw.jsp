<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="deleteData" method="post">
		<input type="hidden" name="idx" value="${data.idx}">
		<input type="hidden" name="id" value="${data.id}">
		<input type="password" name="pw">
		<input type="submit" value="삭제">
		<input type="button" value="취소" onclick="javascript:history.back()">
	</form>
</body>
</html>