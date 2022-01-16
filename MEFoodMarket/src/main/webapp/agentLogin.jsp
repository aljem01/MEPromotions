<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent Login</title>
</head>
<body>
Please Enter Your Your Agent Details Below: <br/>
<center>
	<form action="AgentLogin" method = "post">
		Username: <input type = "text" name = "agent_username"/><br/>
		Password: <input type = "text" name = "agent_password"/><br/>
		<input type = "submit" value = "LOGIN"/>
	</form>
</center>


</body>
</html>