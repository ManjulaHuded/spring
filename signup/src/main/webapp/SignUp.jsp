<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="100" height="48" class="d-inline-block align text-top">
				<a href="index.jsp">Home</a> <a class="navbar-brand" href="#">
		</div>

	</nav>
	<h1 style="color: green;">${message}</h1>
	<h5 style="color: red;">${messag}<br>
		<c:forEach items="${errors}" var="e">${e.message}</c:forEach>
	</h5>
		<form action="register" method="post" style="border: 1px solid #ccc">
			<div class="container" style="text-align: left;">
					<h1>Sign Up</h1>
					<p>Please fill in this form to create an account</p>
					
					<div>
						User ID <input type="text" name="userId" value="${dto.userId}" id="userName"
							onchange="ValideName()"> <span id="nameError"
							style="color: red"></span><br>
					</div>
					
					<div>
						Email<input type="email" name="email" id="emailId" value="${dto.email}"
							onchange="valideEmail()"> <span id="emailError"
							style="color: red"></span><br>
					</div>
					
					<div>
						Mobile Number<input type="number" name="mobile" id="userMobile" value="${dto.mobile}"
							onchange="ValideMobile()"> <span id="mobileError"
							style="color: red"></span> <br>
					</div>
					
					<div>
						Password<input type="password" name="password" id="userPassword" value="${dto.password}"
							onchange="ValidePassword()"> <span id="passwordError"
							style="color: red"></span> <input type="checkbox"
							onclick="myFunction()">Show Password <br>
					</div>
					
					<div>
						Confirm Password<input type="password" name="confirmPassword"
							id="userConfirmPassword" onchange="ValidePassword()"> <span
							id="passwordCompare" style="color: red"></span> <br>
					</div>
					
					<div>
						Agreement <input type="checkbox" name="agreement"
							id="agreementConfirm" onclick="onconfirm()"> <br>
					</div>
					
					<div>
						<input type="submit" value="SignUp" class="btn btn-primary"/>
					</div>
			</div>
		</form>
	<h4 style="color: red;">${password}</h4>
	<script>
		function myFunction() {
			var x = document.getElementById("userPassword");
			if (x.type === "password") {
				x.type = "text";
			} else {
				x.type = "password";
			}
		}
		function onconfirm() {
			var agree = document.getElementById('agreementConfirm');
			console.log(agree.checked);
			if (agree.checked) {
				document.getElementById('submitId').disabled = false;
			} else {
				document.getElementById('submitId').disabled = 'disabled';
			}

			function ValideName() {
				var user = document.getElementById('userName');
				var uservalue = user.value;
				console.log(uservalue);
				if (uservalue != null && uservalue != ""
						&& uservalue.length > 3 && uservalue.length < 30) {
					console.log('valide name');
					document.getElementById('nameError').innerHTML = '';
				} else {
					console.log('invalide name');
					document.getElementById('nameError').innerHTML = 'Please enter valide name min 4 and max 30 character';
				}
			}
		}
		
		function valideEmail() {
			var userEmail = document.getElementById('emailId');
			var userEmailvalue = userEmail.value;
			console.log(userEmailvalue);
			if (userEmailvalue != null && userEmailvalue != ""
					&& userEmailvalue.length > 4 && userEmailvalue.length < 40) {
				console.log('valide email');
				document.getElementById('emailError').innerHTML = '';
			} else {
				console.log('invalide email');
				document.getElementById('emailError').innerHTML = 'Plese enter valide email';
			}
			const xhttp = new XMLHttpRequest();
			console.log("Running in ajax");
			console.log(userEmailvalue);
			xhttp.open("GET", "http://localhost:8080/sahana-xworkz-cm/email/"
					+userEmailvalue);
			xhttp.send();
			
			xhttp.onload = function () {
				console.log(this);
				
				document.getElementById("display").innerHTML = this.responseText
				
			}
			
		}
		function ValideMobile() {
			var userMobile = document.getElementById('userMobile');
			var userMobilevalue = userMobile.value;
			console.log(userMobilevalue);
			if (userMobilevalue != null && userMobilevalue != ""
					&& userMobilevalue.length == 10) {
				console.log('valide mobile');
				document.getElementById('mobileError').innerHTML = '';
			} else {
				console.log('invalide mobile');
				document.getElementById('mobileError').innerHTML = 'Please enter valide Mobile Number';
			}
		}
		function ValidePassword() {
			var userPassword = document.getElementById('userPassword');
			var userConfirmPassword = document
					.getElementById('userConfirmPassword');
			var userPasswordvalue = userPassword.value;
			var userConfirmPasswordvalue = userConfirmPassword.value;
			console.log(userPasswordvalue);
			if (userPasswordvalue != null && userPasswordvalue != ""
					&& userPasswordvalue.length > 4
					&& userPasswordvalue.length < 12) {
				if (userPasswordvalue == userConfirmPasswordvalue) {
					console.log('valide both password are same');
					document.getElementById('passwordCompare').innerHTML = '';
				} else {
					console.log('valide both password are not same');
					document.getElementById('passwordCompare').innerHTML = 'Password and ConfirmPassword must be same';
				}
				console.log('valide password');
				document.getElementById('passwordError').innerHTML = '';
			} else {
				console.log('invalide password');
				document.getElementById('passwordError').innerHTML = 'Please enter valide password';
			}
		}
	</script>
</body>
</html>