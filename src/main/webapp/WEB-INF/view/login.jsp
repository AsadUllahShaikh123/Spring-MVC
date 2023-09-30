<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String name = (String) request.getAttribute("userName"); 
	
	   String password = (String) request.getAttribute("password");
	%>
	<h1> User Name :  <%= name %></h1>
	<h2> Password  : <%= password %></h2>
	<a href="home">Go to Home </a>
	
</body>
</html>