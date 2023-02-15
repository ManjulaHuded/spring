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
			<a href="index.jsp">Home</a>
		</div>
	</nav>

	<h4>Welcome to valentine day saving..</h4>

	<c:forEach items="${error}" var="e">
		<span style="color: red;">${e.message}</span><br>
	</c:forEach>

	<form action="valentine" method="post" class="form-control-lg">
		<pre>
	Name<input type="text" name="name" value="${dto.name}"/>
	Valentine Name<input type="text" name="valentineName" value="${dto.valentineName}"/>
	
	Places<select name="place">
	<option value="">SELECT
	</option>
	<c:forEach items="${places}" var="p">
	<option value="${p}">${p}</option>
	</c:forEach>
	</select>
	
	Gifts<select name="gift">
	<option value="">SELECT</option>
	<c:forEach items="${gifts}" var="g">
	<option value="${g}">${g}</option>
	</c:forEach>
	</select>
	</pre>
		<input type="submit" value="Save" class="btn btn-success" />
	</form>


</body>
</html>