<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>           
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Fill the student details </h1>
	<form:form action="submitInfo" >
		First Name<form:input type="text" path="firstname" placeholder="First Name"></form:input>
		Last Name<form:input type="text" path="lastname" placeholder="Last Name"></form:input>
		Email<form:input type="email" path="email" placeholder="Email"></form:input>
		Mobile Number<form:input type="text" path="mobile" placeholder="Mobile Number"></form:input>
		Course Applied for<form:select path="course" id="course_id">
			<form:option value="BE" label="B.E" />
			<form:option value="btech" label="B.Tech"/>
			<form:option value="bpharma" label="B.Pharma"/>
			<form:option value="MBA" label="MBA"/>
		</form:select>
		<input type="submit" value="Submit" />
		<input type="reset" value="Reset" />
	</form:form>
</body>
</html>