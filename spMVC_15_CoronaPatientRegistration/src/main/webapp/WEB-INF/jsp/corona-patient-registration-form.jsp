<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
</head>
<body>
<h1 align="center">CORONA PATIENT REGISTRATION FORM</h1>
	<form action="/spMVC_15_CoronaPatientRegistration/registerpatient.htm" method="post">
		<table>
			<tr>
				<td>Enter patient name</td>
				<td><input type="text" name="patientname"></td>
			</tr>
			<tr>
				<td>Enter patient phonenumber</td>
				<td><input type="text" name="phonenumber"></td>
			<tr>
				<td>enter patient age</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>select gender</td>
				<td><input type="radio" name="gender" value="male">male <input
					type="radio" name="gender" value="female">female</td>
			</tr>
			<tr>
				<td>enter patient address</td>
				<td><input type="text" name="address"></td>
			</tr>
           <tr>
           <td><input type="submit" name="register" value="register"></td>
           <td><input type="reset" name="cancel" value="cancel"></td>
		</table>
	</form>

</body>
</html>