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
		<h4>Home ${customer.email}</h4>
			<form:form action="/cardDetails" modelAttribute="customer" method="POST">
				<form:button>View Card Details</form:button>
			</form:form>
			<form:form action="transactions" modelAttribute="customer" method="POST">
				<form:button>View Transactions</form:button>
			</form:form>
			<form:form action="/blockCard" modelAttribute="customer" method="POST">
				<form:button>Block Card</form:button>
			</form:form>
	</div>
</body>
</html>