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
		<h3>셰어하우스 등록</h3>
		<form action="${ctx }/registShareHouse.do" method="post"
			class="shareHouseCreate">
			<input type="text" name="shareHouseTitle" placeholder="제목">
			<div>
				<div class="houseInfo">
					<h4>하우스</h4>
					<div class="clear">
						<div class="shareHouseCreateMapView">
							<!-- 지도 -->
							<div id="map" style="width: 100%; height: 250px;"></div>
							<script type="text/javascript"
								src="//dapi.kakao.com/v2/maps/sdk.js?appkey=20a2231eb9d4b20ef7a68674b0d5aca3&libraries=services"></script>
							<script>
								var mapContainer = document
										.getElementById('map'), // 지도를 표시할 div 
								mapOption = {
									center : new daum.maps.LatLng(37.569,
											126.979), // 지도의 중심좌표
									level : 7
								// 지도의 확대 레벨37.541° 126.986°
								};

								// 지도를 생성합니다    
								var map = new daum.maps.Map(mapContainer,
										mapOption);

								// 주소-좌표 변환 객체를 생성합니다
								var geocoder = new daum.maps.services.Geocoder();

								// 주소로 좌표를 검색합니다
								geocoder
										.addressSearch(
												'${com }',
												function(result, status) {

													// 정상적으로 검색이 완료됐으면 
													if (status === daum.maps.services.Status.OK) {

														var coords = new daum.maps.LatLng(
																result[0].y,
																result[0].x);

														// 결과값으로 받은 위치를 마커로 표시합니다
														var marker = new daum.maps.Marker(
																{
																	map : map,
																	position : coords
																});

														// 인포윈도우로 장소에 대한 설명을 표시합니다

														// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
														map.setCenter(coords);
													}
												});
							</script>
							<!--  -->
							<input type="text" id="sample4_roadAddress" name="address"
								placeholder="도로명주소"> <input type="button"
								onclick="sample4_execDaumPostcode()" value="주소 찾기"><br>
							<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
							<script>
								function sample4_execDaumPostcode() {
									new daum.Postcode(
											{
												oncomplete : function(data) {

													var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
													var extraRoadAddr = ''; // 도로명 조합형 주소 변수

													if (data.bname !== ''
															&& /[동|로|가]$/g
																	.test(data.bname)) {
														extraRoadAddr += data.bname;
													}
													if (data.buildingName !== ''
															&& data.apartment === 'Y') {
														extraRoadAddr += (extraRoadAddr !== '' ? ', '
																+ data.buildingName
																: data.buildingName);
													}
													if (extraRoadAddr !== '') {
														extraRoadAddr = ' ('
																+ extraRoadAddr
																+ ')';
													}
													if (fullRoadAddr !== '') {
														fullRoadAddr += extraRoadAddr;
													}
													document
															.getElementById('sample4_roadAddress').value = fullRoadAddr;
												}
											}).open();
								}
							</script>
						</div>
					</div>
					<div>
						<select name="houseList" required>
							<option selected>보유 하우스 불러오기</option>
							<c:forEach var="house" items="${houses}">
								<option value="${house.houseName }"
									<c:if test="${houseList == house.houseName }">selected</c:if>>${house.houseName }</option>
							</c:forEach>
						</select>
						<div>
							<label>전체 면적<input type="text" name="wholeArea"></label>
							<label>룸 개수<input type="number" name="roomEA"></label> <label>화장실
								개수<input type="number" name="toileEA">
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="shareHouseInfo clear">
				<h4>하우스 정보 및 공용 공간 옵션</h4>
				<div>
					<div class="buildingType ea4 clear">
						<label> <input type="radio" name="buildingType"> <span>단독주택</span>
						</label> <label> <input type="radio" name="buildingType">
							<span>빌라</span>
						</label> <label> <input type="radio" name="buildingType">
							<span>아파트</span>
						</label> <label> <input type="radio" name="buildingType">
							<span>오피스텔</span>
						</label>
					</div>
					<div class="essentialInfo ea2 clear">
						<label> <input type="checkbox" name="parking"> <span>주차</span>
						</label> <label> <input type="checkbox" name="elevator"> <span>엘리베이터</span>
						</label>
					</div>
					<div class="extraInfo ea2 clear">
						<label> <input type="checkbox" name="pet"> <span>반려동물</span>
						</label> <label> <input type="checkbox" name="smoke"> <span>흡연</span>
						</label>
					</div>
				</div>
				<div class="eaNone clear">
					<label> <input type="checkbox" name="cctv"> <span>CCTV</span>
					</label> <label> <input type="checkbox" name="wifi"> <span>와이파이</span>
					</label> <label> <input type="checkbox" name="internet"> <span>인터넷</span>
					</label> <label> <input type="checkbox" name="livingRoom">
						<span>거실</span>
					</label> <label> <input type="checkbox" name="veranda"> <span>베란다</span>
					</label> <label> <input type="checkbox" name="shoeRack"> <span>신발장</span>
					</label> <label> <input type="checkbox" name="tv"> <span>TV</span>
					</label> <label> <input type="checkbox" name="airConditioner">
						<span>에어컨</span>
					</label> <label> <input type="checkbox" name="dishDryer"> <span>식기건조기</span>
					</label> <label> <input type="checkbox" name="refrigerator">
						<span>냉장고</span>
					</label> <label> <input type="checkbox" name="induction"> <span>인덕션</span>
					</label> <label> <input type="checkbox" name="gasStove"> <span>가스레인지</span>
					</label> <label> <input type="checkbox" name="microwave"> <span>전자레인지</span>
					</label> <label> <input type="checkbox" name="oven"> <span>오븐</span>
					</label> <label> <input type="checkbox" name="cookware"> <span>조리도구</span>
					</label> <label> <input type="checkbox" name="toasters"> <span>토스터기</span>
					</label> <label> <input type="checkbox" name="electricPot">
						<span>전기포트</span>
					</label> <label> <input type="checkbox" name="waterPurifier">
						<span>정수기</span>
					</label> <label> <input type="checkbox" name="riceCooker">
						<span>밥솥</span>
					</label> <label> <input type="checkbox" name="desk"> <span>테이블</span>
					</label> <label> <input type="checkbox" name="cushion"> <span>쿠션</span>
					</label> <label> <input type="checkbox" name="sofa"> <span>소파</span>
					</label> <label> <input type="checkbox" name="chair"> <span>의자</span>
					</label> <label> <input type="checkbox" name="table"> <span>책상</span>
					</label> <label> <input type="checkbox" name="bookcase"> <span>책장</span>
					</label> <label> <input type="checkbox" name="vacuum"> <span>청소기</span>
					</label> <label> <input type="checkbox" name="iron"> <span>다리미</span>
					</label> <label> <input type="checkbox" name="washer"> <span>세탁기</span>
					</label> <label> <input type="checkbox" name="recycleBin">
						<span>분리수거함</span>
					</label>
				</div>
			</div>
			<div class="roomInfo">
				<h4>룸 정보</h4>
				<div>
					<div class="ea3 clear">
						<label> <input type="radio" name="shareHouseGender">
							<span>성별 무관</span>
						</label> <label> <input type="radio" name="shareHouseGender">
							<span>여성 전용</span>
						</label> <label> <input type="radio" name="shareHouseGender">
							<span>남성 전용</span>
						</label>
					</div>
					<div class="clear">
						<div>
							<label>룸 크기<input type="text" name="roomSize"></label> <label>보증금<input
								type="text" name="deposit"></label> <label>월세<input
								type="text" name="monthlyRent"></label>
						</div>
						<div class="roomOption clear">
							<label> <input type="checkbox" name="roomAirConditioner">
								<span>에어컨</span>
							</label> <label> <input type="checkbox" name="roomDesk">
								<span>책상</span>
							</label> <label> <input type="checkbox" name="roomChair">
								<span>의자</span>
							</label> <label> <input type="checkbox" name="roomStand">
								<span>스탠드</span>
							</label> <label> <input type="checkbox" name="roomBed"> <span>침대</span>
							</label> <label> <input type="checkbox" name="roomDrawer">
								<span>서랍장</span>
							</label> <label> <input type="checkbox" name="roomStorage">
								<span>수납함</span>
							</label>
						</div>
					</div>
				</div>
				<button type="button" name="roomCreateBtn" class="roomCreateBtn">추가하기</button>
			</div>
			<textarea rows="30" cols="100" placeholder="작성해주세요"></textarea>
			</div>
			<div class="fileUpLoad">
				<p>하우스를 대표하는 사진을 등록해주세요.</p>
				<label><input type="file" name="photos" multiple="multiple"></label>
			</div>
			<input type="submit" name="shareHouseCreateBtn" value="등록하기">
		</form>
	</section>
	</main>

	<%@ include file="/views/layout/footer.jsp"%>

</body>
</html>