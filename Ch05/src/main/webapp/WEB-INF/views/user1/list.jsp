<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::list</title>
	</head>
<body>
	<h3>user1 목록</h3>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/user1/register">user1 등록</a>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>휴대폰</th>
			<th>나이</th>
			<th>관리</th>
		</tr>
		<tr>
			<td>a101</td>
			<td>홍길동</td>
			<td>010-1234-1010</td>
			<td>15</td>
			<td>
				<a href="/Ch05/user1/modify">수정</a>			
				<a href="/Ch05/user1/delete">삭제</a>			
			</td>
		</tr>
	
	</table>
</body>
</html>