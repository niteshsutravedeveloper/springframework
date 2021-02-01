<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Patient Detail</title>
</head>
<body>
<h1 align="center">patient details</h1><br>
<h1>patient details</h1>

<table>
<tr>
<th>pid</th>
<th>pname</th>
<th>phone_number</th>
<th>gender</th>
<th>address</th>
</tr>
<c:set var="patientdto" value="${requestScope.patient}" ></c:set>
<tr>
<td>${patientdto.pid} </td>
<td>${patientdto.pname}</td>
<td>${patientdto.phoneNumber}</td>
<td>${patientdto.gender} </td>
<td>${patientdto.address} </td>
</tr>


</table>
</body>
</html>