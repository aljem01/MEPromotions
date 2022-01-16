<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Cordinators</title>
</head>
<body>
Assign Cordinators Below: <br/>
<label for="agents">Choose Campaign Material:</label>

<select name="campaign" id="campaign">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>

<label for="areas">Choose Cordinator:</label>

<select name="cord" id="cord">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>

<input type = "submit" value = "Assign">
</body>
</html>