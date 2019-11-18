<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div class="container">
		<form:form action="/blockProcess">

			<h4>Block / Unblock your Card !!!</h4>
				<p>
					<button>Block / Unblock Card</button> [Note : Go to Card Details to know the Status]
				</p>
		</form:form>
	</div>
</body>
</html>