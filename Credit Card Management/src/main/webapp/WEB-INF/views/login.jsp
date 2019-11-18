<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div class="container">
		<h4>Login</h4>
		<form:form modelAttribute="customer" action="/loginProcess">
			<table>
				<tbody>

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
								<form:input type="password" cssClass="form-control"
									placeholder="Password" path="password" />
							</div>
						</td>
					</tr>

					<tr>
						<td></td>
						<td>
							<button class="btn btn-lg btn-secondary">Login</button>
						</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>