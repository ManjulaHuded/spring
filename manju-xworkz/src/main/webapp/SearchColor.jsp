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
				src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="48" width="80">
			<div class="d-flex"></div>
			<div>
				<a href="index.jsp">Home</a>

			</div>
		</div>
	</nav>

	<h4>Welcome to Pastries Search color page..</h4>


	<form action="searchByColor" class="form-control-lg">
		 Search By Color<input type="text" name="color" /> 
		 <input type="submit" value="Search" class="btn btn-secondary" />
	</form>
	<div>

	<table class="table table-bordered border-primary">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Color</th>
			<th>Price</th>
			<th>Type</th>
			<th>Flavour</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${list }" var="p">
			<tr>
				<td>${p.id }</td>
				<td>${p.name }</td>
				<td>${p.color }</td>
				<td>${p.price }</td>
				<td>${p.type }</td>
				<td>${p.flavour }</td>
				<td><a href="update?id=${p.id }">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	



</body>
</html>