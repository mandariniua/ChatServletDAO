<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
<div>
	<form action="AddUsersServlet" method="post">
	<p>Please entered login</br><input type="text" name="userName"> </p></br>
	<p>Please entered password</br><input type="password" name="userPass"> </p></br>
	<input class="add" type="submit"/>
	</form>
</div>
</body>
</html>