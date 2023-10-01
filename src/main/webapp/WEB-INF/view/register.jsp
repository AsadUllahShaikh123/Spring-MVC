<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Page</h1>
	<h2>${success}</h2>
	<form action="createUser" method="post" >
		<div>
			<label>Full Name : </label> <input type="text" name="name" />
		</div>
		<div>
			<label>Email</label> <input type="email" name="email" />
		</div>
		<div>
			<label>Address</label> <input type="text" name="address" />
		</div>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>