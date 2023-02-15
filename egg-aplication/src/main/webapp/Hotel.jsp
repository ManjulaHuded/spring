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
	<h1>Welcome to Hotel</h1>

	<form action="egg" method="post" class="form-control-lg">
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Hotel
					Name</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="hotelName">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Select
					Dish</label>
			</div>
			<div class="col-auto">
				<select class="form-select" aria-label="Default select example" name="dishName">
					<option selected>Select menu</option>
					<option value="Egg masala">Egg masala</option>
					<option value="Egg Rice">Egg Rice</option>
					<option value="Egg chilli">Egg chilli</option>
					<option value="Egg burgi">Egg burgi</option>
					<option value="Egg 65">Egg 65</option>
					<option value="Omlet">Omlet</option>
					<option value="Egg burger">Egg burger</option>
				</select>
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Select
					Type</label>
			</div>
			<div class="col-auto">
				<select class="form-select" aria-label="Default select example" name="type">
					<option selected>Select type</option>
					<option value="Nati">Nati</option>
					<option value="Farm">Farm</option>
					<option value="Broiler">Broiler</option>
				</select>
			</div>
		</div>



		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Price</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="price">
			</div>
		</div>

		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="customRange2" class="form-label">Quantity</label>
			</div>
			<div class="col-auto">
				<input type="range" class="form-range" min="0" max="5"
					id="customRange2" name="quantity" />
			</div>
		</div>

		<div>
			<label>Take Away</label><br> <label style="margin-left: 80px">Yes</label>
			<input type="radio" value="true" class="form-check-input"
				name="takeAway" /> <br> <label style="margin-left: 80px">No</label>
			<input type="radio" value="false" class="form-check-input"
				name="takeAway" />
		</div>

		<input type="submit" value="Order" class="btn btn-primary" />


	</form>


</body>
</html>