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
		<form action="${ctx}/houseRegister.do" method="POST">
			<div>
				<div>
					<h4>	주소</h4>
					
					<a href="http://map.daum.net/?urlX=495376&urlY=1124670&urlLevel=3&map_type=TYPE_MAP&map_hybrid=false&SHOWMARK=true" target="_blank">
						<span style="background:#000;position:absolute;width:557px;opacity:.7;filter:alpha(opacity=70);color:#fff;overflow:hidden;font:12px/1.5 Dotum, '돋움', sans-serif;text-decoration:none;padding:7px 0px 0px 10px; height: 24px;">지도를 클릭하시면 위치정보를 확인하실 수 있습니다.</span>
						<img width="570" height="350" src="http://map2.daum.net/map/mapservice?MX=495376&MY=1124670&SCALE=2.5&IW=565&IH=308&COORDSTM=WCONGNAMUL" style="border:1px solid #ccc">
					</a>
					<input type="text" name="address" placeholder="주소">
					<!-- 지도API에서 주소 검색을 어떤 방식으로 하는지 알아 보고 html 작성하기 -->
					<a href="${ctx}/searchMap.do" target="_blank">주소 검색하기</a>
				</div>
				<input type="text" name="houseName" placeholder="하우스 이름">
				<input type="number" name="wholeArea" placeholder="전체 면적(m2)">
				<input type="number" name="rooms" placeholder="룸 개수">
				<input type="number" name="bathrooms" placeholder="화장실 개수">
				
			</div>
			<input type="submit" name="houseCreateBtn" value="등록하기">
		</form>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>