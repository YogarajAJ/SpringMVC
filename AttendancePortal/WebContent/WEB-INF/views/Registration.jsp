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
	<div class="container">
		<h4>You have not been Registered...Please Register First</h4>
		<form:form action="${pageContext.request.contextPath}/register"
			modelAttribute="employee">

			<table>
				<tbody>
					<tr>
						<td><label>Employee ID </label></td>
						<td><label>:</label></td>
						<td>
							<div>
								<form:input cssClass="form-control" placeholder="Employee ID"
									path="id" />
							</div>
						</td>
					</tr>
					<tr>
						<td><label>First_Name</label></td>
						<td><label>:</label></td>
						<td>
							<div>
								<form:input cssClass="form-control"
									placeholder="First Name " path="first_name" />
							</div>
						</td>
					</tr>
					<tr>
						<td><label>Last Name </label></td>
						<td><label>:</label></td>
						<td>
							<div>
								<form:input cssClass="form-control" placeholder="Last Name"
									path="last_name" />
							</div>
						</td>
					</tr>
					<tr>
						<td><label>Email ID </label></td>
						<td><label>:</label></td>
						<td>
							<div>
								<form:input cssClass="form-control" placeholder="Email ID"
									path="email_id" />
							</div>
						</td>

					</tr>
					<tr>
						<td></td>
						<td>
							<button class="btn btn-lg btn-secondary">Register</button>
						</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>