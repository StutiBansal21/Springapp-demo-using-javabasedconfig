<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String errorMsg = (String)request.getAttribute("errorMsg");
if(errorMsg!=null){%>
<p><font color="red"><%= errorMsg %></font>
<%} %>

	<form action="Login" method="post">
User Name<input type="text" name="userName" id="userName"><br>
Password<input type="password" name="password" id="password"><br>
<input type="submit" value="Login">
</form>
</body>
</html>