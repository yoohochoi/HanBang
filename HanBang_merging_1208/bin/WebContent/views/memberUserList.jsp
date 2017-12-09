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
		<h3>일반 회원</h3>
		<div class="listHead">
			<span>일반 회원 ID</span> <span> 후기 갯수 / 신고 횟수</span> <span> 자동 삭제
				후기 횟수</span>
		</div>
		<div class="detail">
			<c:forEach var="user" items="${members }">
				<div>
					<div>
						<span>${user.id}</span>
					</div>
				</div>
				<div>
					<div>
						<h4>[${user.id}]님의 정보</h4>
						<ul>
							<c:forEach var="review" items="${reviews }">
								<li><a href="${ctx}/reviewDetail.do"> <span>${review.title}</span>
										<span>${review.date}</span>
								</a></li>

							</c:forEach>

						</ul>
						<a href="${ctx}/adminFindMember.do?memberId=${user.id}">[${user.id}]님의
							정보 더보기</a> <a href="${ctx }/removeMember.do?memberId=${user.id }">
							<button type="button" name="userDeleteBtn">삭제</button>
						</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
	</main>

	<%@ include file="/views/layout/footer.jsp"%>

</body>
</html>