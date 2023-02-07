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
		</div>
	</nav>

	<form action="test">
		<input type="submit" value="Show email" />
		<h4>Email is: ${email}</h4>
	</form>

	<form action="phone">
		<input type="submit" value="Show mobile" />
		<h4>Mobile is: ${mobile}</h4>
	</form>

	<form action="id">
		<input type="submit" value="Show aadhar" />
		<h4>Aadhar is: ${aadhar}</h4>
	</form>

	<form action="age">
		<input type="submit" value="Show age" />
		<h4>Age is: ${age}</h4>
	</form>

	<form action="dob">
		<input type="submit" value="Show DOB with Time" />
		<h4>DOB with Time is: ${Dob}</h4>
	</form>

	<form action="salary">
		<input type="submit" value="Show DesiredSalary" />
		<h4>DesiredSalary is: ${DesiredSal}</h4>
	</form>

	<form action="friend">

		<input type="submit" value="Show Best FriendsName" />
		<h4>Display Best FriendsName:</h4>
		<ul>
			<c:forEach items="${best}" var="name">
				<li>${name}</li>
			</c:forEach>
		</ul>

	</form>

	<form action="place">
		<input type="submit" value="Show VisitedPlaces" />
		<h4>Display Most Visited Places:</h4>
		<ul>
			<c:forEach items="${data}" var="most">
				<li>${most}</li>
			</c:forEach>
		</ul>
	</form>

	<form action="set">
		<input type="submit" value="Show Skills">
		<h4>Display Skills:</h4>
		<ul>
			<c:forEach items="${info}" var="skills">
				<li>${skills}</li>
			</c:forEach>
		</ul>
	</form>

	<form action="eduction">
		<input type="submit" value="Show eduction" />
		<h6>Display Eduction details:</h6>
		<h6>schoolName: ${eduction.schoolName}</h6>
		<h6>schoolAddress: ${eduction.schoolAddress}</h6>
		<h6>schoolFees: ${eduction.schoolFees}</h6>
		<h6>schoolPercentage: ${eduction.schoolPercentage}</h6>
		<h6>college: ${eduction.college}</h6>
		<h6>address: ${eduction.address}</h6>
		<h6>collegeName: ${eduction.collegeName}</h6>
		<h6>collegeAddress: ${eduction.collegeAddress}</h6>
		<h6>collegeFees: ${eduction.collegeFees}</h6>
		<h6>cgpa: ${eduction.cgpa}</h6>

	</form>

	<form action="happy">
		<input type="submit" value="Show Family Details" />
		<h4>Display Family Details</h4>
		<h6>Mother name is: ${Haven.mother }</h6>
		<h6>GrandMaa name is: ${Haven.grandMaa }</h6>
		<h6>Father name is: ${Haven.father }</h6>
		<h6>Monthly Income is: ${Haven.monthlyIncome }</h6>
		<h6>No Of Childrens is: ${Haven.noOfChildrens }</h6>
		<h6>No Of Vehicle is: ${Haven.noOfVehicle }</h6>
		<h6>No Of Siblings is: ${Haven.noOfSiblings }</h6>
		<h6>Sister1 name is: ${Haven.sister1 }</h6>
		<h6>Sister2 name is: ${Haven.sister2 }</h6>
		<h6>Brother name is: ${Haven.brother }</h6>
	</form>

	<form action="cell">
		<input type="submit" value="Show Mobile" />
		<h4>Display Details of Mobile</h4>
		<h6>Device Name is:${smart.deviceName}</h6>
		<h6>Color is:${smart.color}</h6>
		<h6>Price is:${smart.price}</h6>
		<h6>Stroage is:${smart.stroage}</h6>
		<h6>Device Model Name is:${smart.deviceModel}</h6>
	</form>

	<form action="drink">
		<input type="submit" value="Bevarage" />
		<h6>Bevarage:</h6>
		<h6>brandName: ${coldDrink.brandName}</h6>
		<h6>bevarageName: ${coldDrink.bevarageName}</h6>
		<h6>mfgDate: ${coldDrink.mfgDate}</h6>
		<h6>expiryDate: ${coldDrink.expiryDate}</h6>
		<h6>price: ${coldDrink.price}</h6>
		<h6>avalaibleIn: ${coldDrink.avalaibleIn}</h6>
		<h6>milkContentInGm: ${coldDrink.milkContentInGm}</h6>
		<h6>sugarContentInGm: ${coldDrink.sugarContentInGm}</h6>
	</form>

	<form action="chat">
		<input type="submit" value="Chat Details" />
		<h6>ChatDTO</h6>
		<h6>chatShopName: ${chat.chatShopName}</h6>
		<h6>chatName: ${chat.chatName}</h6>
		<h6>noOfPiece: ${chat.noOfPiece}</h6>
		<h6>ingredient1: ${chat.ingredient1}</h6>
		<h6>ingredient2: ${chat.ingredient2}</h6>
		<h6>ingredient3: ${chat.ingredient3}</h6>
		<h6>ingredient4: ${chat.ingredient4}</h6>
		<h6>ingredient5: ${chat.ingredient5}</h6>
		<h6>ingredient6: ${chat.ingredient6}</h6>
		<h6>ingredient7: ${chat.ingredient7}</h6>
		<h6>price: ${chat.price}</h6>
	</form>

</body>
</html>