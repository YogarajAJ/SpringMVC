<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
	
<title>Details</title>
</head>
<body>
<div class="container" >
	<form action="${pageContext.request.contextPath}/homePage">
		<table style="text-align:center;" class="table table-lg">
			<tbody>
				<tr>
					<th>Employee ID</th>
					<th>In Time</th>
					<th>Out Time</th>
				</tr>
				<tr>
					<td>${data.id}</td>
					<td>${data.in_time}</td>
					<td>${data.out_time}</td>
				</tr>
				<tr>
				<td><button class="btn btn-md btn-secondary">Go To Home</button></td>
				<td><a href="${pageContext.request.contextPath}/allDetails"><b>View All Employee Details<b></b></a></td>
				</tr>
			</tbody>
		</table>
		
	</form>
	
	
</div>
</body>
</html>