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

	<h4>Welcome to Airplane save data..</h4>
	<c:forEach items="${error }" var="e">
		<span style="color: red;">${e. message}</span></br>
	</c:forEach>

	<form action="airplane" method="post">
		<pre>
		Company <input type="text" name="company" value="${dto.company }" />
		 Name<input type="text" name="name" value="${dto.name }" /> 
			Cost<input type="text" name="cost" value="${dto.cost }" />
		
		Types<select name="type">
		<option value="">Select</option>
		<c:forEach items="${types }" var="t">
		<option value="${t }">${t }</option>
		</c:forEach>
		</select>
		
		Countries<select name="country">
		<option value="">Select</option>
		<c:forEach items="${countries }" var="c">
		<option value="${c }">${c }</option>
		</c:forEach>
		</select>
		</pre>
		<input type="submit" value="Save" class="btn btn-secondary" />
	</form>
</body>
</html>