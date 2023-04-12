<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Language" content="ko">
<<<<<<< HEAD
<title>SELECT</title>
<script src="https://code.jquery.com/jquery-Latest.min.js"></script>
<style>
table {
	border-collapse: collapse;
}

th {
	font-weight: bold;
}

th, td {
	padding: 5px;
	border: 1px solid #000;
	text-align: center;
}
button {
	margin: 5px;
	margin-top: 10px;
}
</style>
=======
<title>데이터 가져오기</title>
<script src="https://code.jquery.com/jquery-Latest.min.js"></script>
>>>>>>> branch 'master' of https://github.com/ZZZZZZZIWON/review_homepage2023.git
</head>
<body>
<<<<<<< HEAD
	<table>
		<thead>
			<tr>
				<th>TEMP_ID</th>
				<th>TEMP_VAL</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${result.tempId}</td>
				<td>${result.tempVal}</td>			
			</tr>
		</tbody>
	</table>
	<div class="box-btn">
		<c:url var="uptUrl" value="/temp/tempRegist.do">
			<c:param name="tempId" value="${result.tempId}" />
		</c:url>
		<a href="${uptUrl}"><button type="button">수정</button></a>
		<c:url var="delUrl" value="/temp/delete.do">
			<c:param name="tempId" value="${result.tempId}" />
		</c:url>
		<a href="${delUrl}" class="btn-del"><button type="button">삭제</button></a> 
		<a href="/temp/selectList.do"><button type="button">목록</button></a>
=======
	${result.tempId} : ${result.tempVal}

	<div class="box-btn">
		<c:url var="uptUrl" value="/temp/tempRegist.do">
			<c:param name="tempId" value="${result.tempId}" />
		</c:url>
		<a href="${uptUrl}">수정</a>
		<c:url var="delUrl" value="/temp/delete.do">
			<c:param name="tempId" value="${result.tempId}" />
		</c:url>
		<a href="${delUrl}" class="btn-del">삭제</a> <a
			href="/temp/selectList.do">목록</a>
>>>>>>> branch 'master' of https://github.com/ZZZZZZZIWON/review_homepage2023.git

	</div>
	<script>
		$(document).ready(function() {
			$(".btn-del").click(function() {
				if (!confirm("삭제하시겠습니까?")) {
					return false;
				}
			})
		})
	</script>
</body>
</html>