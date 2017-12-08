<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="ko">

<head>
<meta charset=utf-8">
<title>한방</title>
<%@ include file="/views/layout/common.jsp"%>
</head>

<body>

	<%@ include file="/views/layout/header.jsp"%>

	<main>
	<section>
		<h3>문의 내역</h3>
		<ul>
			<li><span>셰어하우스 제목</span> <span>문의 날짜</span> <span>작성자</span></li>
			<c:forEach items="${questionList}" var="question">
				<li>
					<div>
						<span>${question.phoneNumber}</span> <span>${question.questionDate}</span>
						<span>${question.writerId}</span>
					</div>
					<div>
						<div>
							<p>연락처 : ${question.phoneNumber}</p>
							<p>방문 가능 날짜 : ${question.schedule}</p>
						</div>
						<div>
							<article>
								<p>${question.questionContent}</p>
								<p>${question.questionDate}</p>
								<span>${question.writerId}</span>
							</article>
							<c:forEach var="questionAndAnswer" items="questionAndAnswerList">
							</c:forEach>
							<form action="${ctx}/questionAndAnswerCreate.do" method="post">
								<textarea rows="20" cols="50"></textarea>
								<input type="submit" value="등록"> <input type="button"
									value="취소">
							</form>
						</div>
					</div>
				</li>
			</c:forEach>
		</ul>
	</section>
	</main>

	<%@ include file="/views/layout/footer.jsp"%>

</body>
</html>