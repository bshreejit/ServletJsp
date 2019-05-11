<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>


	<div style="text-align: center">
		<!-- Embedded link from youtube -->
		<iframe width="650" height="500"
			src="https://www.youtube.com/embed/cI4ryatVkKw" frameborder="0"
			allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
			allowfullscreen></iframe>

		Welcome ${username}!!!! <br> <a href="login.jsp">Login</a> <a
			href="welcome.jsp">Welcome</a> <a href="videos.jsp">Videos</a><br>
		<form action="logoutServlet" method="post">
			<p>
				<input type="Submit" value="LOGOUT">
			</p>
		</form>
	</div>
</body>
</html>