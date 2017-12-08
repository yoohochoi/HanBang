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
		<h3>셰어하우스 수정</h3>
		<form action="shareHouseCreate.do" method="post" class="shareHouseCreate">
			<input type="text" name="shareHouseTitle" placeholder="제목">
			<div>
				<div class="houseInfo">
					<h4>하우스</h4>
					<div class="clear">
						<div class="shareHouseCreateMapView">
							<!-- 지도 -->
							<div id="map"></div>
							<!--  -->
							<div class="clear">
								<input type="text" name="address" placeholder="주소">
								<a href="${ctx}/searchMap.do" target="_blank">주소 검색</a>
							</div>
						</div>
						<div>
							<select name="houseList" required>
								<option selected>보유 하우스 불러오기</option>
								<option value="house"></option>
							</select>
							<div>
								<label>전체 면적<input type="text" name="wholeArea"></label>
								<label>룸 개수<input type="number" name="roomEA"></label>
								<label>화장실 개수<input type="number" name="toileEA"></label>
							</div>
						</div>
					</div>
				</div>
				<div class="shareHouseInfo clear">
					<h4>하우스 정보 및 공용 공간 옵션</h4>
					<div>
						<div class="buildingType ea4 clear">
							<label>
								<input type="radio" name="buildingType">
								<span>단독주택</span>
							</label>
							<label>
								<input type="radio" name="buildingType">
								<span>빌라</span>
							</label>
							<label>
								<input type="radio" name="buildingType">
								<span>아파트</span>
							</label>
							<label>
								<input type="radio" name="buildingType">
								<span>오피스텔</span>
							</label>
						</div>
						<div class="essentialInfo ea2 clear">
							<label>
								<input type="checkbox" name="parking">
								<span>주차</span>
							</label>
							<label>
								<input type="checkbox" name="elevator">
								<span>엘리베이터</span>
							</label>
						</div>
						<div class="extraInfo ea2 clear">
		 					<label>
			 					<input type="checkbox" name="pet">
			 					<span>반려동물</span>
		 					</label>
		 					<label>
			 					<input type="checkbox" name="smoke">
			 					<span>흡연</span>
		 					</label>
						</div>
					</div>
					<div class="eaNone clear">
						<label>
							<input type="checkbox" name="cctv">
							<span>CCTV</span>
						</label>
						<label>
							<input type="checkbox" name="wifi">
							<span>와이파이</span>
						</label>
						<label>
							<input type="checkbox" name="internet">
							<span>인터넷</span>
						</label>
						<label>
							<input type="checkbox" name="livingRoom">
							<span>거실</span>
						</label>
						<label>
							<input type="checkbox" name="veranda">
							<span>베란다</span>
						</label>
						<label>
							<input type="checkbox" name="shoeRack">
							<span>신발장</span>
						</label>
						<label>
							<input type="checkbox" name="tv">
							<span>TV</span>
						</label>
						<label>
							<input type="checkbox" name="airConditioner">
							<span>에어컨</span>
						</label>
						<label>
							<input type="checkbox" name="dishDryer">
							<span>식기건조기</span>
						</label>
						<label>
							<input type="checkbox" name="refrigerator">
							<span>냉장고</span>
						</label>
						<label>
							<input type="checkbox" name="induction">
							<span>인덕션</span>
						</label>
						<label>
							<input type="checkbox" name="gasStove">
							<span>가스레인지</span>
						</label>
						<label>
							<input type="checkbox" name="microwave">
							<span>전자레인지</span>
						</label>
						<label>
							<input type="checkbox" name="oven">
							<span>오븐</span>
						</label>
						<label>
							<input type="checkbox" name="cookware">
							<span>조리도구</span>
						</label>
						<label>
							<input type="checkbox" name="toasters">
							<span>토스터기</span>
						</label>
						<label>
							<input type="checkbox" name="electricPot">
							<span>전기포트</span>
						</label>
						<label>
							<input type="checkbox" name="waterPurifier">
							<span>정수기</span>
						</label>
						<label>
							<input type="checkbox" name="riceCooker">
							<span>밥솥</span>
						</label>
						<label>
							<input type="checkbox" name="desk">
							<span>테이블</span>
						</label>
						<label>
							<input type="checkbox" name="cushion">
							<span>쿠션</span>
						</label>
						<label>
							<input type="checkbox" name="sofa">
							<span>소파</span>
						</label>
						<label>
							<input type="checkbox" name="chair">
							<span>의자</span>
						</label>
						<label>
							<input type="checkbox" name="table">
							<span>책상</span>
						</label>
						<label>
							<input type="checkbox" name="bookcase">
							<span>책장</span>
						</label>
						<label>
							<input type="checkbox" name="vacuum">
							<span>청소기</span>
						</label>
						<label>
							<input type="checkbox" name="iron">
							<span>다리미</span>
						</label>
						<label>
							<input type="checkbox" name="washer">
							<span>세탁기</span>
						</label>
						<label>
							<input type="checkbox" name="recycleBin">
							<span>분리수거함</span>
						</label>
					</div>
				</div>
				<div class="roomInfo">
					<h4>룸 정보</h4>
					<div>
						<div class="ea3 clear">
							<label>
								<input type="radio" name="shareHouseGender">
								<span>성별 무관</span>
							</label>
							<label>
								<input type="radio" name="shareHouseGender">
								<span>여성 전용</span>
							</label>
							<label>
								<input type="radio" name="shareHouseGender">
								<span>남성 전용</span>
							</label>
						</div>
						<div class="clear">
							<div>
								<label>룸 크기<input type="text" name="roomSize"></label>
								<label>보증금<input type="text" name="deposit"></label>
								<label>월세<input type="text" name="monthlyRent"></label>
							</div>
							<div class="roomOption clear">
								<label>
									<input type="checkbox" name="roomAirConditioner">
									<span>에어컨</span>
								</label>
								<label>
									<input type="checkbox" name="roomDesk">
									<span>책상</span>
								</label>
								<label>
									<input type="checkbox" name="roomChair">
									<span>의자</span>
								</label>
								<label>
									<input type="checkbox" name="roomStand">
									<span>스탠드</span>
								</label>
								<label>
									<input type="checkbox" name="roomBed">
									<span>침대</span>
								</label>
								<label>
									<input type="checkbox" name="roomDrawer">
									<span>서랍장</span>
								</label>
								<label>
									<input type="checkbox" name="roomStorage">
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
				<p>하우스 대표 사진</p>
				<label><input type="file" name="uploadPhoto"></label>
				<label><input type="file" name="uploadPhoto"></label>
				<label><input type="file" name="uploadPhoto"></label>
				<label><input type="file" name="uploadPhoto"></label>
				<label><input type="file" name="uploadPhoto"></label>
			</div>
			<input type="submit" name="shareHouseCreateBtn" value="수정하기">
		</form>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>