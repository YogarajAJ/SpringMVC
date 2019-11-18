<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Card Detais</title>
</head>
<body>
	<div class="container">
		<h4>
			Welcome <span> ${first_name } ${last_name}</span>
		</h4>
		
		<table style="text-align: center;border: 2px solid black">
			<thead>
				<tr>
					<th>Customer Id</th>
					<th>Card Number</th>
					<th> <span>Expiry <br>Month / Year</span></th>
					<th>Card Type</th>
					<th>PIN</th>
					<th>Blocked Status</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${customer_id}</td>
					<td>${card.card_number}</td>
					<td>${card.exp_month} / ${card.exp_year }</td>
					<td>${card.card_type}</td>
					<td>${card.pin}</td>
					<td>${card.blocked_status}</td>					
				</tr>
			</tbody>
		</table>
		
		<a href="/home">Home</a>
	</div>
</body>
</html>