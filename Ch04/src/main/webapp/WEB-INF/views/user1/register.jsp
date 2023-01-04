<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::register</title>
	</head>
<body>
	<h3>user1 등록</h3>
	
	<form action="/Ch04/user1/register" method="post">
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
				<td colspan="2" align="right"><input type="submit" value="등록"></td>
			</tr>		
		</table>
	
	</form>
	
</body>
</html>