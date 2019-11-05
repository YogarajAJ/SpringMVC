<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check out</title>
</head>
<body>

<div>
	<form:form action = "/checkout" method="POST" modelAttribute="checkinModel">
		<form:input path="id"/>
		<form:button>Check IN </form:button>
	</form:form>
</div>	
</body>
</html>