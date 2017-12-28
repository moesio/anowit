<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%-- 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
--%>
<html>
<head>
<title><sitemesh:write property='title'></sitemesh:write></title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/menu.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webjars/datatables/1.9.4/media/css/jquery.dataTables_themeroller.css"/>

<sitemesh:write property='head'></sitemesh:write>
</head>
<body>
	<header>
		<h1><a href="${pageContext.request.contextPath}"><spring:message code="app.name"/></a></h1>
		<nav id="menu">
		<ul>
			<li><a href="#"><spring:message code="app.menu.register"/></a>
				<ul>
					<li><a href="${pageContext.request.contextPath}/privilege/grid"><spring:message code="app.menu.register.privilege"/></a></li>
					<li><a href="${pageContext.request.contextPath}/group/grid/0/10"><spring:message code="app.menu.register.group"/></a></li>
					<li><a href="${pageContext.request.contextPath}/person/grid"><spring:message code="app.menu.register.person"/></a></li>
				</ul>
			</li>
			<li><a href="#"><spring:message code="app.menu.apresentation"/></a>
				<ul>
					<li><a href="${pageContext.request.contextPath}/counselPoint/grid"><spring:message code="app.menu.apresentation.counselPoint"/></a></li>
					<li><a href="${pageContext.request.contextPath}/assignmentKind/grid"><spring:message code="app.menu.apresentation.assignmentKind"/></a></li>
				</ul>
			</li>
		</ul>
		</nav> <nav id="breadcrumb"> <a href="#"><spring:message code="app.breadcrumb.home"/></a></nav>
	</header>
	
	<section id="main">
		<h2> <sitemesh:write property='title'></sitemesh:write> </h2>
		<hr>
		<sitemesh:write property='body'></sitemesh:write>
	</section>
	
	<footer>
		<p>Free Software</p>
	</footer>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.1.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ui-bootstrap-0.11.0.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/webjars/datatables/1.9.4/media/js/jquery.dataTables.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/app.js"></script>
</body>
</html>
