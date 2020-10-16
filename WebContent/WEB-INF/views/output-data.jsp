<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Following data added to database</h1>
<table style="border:1">
			<tr>
				<td>ID</td>
				<td>${student.id}</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td>${student.firstName}</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${student.lastName}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${student.email}</td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td>${student.mobile}</td>
			</tr>
			<tr>
				<td>Course Applied for
				<td>${student.course}</td>
	</table>
</body>
</html>