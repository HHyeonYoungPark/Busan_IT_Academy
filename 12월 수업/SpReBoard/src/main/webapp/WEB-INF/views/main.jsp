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
	
	<input type="button" value="새글쓰기" onclick="javascript:location.href='write'">
	<br><br>	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>아이디</th>			
			<th>리플</th>
		</tr>
		<c:forEach var="i" items="${list}">
			<tr>
				<td>${i.idx}</td>
				<td><a href="read?idx=${i.idx}">${i.title}</a></td>
				<td>${i.id}</td>
				<td>${i.replycnt}</td>
			</tr>
		</c:forEach>		
	</table>
	
	
	<!-- 페이징 -->
	
	<c:if test="${paging.startPage != 1 }">
		<a href="main?nowPage=${paging.startPage - 1 }">&lt;</a>
	</c:if>
	<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="p">
		<c:choose>
			<c:when test="${p == paging.nowPage }">
				<b>${p }</b>
			</c:when>
			<c:when test="${p != paging.nowPage }">
				<a href="main?nowPage=${p }">${p }</a>
			</c:when>
		</c:choose>
	</c:forEach>
	<c:if test="${paging.endPage != paging.lastPage}">
		<a href="main?nowPage=${paging.endPage+1 }">&gt;</a>
	</c:if>
	
</body>
</html>