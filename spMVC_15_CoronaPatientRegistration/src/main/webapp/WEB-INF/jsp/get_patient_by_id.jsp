<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search patient</title>
</head>
<body>
<h1 align="center">SEARCH PATIENT BY ID</h1>
<form action="/spMVC_15_CoronaPatientRegistration/getPatient.htm" method="get">
enter patient id::<input  type="text" name="pid" ><br>
<input type="submit" value="get"> &nbsp;&nbsp;<input type="reset" value="cancel">
</form>
</body>
</html>