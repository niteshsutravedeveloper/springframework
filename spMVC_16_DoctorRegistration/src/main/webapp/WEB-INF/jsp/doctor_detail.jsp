<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>doctor_detail</title>
</head>
<body>
<h1 align="center">DETAILS OF DOCTOR</h1>
doctor_id=${doctor.doctorId}
doctor_name=${doctor.doctorName}
doctor_specialist=${doctor.specialists}
doctor_address=${doctor.address}
doctor_age=${doctor.age}
doctor_phonenumber=${doctor.phoneNumber}
doctor_experience=${doctor.experience}
</body>
</html>