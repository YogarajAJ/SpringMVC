<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
	
<title>Registration</title>
</head>
<body>
	<div class="container">
		<h4>Register</h4>
		<form:form modelAttribute="customer" action="/registerProcess">

			<table>
				<tbody>

					<tr>
						<td><label>First_Name</label></td>
						<td><label>:</label></td>
						<td>
							<div>
								<form:input cssClass="form-control" placeholder="First Name "
									path="first_name" />
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
									path="email" />
							</div>
						</td>

					</tr>

					<tr>
						<td><label>Password </label></td>
						<td><label>:</label></td>
						<td>
							<div>
								<form:input type="password" cssClass="form-control" placeholder="Password"
									path="password" />
							</div>
						</td>
					</tr>

					<tr>
						<td><label>Contact  </label></td>
						<td><label>:</label></td>
						<td>
							<div>
								<form:input cssClass="form-control" placeholder="Mobile Number"
									path="contact_number" />
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