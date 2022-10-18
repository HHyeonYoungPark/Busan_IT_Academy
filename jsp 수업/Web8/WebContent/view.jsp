<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	번호 : ${dtod.idx }<br>
	제목 : ${dtod.title }<br>
	글쓴이 : ${dtod.id }<br>
	글쓴날짜 : ${dtod.regdate }<br>
	내용 : ${dtod.content }<br>
	파일명 : <img src="upload/${dtod.filename }"><br>
	<a href="main.do">처음으로</a>
</body>
</html>