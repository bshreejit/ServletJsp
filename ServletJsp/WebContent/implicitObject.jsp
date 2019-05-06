<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Error will be handled by the errorPage i.e error.jsp -->
<%@ page errorPage="error.jsp"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		//PageContext Implicit Object
		pageContext.setAttribute("name", "Shreejit", PageContext.SESSION_SCOPE);

		//ServletConfit Implicit Object
		//config.getInitParameter(arg0);

		//Exception Handling in JSP
		/* try {
			int k = 9 / 0;
		} catch (Exception e) {
			out.println("Error " + e.getMessage());
		} */

		/* Instead of above practice */
		int k = 9 / 0;
	%>
</body>
</html>