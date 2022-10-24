<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert" method="post">
		아이디<input type="text" name="id"><br>
		비밀번호<input type="password" name="pw"><br>
		이름<input type="text" name="name"><br>
		<input type="submit" value="가입">
	</form>
	
	<form action="delete" method="post">
		삭제할 번호<input type="text" name="idx"><br>
		<input type="submit" value="삭제">
	</form>
	<hr>
	<c:forEach var="i" items="${list}">
		<a href="delete?idx=${i.idx}">${i.idx}</a> : <a href="update?idx=${i.idx}">${i.id}</a>/${i.pw}/${i.name}
		/${i.pw}/${i.name}<br>
	</c:forEach>
	
</body>
</html>