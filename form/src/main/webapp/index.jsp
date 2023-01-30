<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<h1>Send details of fav person</h1>
	<form action="fav" method="post">
		<pre>
FirstName<input type="text" name="fName" />
LastName<input type="text" name="lName" />
Gender Female<input type="radio" name="gender" value="Female" />
Male<input type="radio" name="gender" value="Male" />
other<input type="radio" name="gender" value="other" />
Reason<input type="text" name="reason" />
Address<input type="text" name="address" />
<input type="submit" value="Send" />
</pre>
	</form>
</body>
</html>