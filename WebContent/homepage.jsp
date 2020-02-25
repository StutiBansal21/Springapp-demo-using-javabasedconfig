<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%
String userName= request.getParameter("userName");

%>
<p><font color="blue">Welcome <%= userName %></font></p>
<form action="Logout" method="get">
<input type="submit value="Logout">
</form>
</body>
</html>