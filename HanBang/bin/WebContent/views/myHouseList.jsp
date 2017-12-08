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

<c:set var="myHouse" value="null"/>
<c:set var="myHouse" value="value"/>

<%@ include file="/views/layout/header.jsp" %>

<main>
	<section>
		<h3>마이하우스</h3>
		<form action="${ctx}/myHouseDelete.do" method="get">
			<ul>
				<c:if test="${myHouse eq 'value'}">
					<c:forEach var="myHouse" items="${myHouseList}" end="">
						<li>
							<input type="checkbox" id="myHouseDelete" name="myHouseDelete">
							<label class="hide" for="myHouseDelete">마이하우스 삭제</label>
							<a href="${ctx}/shareHouseDetail.do">
								<h4>${myHouse.shareHouseTitle}</h4>
								<span>${myHouse.shareHouseType}</span>
								<span>${myHouse.shareHouseRoomEA}</span>
								<span>${myHouse.shareHouseToiletEA}</span>
								<p>${myHouse.shareHouseAddress}</p>
								<p>${myHouse.shareHouseGender}</p>
								<p>${myHouse.shareHouseDepositMonthlyRent}</p>
							</a>
						</li>
					</c:forEach>
				</c:if>
				<c:if test="${myHouse eq 'null'}">
					<li>등록된 셰어하우스가 없습니다.</li>
				</c:if>
			</ul>
			<input type="submit" name="myHouseDeleteBtn" value="삭제">
		</form>
		<div>
			<p>무료로 셰어하우스를 등록해 보세요.</p>
			<a href="${ctx}/shareHouseCreate.jsp">셰어하우스 등록하기</a>
		</div>
	</section>	
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>