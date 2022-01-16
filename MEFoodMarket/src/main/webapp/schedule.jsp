<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Schedule</title>
</head>
<body>
Prepare Schedule For Approved Promotion Below: <br>
<label for="agents">Choose an Approved Promotion:</label>

<select name="cars" id="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
<br>
Time: <input type = "time" name = "time"><br>
<label for="agents">Choose Area:</label>

<select name="cars" id="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
<br>
Date: <input type = "date" name = "date"><br>
<input type = "submit" value = "Submit Schedule"/>
</body>
</html>