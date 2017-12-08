<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">

<head>
<meta charset="utf-8">
<title>한방</title>
<%@ include file="/views/layout/common.jsp" %>

<!-- map스크립트 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=발급받은 APP KEY를 넣으시면 됩니다."></script>
<!--  -->

</head>

<body>

<%@ include file="/views/layout/header.jsp" %>

<main class="shareHouseListMain">
<%--

데이터 확인은 이걸로 해주세요. 정상적이게 작동한다면 주석 아래에 있는 것들은 지워주세요.

	<section>
		<div class="clear">
			<div class="mapView">
				<form action="${ctx}/shareHouseList.do" method="get" class="searchBar">
					<input type="text" name="searchShareHouse" placeholder="지역명, 대학교, 지하철역을 입력해 주세요.">
					<input type="submit" name="searchShareHouseBtn" value="검색하기">
				</form>
				<!-- 지도 -->
				<div id="map"></div>
				<!--  -->
			</div>
			<div class="shareHouseList">
				<h3>[${shareHouseEA}]개의 셰어하우스</h3>
				<ul>
					<c:forEach var="shareHouse" items="${shareHouseList}" end="">
					<li>
						<a href="${ctx}/shareHouseDetail.do">
							<div>
								<h4>${shareHouse.shareHouseTitle}</h4>
								<p>${shareHouse.shareHouseGender}</p>
								<div><img src="${shareHouse.shareHouseImage}" alt="셰어하우스"></div>
							</div>
							<div>
								<span>${shareHouse.shareHouseType}</span>
								<span>${shareHouse.shareHouseRoomEA}</span>
								<span>${shareHouse.shareHouseToiletEA}</span>
								<p>${shareHouse.shareHouseDepositMonthlyRent}</p>
							</div>
						</a>
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</section>

--%>

	<section>
		<div class="clear">
			<div class="shareHouseListMapView">
				<form action="${ctx}/shareHouseList.do" method="get" class="searchBar">
					<input type="text" name="searchShareHouse" placeholder="지역명, 대학교, 지하철역을 입력해 주세요.">
					<input type="submit" name="searchShareHouseBtn" value="검색하기">
				</form>
				<!-- 지도 -->
				<div id="map"></div>
				<!--  -->
			</div>
			<div class="shareHouseList">
				<h3>개의 셰어하우스</h3>
				<ul>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
					<li>
						<a href="#a">
							<div>
								<div><img src="../resources/images/bg/bg_shareHouse01.jpg" alt="셰어하우스"></div>
								<div>
									<h4>셰어하우스 타이틀</h4>
									<p class="woman">여성전용</p>
								</div>
							</div>
							<div>
								<span>주택</span>
								<span>룸 2</span>
								<span>화장실 2</span>
								<p>보증금 / 월세</p>
							</div>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</section>
</main>

</body>
</html>