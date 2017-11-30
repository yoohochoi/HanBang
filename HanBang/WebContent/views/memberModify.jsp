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
		<h3>회원 정보 수정</h3>
		<p>[${memberId}]님의 정보 입니다.</p>
		<form action="${ctx}/memberModify.do" method="get">
			<div>
				<label>아이디<input type="text" name="memberId" readonly></label>
				<label>비밀번호<input type="password" name="password"></label>
				<label>비밀번호 확인<input type="password" name="passwordCheck"></label>
			</div>
			<div>
				<label>이름<input type="text" name="memberName" readonly></label>
				<label>연락처<input type="tel" name="phoneNumber"></label>
				<label>이메일<input type="email" name="email"></label>
			</div>
			<div>
				<h4>	보유 하우스</h4>
				<ul>
					<c:forEach var="house" items="${houseList}" end="">
						<li>
							<p>${house.houseTitle}하우스</p>
							<a href="${ctx}/houseModify.do">수정</a>
							<button type="button" name="houseDeleteBtn">삭제</button>
						</li>
					</c:forEach>
				</ul>
				<a href="${ctx}/houseRegister.jsp">하우스 등록 하기</a>
			</div>
			<button type="button" name="memberDeleteBtn">회원 탈퇴</button>
			<input type="submit" name="memberModifyBtn" value="수정하기">
		</form>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>