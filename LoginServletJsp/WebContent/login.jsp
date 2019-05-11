<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="#afafaf">
	<div style="text-align: center">
		<form action="loginServlet" method="post">
			<p>LOGIN HERE</p>
			<p>
				<input type="text" name="username" placeholder="Username" />
			</p>
			<p>
				<input type="password" name="password" placeholder="Password" />
			</p>

			<p>
				<input type="Submit" value="LOGIN">
			</p>
		</form>
		<a href="login.jsp">Login</a> <a href="welcome.jsp">Welcome</a> <a
			href="videos.jsp">Videos</a>
	</div>
</body>
</html>