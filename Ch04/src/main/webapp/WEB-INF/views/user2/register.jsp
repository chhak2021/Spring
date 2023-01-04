<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user2::register</title>
	</head>
<body>
	<h3>user2 등록</h3>
	
	<form action="/Ch04/user2/register" method="post">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<label><input type="radio" name="gender" value="1">남</label>
					<label><input type="radio" name="gender" value="2">여</label>
				</td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp"></td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
					<label><input type="checkbox" name="hobby" value="등산">등산</label>
					<label><input type="checkbox" name="hobby" value="운동">운동</label>
					<label><input type="checkbox" name="hobby" value="독서">독서</label>
					<label><input type="checkbox" name="hobby" value="영화">영화</label>
					<label><input type="checkbox" name="hobby" value="게임">게임</label>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>
</body>
</html>