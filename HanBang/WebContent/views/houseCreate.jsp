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

	<%@ include file="/views/layout/header.jsp"%>

	<main>
	<section>
		<h3>하우스 등록</h3>
		<p>보유하신 하우스를 등록해주세요.</p>
		<form action="${ctx}/houseRegister.do" method="POST">
			<div>
				<div>
					<div id="map" style="width: 100%; height: 250px;"></div>
					<h4>주소</h4>
					<script type="text/javascript"
						src="//dapi.kakao.com/v2/maps/sdk.js?appkey=20a2231eb9d4b20ef7a68674b0d5aca3&libraries=services"></script>
					<script>
						var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
						mapOption = {
							center : new daum.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
							level : 6
						// 지도의 확대 레벨
						};

						// 지도를 생성합니다    
						var map = new daum.maps.Map(mapContainer, mapOption);

						// 주소-좌표 변환 객체를 생성합니다
						var geocoder = new daum.maps.services.Geocoder();

						// 주소로 좌표를 검색합니다
						geocoder.addressSearch('${com }', function(result,
								status) {

							// 정상적으로 검색이 완료됐으면 
							if (status === daum.maps.services.Status.OK) {

								var coords = new daum.maps.LatLng(result[0].y,
										result[0].x);

								// 결과값으로 받은 위치를 마커로 표시합니다
								var marker = new daum.maps.Marker({
									map : map,
									position : coords
								});

								// 인포윈도우로 장소에 대한 설명을 표시합니다

								// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
								map.setCenter(coords);
							}
						});
					</script>
					<input type="text" name="address" placeholder="주소">
					<!-- 지도API에서 주소 검색을 어떤 방식으로 하는지 알아 보고 html 작성하기 -->
					<a href="${ctx}/searchMap.do" target="_blank">주소 검색하기</a>
				</div>
				<input type="text" name="houseName" placeholder="하우스 이름"> <input
					type="number" name="wholeArea" placeholder="전체 면적(m2)"> <input
					type="number" name="rooms" placeholder="룸 개수"> <input
					type="number" name="bathrooms" placeholder="화장실 개수">

			</div>
			<input type="submit" name="houseCreateBtn" value="등록하기">
		</form>
	</section>
	</main>

	<%@ include file="/views/layout/footer.jsp"%>

</body>
</html>