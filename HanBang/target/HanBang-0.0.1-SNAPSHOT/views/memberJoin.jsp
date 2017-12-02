<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="ko">

<head>
<meta charset="utf-8">
<title>한방</title>
<%@ include file="/views/layout/common.jsp"%>
</head>

<body>

	<c:set var="memberType" value="user" />
	<c:set var="memberType" value="provider" />

	<a href="#header" class="skip">본문바로가기</a>

	<header id="header" class="memberJoinHeader">
		<h1>
			<a href="${ctx}/index.jsp">한방</a>
		</h1>
		<nav>
			<h2 class="hide">회원 메뉴</h2>
			<ul>
				<li><a href="${ctx}/login.jsp">로그인</a></li>
			</ul>
		</nav>
	</header>

	<main>
	<section class="memberJoinSection">
		<h3>회원 가입</h3>
		<p>한방에 오신 것을 환영합니다.</p>
		<form action="${ctx}/memberJoin.do" method="post">
			<label><input type="radio" name="memberType" value="user">일반
				회원</label> <label><input type="radio" name="memberType"
				value="provider">사업자</label>
			<c:if test="${memberType eq '1'}">
				<div>
					<input type="text" name="memberId" placeholder="아이디"> <input
						type="password" name="password" placeholder="비밀번호"> <input
						type="password" name="passwordCheck" placeholder="비밀번호 확인">
				</div>
				<div>
					<input type="text" name="memberName" placeholder="이름"> <input
						type="tel" name="phoneNumber" placeholder="연락처"> <input
						type="email" name="email" placeholder="이메일">
				</div>
				<input type="submit" name="memberJoinBtn" value="가입하기">
			</c:if>
			<c:if test="${memberType eq '2'}">
				<div>
					<input type="text" name="memberId" placeholder="아이디"> <input
						type="password" name="password" placeholder="비밀번호"> <input
						type="password" name="passwordCheck" placeholder="비밀번호 확인">
				</div>
				<div>
					<input type="text" name="memberName" placeholder="이름"> <input
						type="tel" name="phoneNumber" placeholder="연락처"> <input
						type="email" name="email" placeholder="이메일">
				</div>
				<!-- 가입과 동시, 하우스 등록 페이지로 넘겨주기 -->
				<input type="submit" name="houseCreateBtn" value="다음">
			</c:if>
		</form>
	</section>
	</main>

	<%@ include file="/views/layout/footer.jsp"%>

</body>
</html>