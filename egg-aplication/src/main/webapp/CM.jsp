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
	<h1>Welcome to CM Page</h1>

	<form action="cm" method="post" class="form-control-lg">
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label"> Name</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="name">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Select
					Party</label>
			</div>
			<div class="col-auto">
				<select class="form-select" aria-label="Default select example"
					name="party">
					<option selected>Select party</option>
					<option value="Egg masala">BJP</option>
					<option value="Egg Rice">Congress</option>
					<option value="Egg chilli">JDS</option>
				</select>
			</div>
		</div>

		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Select
					State</label>
			</div>
			<div class="col-auto">
				<select class="form-select" aria-label="Default select example"
					name="state">
					<option selected>Select state</option>
					<option value="Nati">Karnataka</option>
					<option value="Farm">Kerala</option>
					<option value="Broiler">Manipur</option>
					<option value="Nati">Tamil Nadu</option>
					<option value="Farm">Goa</option>
					<option value="Broiler">Bihar</option>

				</select>
			</div>
		</div>


		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Select
					Tenure</label>
			</div>
			<div class="col-auto">
				<select class="form-select" aria-label="Default select example"
					name="tenure">
					<option selected>Select tenure</option>
					<option value="Nati">1</option>
					<option value="Farm">2</option>
					<option value="Broiler">3</option>
					<option value="Nati">4</option>
					<option value="Farm">5</option>
				</select>
			</div>
		</div>


		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Portfolio
				</label>
			</div>
			<div class="col-auto">
				<textarea class="form-control" id="floatingTextarea2"
					name="portfolio"></textarea>

			</div>
		</div>

<input type="submit" value="Send" class="btn btn-primary" />


	</form>


</body>
</html>