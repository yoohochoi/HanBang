<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	padding: 10% 10%;
}
</style>
</head>
<body>
	<h3>회원가입</h3>

	<br>
	<form action="memberJoin.do" method="post">
		<table class="table">
			<tr>
				<th>ID</th>
				<td><input id="loginId" name="loginId" class="form-control"
					type="text" value="" placeholder="ID를 입력해주세요."></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input id="password" name="password" class="form-control"
					type="password" value="" placeholder="비밀번호를 입력해주세요."></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input id="name" name="name" class="form-control"
					type="text" value="" placeholder="이름을 입력해주세요."></td>
			</tr>
			<tr>
				<th>phoneNumber</th>
				<td><input id="phoneNumber" name="phoneNumber" type="text"
					value=""></td>
			</tr>
			<tr>
				<th>e-mail</th>
				<td><input id="email" name="email" type="text" value="">
				</td>
			</tr>
		</table>
		<br>
		<div align="center">
			<input class="btn" type="reset" value="취소"> <input
				class="btn btn-success" type="submit" value="로그인">
		</div>
	</form>
	<br>
</body>
</html>
