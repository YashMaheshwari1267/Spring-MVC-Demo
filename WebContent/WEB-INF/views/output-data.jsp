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
	First Name : ${student.firstname}
	Last Name : ${student.lastname}
	Email : ${student.email}
	Mobile : ${student.mobile}
	Course :  ${student.course}
</body>
</html>