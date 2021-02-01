<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>doctors-list</title>
</head>
<body>
<h1 align="center">ALL-DOCTORS-LIST</h1>
<table border="">
<tr>
<th>doctor_id</th>
<th>doctor_name</th>
<th>doctor_specialists</th>
<th>get Details</th>
</tr>
<c:forEach items="${doctorslist}" var="listdoctor">
  <tr>
     <td>${listdoctor.doctorId}</td>
     <td>${listdoctor.doctorName}<td>
     <td>${listdoctor.specialists}</td>
     <td><a href="${listdoctor.doctorId}/getdoctor.htm">clickhere</td>
     </tr>
     
     </c:forEach>

</table>
</body>
</html>