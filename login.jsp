<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="home" method="post">
		Enter username:<input type="text" name="name"><br>
		<br> Enter password:<input type="password" name="passwd"><br>
		<br> <input type="submit" value="submit">
	</form>
	<div style="color: red">${error }</div>

	
</body>
</html>