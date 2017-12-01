<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">

<head>
<meta charset="utf-8">
<title>한방</title>
<%@ include file="/views/layout/common.jsp" %>
</head>

<body>

<%@ include file="/views/layout/header.jsp" %>

<main>
	<section>
		<h3>셰어하우스 등록</h3>
		<form action="" method="post">
			<input type="text" name="shareHouseTitle" placeholder="제목">
			<div>
				<h4>하우스 정보</h4>
				<select name="houseList" required>
					<option selected>보유 하우스 불러오기</option>
					<option value="house"></option>
				</select>
				<!-- 지도 넣기  -->
				<!-- 하우스 추가 -->
			</div>
			<div>
				<!-- 필수 정보 넣기 -->
				<!-- 부가 정보 넣기 -->
			</div>
			<div>
				<h4>룸 정보</h4>
				<div>
					<input type="text" placeholer="">
				</div>
				<button type="button" name="roomCreateBtn">추가하기</button>
			</div>
			<textarea rows="30" cols="100"></textarea>
			<div>
				<p>하우스를 대표하는 사진을 등록해주세요.</p>
				<label><input type="file" name="uploadPhoto">사진 추가</label>
				<label><input type="file" name="uploadPhoto">사진 추가</label>
				<label><input type="file" name="uploadPhoto">사진 추가</label>
				<label><input type="file" name="uploadPhoto">사진 추가</label>
				<label><input type="file" name="uploadPhoto">사진 추가</label>
			</div>
			<input type="submit" name="shareHouseCreateBtn" value="등록하기">
		</form>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>