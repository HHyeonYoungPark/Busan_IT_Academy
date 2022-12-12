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
			<td>��ȣ</td>
			<td>����</td>
			<td>�۾���</td>
			<td>����</td>
			<td>�����</td>
			<td>���ϸ�</td>
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
		<a href="main">ó������</a>
		<a href="delete?idx=${data.idx}">�ۻ���</a><br><br><br>
		<a href="update?idx=${data.idx}">�ۼ���</a>�����ȵ�. �����غ��ñ� �ٶ��ϴ�.
	</c:if>
	
</body>
</html>