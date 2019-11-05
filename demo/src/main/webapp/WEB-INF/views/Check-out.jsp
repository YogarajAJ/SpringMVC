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
	<form:form action = "/gotoHome" method="POST" modelAttribute="checkoutModel">
		<form:input path="id"/>
		<form:button>Check Out </form:button>
	</form:form>
</body>
</html>