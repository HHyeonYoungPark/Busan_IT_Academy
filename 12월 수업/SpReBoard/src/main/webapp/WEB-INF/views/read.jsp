<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/recss.css"/>
</head>
<body>
	
	<c:if test="${not empty res }">
		<script>
			alert("비밀번호가 틀렸습니다.");
			location.href="read?idx=${data.idx}";
		</script>
	</c:if>
	
	<c:if test="${not empty reres }">
		<script>
			alert("비밀번호가 틀렸습니다.");
			location.href="read?idx=${data.idx}";
		</script>
	</c:if>
	
	
	<table>
		<tr>			
			<th>제목</th>
			<td colspan="3">${data.title}</td>			
		</tr>
		<tr>
			<th>아이디</th>
			<td>${data.id}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3">${data.content}</td>
		</tr>			
	</table>
	
	<form action="chkPw" method="post">
		<input type="hidden" name="idx" value="${data.idx}">
		<input type="hidden" name="id" value="${data.id}">		
		<input type="submit" value="삭제">
		<input type="button" value="수정(구현안됨)" onclick="location.href='updateData?idx=${data.idx}'">
		<input type="button" value="취소" onclick="javascript:location.href='main'">	
	</form>
	
	<br><hr><br>
	
	<form action="writeReply" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id"></td>
				<th>비밀번호</th>
				<td><input type="password" name="pw"></td>				
				<td><input type="submit" value="작성"></td>
			</tr>
			<tr>
				<td colspan="5"><textarea name="content"></textarea></td>
			</tr>
		</table>
		<input type="hidden" name="boardidx" value="${data.idx}">
	</form>
	
	<br><hr><br>
	
	
		<c:forEach var="i" items="${reply}">
			<form action="delReply" method="post">
			<table>	
				<tr>
					<th>아이디</th>
					<td>${i.id}</td>
					<td><input type="password" name="pw"></td>
					<td><input type="submit" value="삭제"></td>
				</tr>
				<tr>
					<td colspan="5">${i.content}</td>
				</tr>
			</table>
			<input type="hidden" name="idx" value="${i.idx}">
			<input type="hidden" name="id" value="${i.id}">			
			<input type="hidden" name="boardidx" value="${data.idx}">
			</form>
			<br>
		</c:forEach>
	
	
	
	
</body>
</html>