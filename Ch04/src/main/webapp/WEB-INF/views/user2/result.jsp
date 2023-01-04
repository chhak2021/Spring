<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user2::result</title>
	</head>
<body>
	<h3>user2 결과</h3>
	<p>
		이름 : ${user2VO.name}<br>
		나이 : ${user2VO.age}	<br>
		성별 : ${user2VO.gender}<br>
		휴대폰 : ${user2VO.hp}<br>
		취미 :
		<c:forEach var="data" items="${user2VO.hobby}">
			${data},
		</c:forEach>
	</p>
	<a href="/Ch04/user2/register">등록하기</a>
	
</body>
</html>