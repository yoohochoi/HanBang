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
		<form action="${ctx}/shareHouseList.do" method="get">
			<input type="search" name="searchShareHouse" placeholder="search">
			<input type="submit" value="검색하기">
		</form>
		<div>
			<a href="http://map.daum.net/?urlX=495376&urlY=1124670&urlLevel=3&map_type=TYPE_MAP&map_hybrid=false&SHOWMARK=true" target="_blank">
				<span style="background:#000; position:absolute; width:557px; opacity:.7; filter:alpha(opacity=70); color:#fff; overflow:hidden; font:12px/1.5 Dotum, '돋움', sans-serif; text-decoration:none; padding:7px 0px 0px 10px; height: 24px;">지도를 클릭하시면 위치정보를 확인하실 수 있습니다.</span>
				<img width="565" height="308" src="http://map2.daum.net/map/mapservice?MX=495376&MY=1124670&SCALE=2.5&IW=565&IH=308&COORDSTM=WCONGNAMUL" style="border:1px solid #ccc">
			</a>
		</div>
		<div>
			<h3>[1]개의 셰어하우스</h3>
			<ul>
				<c:forEach var="shareHouse" items="${list.shareHouse}">
				<li>
					<a href="${ctx}/shareHouseDetail.do">
						<div>
							<h4>${shareHouse.title}</h4>
							<p>${shareHouse.shareHouseId}</p>
							<div><img src="${ctx}/${shareHouse.photo}" alt="셰어하우스"></div>
						</div>
						<div>
						</div>
					</a>
				</li>
				</c:forEach>
			</ul>
		</div>
	</section>
</main>

<main>
	<section>
		<form action="${ctx}/shareHousefList.do" method="get">
			<input type="search" name="searchShareHouse" placeholder="search">
			<input type="submit" value="검색하기">
		</form>
		
		<div id="map" class="map"></div>
		<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=발급받은 APP KEY를 넣으시면 됩니다."></script>
		<script>
			var container = document.getElementById('map');
			var options = {
				center: new daum.maps.LatLng(33.450701, 126.570667),
				level: 3
			};
	
			var map = new daum.maps.Map(container, options);
		</script>
		
		<div>
			<h3>[${shareHouseEA}]개의 셰어하우스</h3>
			<ul>
				<c:forEach var="shareHouse" items="${shareHouseList}" end="">
				<li>
					<a href="${ctx}/shareHouseDetail.do">
						<div>
							<h4>${shareHouse.shareHouseTitle}</h4>
							<p>${shareHouse.shareHouseGender}</p>
							<div><img src="${ctx}/${shareHouse.shareHouseImage}" alt="셰어하우스"></div>
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
		</div>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>