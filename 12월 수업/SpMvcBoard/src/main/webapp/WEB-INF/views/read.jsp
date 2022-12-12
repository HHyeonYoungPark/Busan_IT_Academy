<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
			<td>제목</td>
			<td>글쓴이</td>
			<td>내용</td>
			<td>등록일</td>
			<td>파일명</td>
		</tr>
		<tr>
			<td>${data.idx}</td>
			<td>${data.title}</td>
			<td>${data.writer}</td>
			<td>${data.content}</td>
			<td>${data.regdate}</td>
			<td><a href="resources/upload/${data.filename}">${data.filename}</a></td>
		</tr>
	</table>
	
	<c:if test="${data.writer eq loginInfo.name}">
		<a href="main">처음으로</a>
		<a href="delete?idx=${data.idx}">글삭제</a><br><br><br>
		<a href="update?idx=${data.idx}">글수정</a>구현안됨. 직접해보시길 바랍니다.
	</c:if>
	
</body>
</html>