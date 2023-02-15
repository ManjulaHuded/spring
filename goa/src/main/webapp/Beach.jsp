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
				height="48" width="80"></a>
			<div class="d-flex">
				<a href="index.jsp" class="form-control me-2">Home</a>
			</div>
		</div>
	</nav>
	<h2>Welcome to Goa..</h2>

	<form action="free" method="post" class="form-control-lg">

		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Name</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="name">
			</div>
		</div>

		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Location</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="location">
			</div>
		</div>

		<div>
		<label>Clean</label><br>
		<label style="margin-left: 80px">Yes</label>
		<input type="radio" value="true" class="form-check-input" name="clean"/>
		<br>
		<label style="margin-left: 80px">No</label>
		<input type="radio" value="false" class="form-check-input" name="clean"/>
		</div>
		
		<div>
		<label>Games</label><br>
		<label style="margin-left: 80px">Yes</label>
		<input type="radio" value="true" class="form-check-input" name="games"/>
		<br>
		<label style="margin-left: 80px">No</label>
		<input type="radio" value="false" class="form-check-input" name="games"/>
		</div>

		<input type="submit" value="Click to send"
			class="btn btn-outline-success" />
	</form>


</body>
</html>