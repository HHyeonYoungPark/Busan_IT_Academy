<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="writeProc" method="post" enctype="multipart/form-data">
	<table>
		<tr>			
			<td>제목</td>
			<td><input type="text" name="title"></td>			
		</tr>
		<tr>
			<td>글쓴이</td>
			<td><input type="text" name="writer" value="${loginInfo.name}" readonly></td>			
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content"></textarea></td>
		</tr>
		<tr>
			<td>파일명</td>			
			<td><input type="file" name="filename"></td>
		</tr>	
	</table>
	<input type="button" value="작성" onclick="javascript:submit()">
	<input type="button" value="취소" onclick="javascript:history.back()">	
	</form>
</body>
</html>