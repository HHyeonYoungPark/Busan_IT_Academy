<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시판 - ${vd.size() } 개<br>
	번호/제목/글쓴이/날짜<br>
	
	<c:forEach var="i" items="${vd}" >
		${i.idx } / <a href="view.do?idx=${i.idx }">${i.title }</a> / ${i.id } / ${i.regdate }<br>
	</c:forEach>
	
	<a href="write.do">글쓰기</a>
		
</body>
</html>