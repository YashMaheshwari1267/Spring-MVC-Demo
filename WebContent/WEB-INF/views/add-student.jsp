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
	<h1>Fill the student details</h1>
	<table style="align: center">
		<form:form action="submitForm" method="POST" modelAttribute="student">
			<tr>
				<td>ID</td>
				<td><form:input type="text" path="id"
						placeholder="ID"></form:input></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input type="text" path="firstName"
						placeholder="First Name"></form:input></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input type="text" path="lastName"
						placeholder="Last Name"></form:input></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input type="email" path="email" placeholder="Email"></form:input></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><form:input type="text" path="mobile"
						placeholder="Mobile Number"></form:input></td>
			</tr>
			<tr>
				<td>Course Applied for
				<td><form:select path="course" id="course_id">
						<form:options items="${student.courseOption}" />
					</form:select></td>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset" /></td>
			</tr>
		</form:form>
	</table>
</body>
</html>