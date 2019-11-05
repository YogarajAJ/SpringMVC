<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Registration</title>
</head>
<body>
	<div style="text-align: center">
		<h4>You have not been Registered...Please Register First</h4>
		<form:form action="/register" modelAttribute="employee">

			<table style="float: center" >
				<tbody>
					<tr>
						<td><form:input path="id" cssClass="form-control" placeholder="Employee ID"
								cssStyle="width:25rem" /></td>
					</tr>
					<tr>
						<td><form:input cssClass="form-control" placeholder="First Name "
								cssStyle="width:25rem" path="first_name" /></td>
					</tr>
					<tr>
						<td><form:input cssClass="form-control" placeholder="Last Name"
								cssStyle="width:25rem" path="last_name" /></td>

					</tr>
					<tr>
						<td><form:input cssClass="form-control" placeholder="Email ID"
								cssStyle="width:25rem" path="email_id" /></td>

					</tr>
					<tr>
						<td>
							<button class="btn btn-primary">Register</button>
						</td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>