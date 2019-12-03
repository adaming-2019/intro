<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>dashboard</title>
	
	<!-- bootstrap link -->
	<link rel="stylesheet" href="<c:url value = '/resources/css/bootstrap.css'/>">

</head>



<body>
	<!-- header inclusion -->
	<%@ include file="../templates/header.html" %>
	
	
	<h1>Dashboard</h1>

	<!-- footer inclusion -->
	<%@ include file="../templates/footer.jsp" %>
	
</body>
</html>