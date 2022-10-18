<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="writeProc.do" method="post" enctype="multipart/form-data">
		글쓰기<br>
		제목<input type="text" name="title"><br>
		글쓴이<input type="text" name="id"><br>
		내용<textarea name="content"></textarea><br>
		파일<input type="file" name="f"><br>
		<input type="submit" value="입력"><br>
	</form>
	
	
</body>
</html>