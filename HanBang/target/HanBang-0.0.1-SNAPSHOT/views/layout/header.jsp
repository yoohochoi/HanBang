<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<c:set var="memberType" value="manager"/>
<c:set var="memberType" value="provider"/>
<c:set var="memberType" value="user"/>

<a href="#header" class="skip">본문바로가기</a>

<header id="header">
	<div class="clear">
		<h1><a href="${ctx}/index.jsp">한방</a></h1>
		<c:choose>
			<c:when test="${memberType eq 'manager'}">
				<nav class="memberMenu clear">
					<h2 class="hide">회원 메뉴</h2>
					<a href="${ctx}/memberList.do">회원 관리</a>
					<a href="${ctx}/shareHouseList.do">하우스 찾기</a>
					<ul>
						<li><a href="${ctx}/logout.do">로그아웃</a></li>
					</ul>
				</nav>
				<ul class="gnb clear">
					<li><a href="${ctx}/providerList.do">사업자</a></li>
					<li><a href="${ctx}/userList.do">일반 회원</a></li>
				</ul>
			</c:when>
			<c:when test="${memberType eq 'provider'}">
				<nav class="memberMenu clear">
					<h2 class="hide">회원 메뉴</h2>
					<a href="${ctx}/shareHouseList.do">하우스 찾기</a>
					<ul>
						<li><a href="${ctx}/logout.do">로그아웃</a></li>
					</ul>
				</nav>
				<ul class="gnb clear">
					<li><a href="${ctx}/profile.do">내 프로필</a></li>
					<li><a href="${ctx}/myHouseList.do">마이하우스</a></li>
					<li><a href="${ctx}/questionList.do">문의 내역</a></li>
				</ul>
			</c:when>
			<c:when test="${memberType eq 'user'}">
				<nav class="memberMenu clear">
					<h2 class="hide">회원 메뉴</h2>
					<a href="${ctx}/shareHouseList.do">하우스 찾기</a>
					<ul>
						<li><a href="${ctx}/logout.do">로그아웃</a></li>
					</ul>
				</nav> 
				<ul class="gnb clear">
					<li><a href="${ctx}/profile.do">내 프로필</a></li>
					<li><a href="${ctx}/myInterestHouseList.do">관심하우스</a></li>
					<li><a href="${ctx}/questionList.do">문의 내역</a></li>
				</ul>
			</c:when>
			<c:otherwise>
				<nav class="memberMenu clear">
					<h2 class="hide">회원 메뉴</h2>
					<a href="${ctx}/shareHouseList.do">하우스 찾기</a>
					<ul>
						<li><a href="${ctx}/login.jsp">로그인</a></li>
						<li><a href="${ctx}/memberJoin.jsp">회원 가입</a></li>
					</ul>
				</nav>
			</c:otherwise>
		</c:choose>
	</div>
</header>
