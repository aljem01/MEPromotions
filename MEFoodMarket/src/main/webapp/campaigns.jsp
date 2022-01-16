<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Campaigns</title>
</head>
<body>
<form action="Campaigns" method = "post">
Register New Campaign : <input type = "text" name = "campaign"/> 
<input type = "submit" value = "Register Campaign"/><br/>

</form>

<table border = "1">
<tr>
<th>Campaign ID</th>
<th>Campaign Name</th>
<th>Action</th>
</tr>
<tr>
<td> </td>
<td> </td>
<td> </td>
</tr>
</table>
</body>
</html>