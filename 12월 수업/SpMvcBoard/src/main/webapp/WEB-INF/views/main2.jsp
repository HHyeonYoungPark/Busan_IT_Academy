<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<link rel="stylesheet" href="resources/css/mvccss.css"/>
</head>
<body>

	<c:if test="${not empty memLoginCnt}">
		<script>
			alert("아이디 또는 비밀번호가 틀렸습니다.");
			location.href="main";
		</script>
	</c:if>
	
	<c:choose>
		<c:when test="${not empty loginInfo}">
			${loginInfo.name}님 반갑습니다.
			<input type="button" value="정보수정" onclick="javascript:location.href='info?id=${loginInfo.id}'">	
			<input type="button" value="로그아웃" onclick="javascript:location.href='logout'"><br>
		</c:when>
		<c:otherwise>
			<form action="login" method="post">
			<table>
				<tr>
					<td>아 이 디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="로그인">
						<input type="button" value="회원가입" onclick="javascript:location.href='regist'">
					</td>			
				</tr>
			</table>
			</form>	
		</c:otherwise>
	</c:choose>
	<br>
	
	<c:if test="${not empty loginInfo}">
		<input type="button" value="새글쓰기" onclick="javascript:location.href='write'">
	</c:if>
	
	<select id="cntPerPage" name="sel" onchange="selChange()">
			<option value="5"
				<c:if test="${paging.cntPerPage == 5}">selected</c:if>>5줄 보기</option>
			<option value="10"
				<c:if test="${paging.cntPerPage == 10}">selected</c:if>>10줄 보기</option>
			<option value="15"
				<c:if test="${paging.cntPerPage == 15}">selected</c:if>>15줄 보기</option>
			<option value="20"
				<c:if test="${paging.cntPerPage == 20}">selected</c:if>>20줄 보기</option>
	</select>
	

	
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>글쓴이</td>
			<td>날짜</td>
			<td>파일</td>
		</tr>
		
		<c:forEach var="i" items="${list}">
			<tr>
				<td>${i.idx}</td>
				<c:choose>
					<c:when test="${not empty loginInfo}">
						<td><a href="read?idx=${i.idx}">${i.title}</a></td>
					</c:when>
					<c:otherwise>
						<td>${i.title}</td>
					</c:otherwise>
				</c:choose>
				
				<td>${i.writer}</td>
				<td>${i.regdate}</td>
				<td>
					<c:if test="${not empty i.filename}">
					    <img alt="" src="resources/img/fileicon.png">
					</c:if>				
				</td>	
			</tr>
		</c:forEach>
	</table>
	
		
	
	<c:if test="${paging.startPage != 1 }">
		<a href="main2?nowPage=${paging.startPage - 1 }&cntPerPage=${paging.cntPerPage}">&lt;</a>
	</c:if>
	<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="p">
		<c:choose>
			<c:when test="${p == paging.nowPage }">
				<b>${p }</b>
			</c:when>
			<c:when test="${p != paging.nowPage }">
				<a href="main2?nowPage=${p }&cntPerPage=${paging.cntPerPage}">${p }</a>
			</c:when>
		</c:choose>
	</c:forEach>
	<c:if test="${paging.endPage != paging.lastPage}">
		<a href="main2?nowPage=${paging.endPage+1 }&cntPerPage=${paging.cntPerPage}">&gt;</a>
	</c:if>
	

<script>
	function selChange() {
		var sel = document.getElementById('cntPerPage').value;
		location.href="main2?nowPage=${paging.nowPage}&cntPerPage="+sel;
	}
</script>
</body>
</html>