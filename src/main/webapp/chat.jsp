<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="chat-style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chat</title>
</head>
<body>

	<div>
	<form action="MessageServlet" method="post">
	<% if(request.getAttribute("messageList") == null) {
	response.sendRedirect("MessageServlet");
	
}%>
		<div id="in">
		<p><c:forEach var="message" items="${messageList}">
		<c:out value="${message.message}"/></br>
		</c:forEach></p>
		</div>
	<input id="mess" type="text" name="message">
	</br><input type="submit"/>
	</form>
	</br>
	</div>
		<div id="out"><a href="index.jsp">Log out</a>
		</div>

</body>
</html>