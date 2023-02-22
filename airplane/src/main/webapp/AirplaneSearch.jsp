<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">

			<img
				src="https://w7.pngwing.com/pngs/499/882/png-transparent-delhi-air-india-limited-airline-logo-others-thumbnail.png"
				height="50" width="90">
			<div class="d-flex"></div>
			<a href="index.jsp">Home</a>
		</div>
	</nav>

	<h4>Welcome to Airplane Search</h4>
	<h3>
		<span style="color: red;">${message }</span>
	</h3>

	<form action="airplaneSearch" method="get">
		<pre>
		Search By Id <input type="text" name="id" value="${dto.id }" />
		<input type="submit" value="Search" class="btn btn-secondary" />
		</pre>
	</form>
	
	<div>
	<h3>Search Results..</h3>
	Company:${dto.company }</br>
	Name:${dto.name }</br>
	Cost:${dto.cost }</br>
	Type:${dto.type }</br>
	Country:${dto.country }
	</div>
	
</body>
</html>