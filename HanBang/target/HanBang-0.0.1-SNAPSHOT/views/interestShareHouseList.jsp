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

	<c:set var="interestShareHouse" value="null" />
	<c:set var="interestShareHouse" value="value" />

	<%@ include file="/views/layout/header.jsp"%>

	<main>
	<section>
		<h3>관심하우스</h3>
		<form action="${ctx}/interestShareHouseDelete.do" method="get">
			<ul>
				<c:choose>
					<c:when test="${interestShareHouses eq null}">
						<li>관심하우스로 등록된 셰어하우스가 없습니다.</li>
					</c:when>
					<c:otherwise>
						<c:forEach var="interestShareHouse"
							items="${interestShareHouses}" end="">
							<li><input type="checkbox"
								id="interestShareHouseDeleteCheck"
								name="interestShareHouseDeleteCheck"> <label
								class="hide" for="interestShareHouseDeleteCheck">셰어하우스
									삭제</label> <a href="${ctx}/shareHouseDetail.do">
									<h4>${interestShareHouse.title}</h4> <span>${interestShareHouse.shareHouseType}</span>
									<span>${interestShareHouse.rooms}</span> <span>${interestShareHouse.shareHouseToiletEA}</span>
									<p>${interestShareHouse.shareHouseAddress}</p>
									<p>${interestShareHouse.shareHouseGender}</p>
									<p>${interestShareHouse.shareHouseDepositMonthlyRent}</p>
							</a> <a href="${ctx}/questionCreate.jsp" target="_blank">하우스 방문
									문의</a></li>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</ul>
			<input type="submit" name="interestShareHouseDeleteBtn" value="삭제">
		</form>
	</section>
	</main>

	<%@ include file="/views/layout/footer.jsp"%>

</body>
</html>