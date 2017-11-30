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
		<h3>하우스 등록</h3>
		<p>보유하신 하우스를 등록해주세요.</p>
		<form action="${ctx}/houseRegister.do" method="post">
			<div>
				<div>
					<h4>	주소</h4>
					
					<a href="http://map.daum.net/?urlX=495376&urlY=1124670&urlLevel=3&map_type=TYPE_MAP&map_hybrid=false&SHOWMARK=true" target="_blank">
						<span style="background:#000;position:absolute;width:557px;opacity:.7;filter:alpha(opacity=70);color:#fff;overflow:hidden;font:12px/1.5 Dotum, '돋움', sans-serif;text-decoration:none;padding:7px 0px 0px 10px; height: 24px;">지도를 클릭하시면 위치정보를 확인하실 수 있습니다.</span>
						<img width="565" height="308" src="http://map2.daum.net/map/mapservice?MX=495376&MY=1124670&SCALE=2.5&IW=565&IH=308&COORDSTM=WCONGNAMUL" style="border:1px solid #ccc">
					</a>
					<input type="text" name="address" placeholder="주소">
					<!-- 지도API에서 주소 검색을 어떤 방식으로 하는지 알아 보고 html 작성하기 -->
					<a href="${ctx}/searchMap.do" target="_blank">주소 검색</a>
				</div>
				<input type="text" name="wholeArea" placeholder="전체 면적">
				<input type="number" name="rooms" placeholder="룸 개수">
				<input type="number" name="bathrooms" placeholder="화장실 개수">
				<div>
					<h4>공용 공간 옵션</h4>
					<label><input type="checkbox" name="publicUsage" value="1">CCTV</label>
					<label><input type="checkbox" name="publicUsage" value="2">와이파이</label>
					<label><input type="checkbox" name="publicUsage" value="3">인터넷</label>
					<label><input type="checkbox" name="publicUsage" value="4">거실</label>
					<label><input type="checkbox" name="publicUsage" value="5">베란다</label>
					<label><input type="checkbox" name="publicUsage" value="6">신발장</label>
					<label><input type="checkbox" name="publicUsage" value="7">TV</label>
					<label><input type="checkbox" name="publicUsage" value="8">에어컨</label>
					<label><input type="checkbox" name="publicUsage" value="9">식기건조기</label>
					<label><input type="checkbox" name="publicUsage" value="10">냉장고</label>
					<label><input type="checkbox" name="publicUsage" value="11">인덕션</label>
					<label><input type="checkbox" name="publicUsage" value="12">가스레인지</label>
					<label><input type="checkbox" name="publicUsage" value="13">전자레인지</label>
					<label><input type="checkbox" name="publicUsage" value="14">오븐</label>
					<label><input type="checkbox" name="publicUsage" value="15">조리도구</label>
					<label><input type="checkbox" name="publicUsage" value="16">토스터기</label>
					<label><input type="checkbox" name="publicUsage" value="17">전기포트</label>
					<label><input type="checkbox" name="publicUsage" value="18">정수기</label>
					<label><input type="checkbox" name="publicUsage" value="19">밥솥</label>
					<label><input type="checkbox" name="publicUsage" value="20">테이블</label>
					<label><input type="checkbox" name="publicUsage" value="21">쿠션</label>
					<label><input type="checkbox" name="publicUsage" value="22">소파</label>
					<label><input type="checkbox" name="publicUsage" value="23">의자</label>
					<label><input type="checkbox" name="publicUsage" value="24">책상</label>
					<label><input type="checkbox" name="publicUsage" value="25">책장</label>
					<label><input type="checkbox" name="publicUsage" value="26">청소기</label>
					<label><input type="checkbox" name="publicUsage" value="27">다리미</label>
					<label><input type="checkbox" name="publicUsage" value="28">세탁기</label>
					<label><input type="checkbox" name="publicUsage" value="29">분리수거함</label>
				</div>
			</div>
			<input type="submit" name="houseCreateBtn" value="등록하기">
		</form>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>