<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">

<head>
<meta charset=utf-8">
<title>한방</title>
<%@ include file="/views/layout/common.jsp" %>
</head>

<body>

<%@ include file="/views/layout/header.jsp" %>

<main>
	<section>
		<h3>문의 등록</h3>
		<form action="${ctx}/questionCreate.do" method="post">
			<div>
				<h4>${shareHouseTitle}</h4>
				<label>방문 가능 날짜<input type="date" name="visitDate"></label>
				<input type="tel" name="phoneNumber" placeholder="연락처">
				<textarea rows="30" cols="100"></textarea>
			</div>
			<input type="submit" name="questionCreateBtn" value="문의하기">
		</form>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>