<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">

<head>
<meta charset=utf-8">
<title>한방</title>
<link rel="stylesheet" type="text/css" href="${ctx }/resources/css/default.css">
<link rel="stylesheet" type="text/css" href="${ctx }/resources/css/style.css">
<link rel="stylesheet" type="text/css" href="${ctx }/resources/css/styleMobile.css" media="screen and (max-width:769px)">
<link rel="stylesheet" type="text/css" href="${ctx }/resources/css/styleTablet.css" media="screen and (min-width:770px) and (max-width:1023px)">
<link rel="stylesheet" type="text/css" href="${ctx }/resources/css/index.css">
<link rel="stylesheet" type="text/css" href="${ctx }/resources/css/mobile.css" media="screen and (max-width:769px)">
<link rel="stylesheet" type="text/css" href="${ctx }/resources/css/tablet.css" media="screen and (min-width:770px) and (max-width:1023px)">
<script src="${ctx }/resources/js/jquery-3.2.1.min.js"></script>
<script src="${ctx }/resources/js/jquery-ui.js"></script>
<script src="${ctx }/resources/js/hanbangIndex.js"></script>
</head>

<body>

<c:set var="log" value="in"/>

<a href="#header" class="skip">본문바로가기</a>

<header>
	<h1><a href="${ctx }/index.jsp">한방</a></h1>
	<h2 class="hide">회원 메뉴</h2>
	<nav>
		<c:choose>
			<c:when test="${log eq 'in' }">
				<div>
					<ul>
						<li><a href="${ctx }/logout.do">로그아웃</a></li>
					</ul>
				</div>
			</c:when>
			<c:otherwise>
				<div>	
					<ul>
						<li><a href="${ctx }/login.jsp">로그인</a></li>
						<li><a href="${ctx }/memberJoin.jsp">회원 가입</a></li>
					</ul>
				</div>
			</c:otherwise>
		</c:choose>
		<div>
			<a href="${ctx }/shareHouseList.do">하우스 살펴보기</a>
			<form action="searchShareHouse.do" method="post">
				<label><input type="radio">성별 무관</label>
				<label><input type="radio">여성 전용</label>
				<label><input type="radio">남성 전용</label>
				<input type="text" placeholder="지역명, 대학교, 지하철역을 입력해 주세요.">
				<input type="submit" value="찾아보기">
			</form>
		</div>
	</nav>
</header>

<main>
	<section>
		<h3>추천 하우스</h3>
		<p>단기간 내에 바로 입주 가능한 셰어하우스</p>
		<ul>
			<c:forEach var="shareHouse" items="${shareHouseList }">
			<li>
				<a href="${ctx }/shareHouseDetail.do">
					<div>
						<h4>${shareHouse.shareHouseTitle}</h4>
						<p>${shareHouse.shareHouseGender}</p>
						<div><img src="${ctx }/${shareHouse.shareHouseImage}" alt="셰어하우스"></div>
					</div>
					<div>
						<p>${shareHouse.shareHouseAddress}</p>
						<span>${shareHouse.shareHouseType}</span>
						<span>${shareHouse.shareHouseRoomEA}</span>
						<span>${shareHouse.shareHouseToiletEA}</span>
						<p>${shareHouse.shareHouseDepositMonthlyRent}</p>
					</div>
				</a>
			</li>
			</c:forEach>
		</ul>
	</section>
</main>

<footer>
	<p class="copyright">ⓒ 2017. Hanbang All Rights Reserved</p>
	<address></address>
</footer>

</body>
</html>