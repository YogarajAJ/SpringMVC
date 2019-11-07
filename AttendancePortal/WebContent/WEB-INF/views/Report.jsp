<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<title>Reports</title>
</head>
<body>
	<div class="container">
		<form action="${pageContext.request.contextPath}/">
			<table style="text-align:center;" class="table table-lg">
				<tbody>
					<tr>
						<th>Employee ID</th>
						<th>In Time</th>
						<th>Out Time</th>
					</tr>
					<c:forEach items="${list}" var="data">

						<tr>
							<td>${data.id}</td>
							<td>${data.in_time}</td>
							<td>${data.out_time}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<button class="btn btn-lg btn-secondary">Go To Home</button>
		</form>
	</div>
</body>
</html>