<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String name = (String) request.getAttribute("name"); 
	   int rollNo = (Integer) request.getAttribute("rollNo");
	%>
	<h1>Hello from Home Jsp</h1>
	<h1>Name :  <%= name %></h1>
	<h1>RollNo : <%= rollNo %></h1>
	<a href="login">Login</a>
</body>
</html>