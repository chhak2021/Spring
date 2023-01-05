<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::modify</title>
	</head>
<body>
	<h3>user1 수정</h3>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/user1/list">user1 목록</a>
	
	<form action="/Ch05/user1/modify" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" value="${user.uid}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${user.name}"></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp" value="${user.hp}"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="number" name="age" value="${user.age}"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>	
</body>
</html>