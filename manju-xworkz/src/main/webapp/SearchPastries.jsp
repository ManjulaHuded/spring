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
				src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="48" width="80">
			<div class="d-flex"></div>
			<a href="index.jsp">Home</a>
		</div>
	</nav>

	<h4>Welcome to Pastries Search page..</h4>
	
	<h3>
	<span style="color:red;">${message }</span>
	</h3>
	
	<form action="search" method="get">
	Search By Id<input type="text" name="id"/>
	<input type="submit" value="Search" class="btn btn-dark"/>
	</form>
	
	<div>
	<h3>Search Result..</h3>
	<pre>
	Name:${dto.name }
	Color:${dto.color }
	Price:${dto.price }
	Type:${dto.type }
	Flavour:${dto.flavour }
	</pre>
	</div>
	
	</body>
</html>