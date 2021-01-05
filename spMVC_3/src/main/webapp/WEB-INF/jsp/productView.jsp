<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product details</title>
</head>
<body>
	<h1 align="center">product details</h1>
	<br>
	<table>
		<tr>
			<th>pno</th>
			<th>pname</th>
			<th>price</th>
			<th>description</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.pid}</td>
				<td>${product.pname}</td>
				<td>${product.price}</td>
				<td>${product.description}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>