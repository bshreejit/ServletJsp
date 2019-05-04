<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addition</title>
</head>
<body>
	<h1>Addition of two numbers</h1>
	<!-- <form action="add" method="get"> -->
	<form action="directive.jsp" method="get">
		<table style="with: 50%">
			<tr>
				<td>First Number</td>
				<td><input type="text" name="num1" /></td>
			</tr>
			<tr>
				<td>Last Number</td>
				<td><input type="text" name="num2" /></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>