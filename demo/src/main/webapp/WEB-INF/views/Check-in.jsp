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
<title>Check out</title>
</head>
<body>

		<form:form action="/checkout" method="POST"
			modelAttribute="checkinModel">

			<table style="float:center">
				<tbody>
					<tr>
						<td><form:input placeholder="Employee ID"
								cssClass="form-control" cssStyle="width:25rem" path="id" /></td>
						<td>
							<button type="submit" class="btn btn-success">Check
								IN</button>
						</td>
					</tr>
				</tbody>
			</table>


		</form:form>
</body>
</html>