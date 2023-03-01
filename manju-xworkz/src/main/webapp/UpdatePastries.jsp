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
			<a href="SearchColor.jsp">SearchColor</a>
			</div>
		</div>
	</nav>

	<h4>Welcome to Pastries Update page..</h4>
	
	<c:forEach items="${error }" var="e">
	<span style="color:red;" >${e.message}</span><br>
	</c:forEach>
	<div><span style="color:green">${message }</span></div>
	
	<form action="update" method="post" class="form-control-lg">
	<pre>
	
	    Id<input type="text" name="id" value="${dto.id }" readonly/>
		Name<input type="text" name="name"  value="${dto.name }"/> 
		Color<input type="text"name="color" value="${dto.color }"/> 
		Price<input type="text" name="price" value="${dto.price }" />
		
		Type<select name="type" >
			<option value="${dto.type }">${dto.type }</option>
			<c:forEach items="${types }" var="t">
				<option value="${t }">${t }</option>
			</c:forEach>
		</select>
		
		 Flavour<select name="flavour">
			<option value="${dto.flavour }">${dto.flavour }</option>
			<c:forEach items="${flavours }" var="f">
				<option value="${f }">${f }</option>
			</c:forEach>
		</select> 
		
		<input type="submit" value="Update"  class="btn btn-success"/>
</pre>
	</form>

</body>
</html>