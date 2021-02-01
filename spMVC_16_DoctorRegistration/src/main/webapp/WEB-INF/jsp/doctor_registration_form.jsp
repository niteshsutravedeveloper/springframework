<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration_form</title>
</head>
<body>
	<h1 align="center">DOCTOR REGISTRATION FORM</h1>
	<br>
	<form action="/spMVC_16_DoctorRegistration/savedoctor.htm" method="post">
		<table>
			<tr>

				<td>enter doctor name</td>
				<td><input type="text" name="doctorName"></td>

			</tr>
			<tr>
				<td>enter age</td>
				<td><input type="text" name="age"></td>

			</tr>
			<tr>
				<td>select specialist</td>
				<td><select name="specialist" >
						<option>---select----</option>
						<option value="cardiology">cardiology</option>
						<option value="phsiotheraphy">phsiotheraphy</option>
						<option value="dermithology">dermithology</option>
						<option value="homeopathy">homeopathy</option>
				</select></td>
			</tr>
			<tr>
				<td>enter experience</td>
				<td><input type="text" name="experience"></td>

			</tr>
			<tr>
				<td>enter phone-number</td>
				<td><input type="text" name="phoneNumber"></td>

			</tr>
			<tr>
				<td>enter address</td>
				<td><input type="text" name="address"></td>

			</tr>

		</table>
<input type="submit" value="enter">
	</form>

</body>
</html>