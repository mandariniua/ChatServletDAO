<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Start chat</title>
</head>
<body>
<div>
	<form action="LoginUsersServlet" method="post">
	<p>Login</br><input type="text" name="userName"> </p></br>
	<p>Password</br><input type="text" name="userPass"> </p></br>
	<input class="add" type="submit"/>
	</form>
	
	</br><a href ="add.jsp">Registered</a>
</div>
</body>
</html>
