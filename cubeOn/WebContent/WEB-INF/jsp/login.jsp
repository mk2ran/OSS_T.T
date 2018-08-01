<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" method="POST">
		<table style="width: 50%;" border="1">
			<tr>
				<td><font size=5>아이디</font></td>
				<td><input type="text" name="id"
					style="height: 35px; border: 1px solid #000000; background-color: #ffffff; color: #000000;" />
				</td>
				<td rowspan="2"><input type="submit"  value="로그인" class="loginbtn alt" /></td>
			</tr>
			<tr>
				<td><font size=5>비밀번호</font></td>
				<td><input type="password" name="passWord"
					style="height: 35px; border: 1px solid #000000; background-color: #ffffff; color: #000000;" />
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>