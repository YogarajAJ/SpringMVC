<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<div>
		<form:form action="/register" modelAttribute="employee">
			<form:input path="id"/> <br>
			<form:input path="first_name"/> <br>
			<form:input path="last_name"/> <br>
			<form:input path="email_id"/> <br>
			<form:button>Register</form:button>
		</form:form>
	</div>
</body>
</html>