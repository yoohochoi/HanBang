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
		<h3>후기</h3>
		<div>
			<article>
				<h4>${review.reviewTitle}</h4>
				<div>
					<p>${review.reviewRedactor}</p>
					<p>${review.reviewDate}</p>
				</div>
				<img src="${review.reviewPhoto}" alt="">
				<p>${review.reviewContent}</p>
			</article>
			<c:forEach var="answer" items="answerList">
				<div class="request">
					<p>${answer.answerRedactor}</p>
					<span>${answer.answerDate}</span>
					<p>${answer.answerContent}</p>
					<button>답변</button>
					<form action="${ctx}/answerCreate.do" method="post">
						<textarea rows="20" cols="50"></textarea>
						<input type="submit" value="등록">
						<input type="button" value="취소">
					</form>
				</div>
			</c:forEach>
			<form action="${ctx}/answerCreate.do" method="post">
				<textarea rows="20" cols="50"></textarea>
				<input type="submit" value="등록">
				<input type="button" value="취소">
			</form>
		</div>
	</section>
</main>

<%@ include file="/views/layout/footer.jsp" %>

</body>
</html>