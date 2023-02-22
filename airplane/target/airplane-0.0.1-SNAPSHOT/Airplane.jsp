<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<form action="airplane" method="post">
	<pre>
		Company <input type="text" name="company" />
		 Name<input type="text"	name="name" /> 
			Cost<input type="text" name="cost" />
		
		Types	<select ></select>
		</pre>
	</form>
</body>
</html>