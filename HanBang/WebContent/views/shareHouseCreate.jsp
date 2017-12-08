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
		<form action="/registShareHouse.do" method="POST" enctype="multipart/form-data">
			<input type="text" name="shareHouseTitle" placeholder="제목">
			<div>
				<div>
					<h4>하우스 정보</h4>
					<select name="houseList" required>
						<option selected>보유 하우스 불러오기</option>
						<c:forEach var="house" items="${houses}">
							<option value="${house.houseName }">
								<c:if test="${houseList == house.houseName }">selected</c:if>>${house.houseName }</option>
						</c:forEach>
					</select>
					<div>
						<div>
							<div id="map" style="width: 100%; height: 250px;"></div>
							<h4>주소</h4>
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
						<div>
							<input type="text" name="houseName" placeholder="하우스 이름">
							<input type="number" name="wholeArea" placeholder="전체 면적(m^2)">
							<input type="number" name="rooms" placeholder="룸 개수"> <input
								type="number" name="bathrooms" placeholder="화장실 개수">
						</div>
					</div>
					<div class="buildingType">
						<label><input type="radio" name="buildingType">주택</label>
						<label><input type="radio" name="buildingType">아파트</label>
						<label><input type="radio" name="buildingType">오피스텔</label>
					</div>
					<div class="essentialInfo">
						<label><input type="checkbox" name="parking">주차</label> <label><input
							type="checkbox" name="lift">엘리베이터</label>
					</div>
					<div class="extraInfo">
						<label><input type="checkbox" name="pet">반려동물</label> <label><input
							type="checkbox" name="smoke">흡연</label>
					</div>
					<div>
						<h4>공용 공간 옵션</h4>
						<label><input type="checkbox" name="publicUsage"
							value="cctv">CCTV</label> <label><input type="checkbox"
							name="publicUsage" value="wifi">와이파이</label> <label><input
							type="checkbox" name="publicUsage" value="internet">인터넷</label> <label><input
							type="checkbox" name="publicUsage" value="livingRoom">거실</label>
						<label><input type="checkbox" name="publicUsage"
							value="veranda">베란다</label> <label><input type="checkbox"
							name="publicUsage" value="shoeRack">신발장</label> <label><input
							type="checkbox" name="publicUsage" value="tv">TV</label> <label><input
							type="checkbox" name="publicUsage" value="airConditioner">에어컨</label>
						<label><input type="checkbox" name="publicUsage"
							value="dishDryer">식기건조기</label> <label><input
							type="checkbox" name="publicUsage" value="refrigerator">냉장고</label>
						<label><input type="checkbox" name="publicUsage"
							value="induction">인덕션</label> <label><input
							type="checkbox" name="publicUsage" value="gasStove">가스레인지</label>
						<label><input type="checkbox" name="publicUsage"
							value="microwave">전자레인지</label> <label><input
							type="checkbox" name="publicUsage" value="oven">오븐</label> <label><input
							type="checkbox" name="publicUsage" value="cookware">조리도구</label>
						<label><input type="checkbox" name="publicUsage"
							value="toasters">토스터기</label> <label><input
							type="checkbox" name="publicUsage" value="electricPot">전기포트</label>
						<label><input type="checkbox" name="publicUsage"
							value="waterPurifier">정수기</label> <label><input
							type="checkbox" name="publicUsage" value="riceCooker">밥솥</label>
						<label><input type="checkbox" name="publicUsage"
							value="table">테이블</label> <label><input type="checkbox"
							name="publicUsage" value="cushion">쿠션</label> <label><input
							type="checkbox" name="publicUsage" value="sofa">소파</label> <label><input
							type="checkbox" name="publicUsage" value="chair">의자</label> <label><input
							type="checkbox" name="publicUsage" value="desk">책상</label> <label><input
							type="checkbox" name="publicUsage" value="bookcase">책장</label> <label><input
							type="checkbox" name="publicUsage" value="vacuum">청소기</label> <label><input
							type="checkbox" name="publicUsage" value="iron">다리미</label> <label><input
							type="checkbox" name="publicUsage" value="washer">세탁기</label> <label><input
							type="checkbox" name="publicUsage" value="recycleBin">분리수거함</label>
					</div>
				</div>
			</div>
			<div>
				<div>
					<h4>룸 정보</h4>
					<div>
						<div class="shareHouseGender shareHouseGenderType">
							<label> <input type="radio" name="sex"> <span>성별
									무관</span>
							</label> <label> <input type="radio" name="sex"> <span>여성
									전용</span>
							</label> <label> <input type="radio" name="sex"> <span>남성
									전용</span>
							</label>
						</div>
						<label>룸 크기<input type="text" name="roomArea"></label>
						<div>
							<label>보증금<input type="text" name="deposit"></label> <label>월세<input
								type="text" name="monthlyFee"></label>
						</div>
						<div class="roomOption">
							<label><input type="checkbox" name="providedGood">에어컨</label>
							<label><input type="checkbox" name="providedGood">책상</label>
							<label><input type="checkbox" name="providedGood">의자</label>
							<label><input type="checkbox" name="providedGood">스탠드</label>
							<label><input type="checkbox" name="providedGood">침대</label>
							<label><input type="checkbox" name="providedGood">서랍장</label>
							<label><input type="checkbox" name="providedGood">수납함</label>
						</div>
					</div>
				</div>
				<button type="button" name="roomCreateBtn">추가하기</button>
			</div>
			<textarea rows="30" cols="100"></textarea>
			<div>
				<p>하우스를 대표하는 사진을 등록해주세요.</p>
				<label><input type="file" name="photos" multiple="multiple">사진 추가</label>
			</div>
			<input type="submit" name="shareHouseCreateBtn" value="등록하기">
		</form>
	</section>
	</main>

	<%@ include file="/views/layout/footer.jsp"%>

</body>
</html>