
<!-- Directive tag; The packages required to be imported is written inside this tag -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
			"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:f="http://xmlns.jcp.org/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=grey>
	<f:view>


		<!-- Declaration tag; code inside it it written  inside the servlet class and outside the service method of the servlet -->
		<%! 
			int p = 22; 
		%>

		<!-- Scriptlet Tag; the java code with it is written inside the service method of the servlet  -->
		<%
			/* Request object is given by jsp as default
					and are called implicit  objects*/
				int i = Integer.parseInt(request.getParameter("num1"));
				int j = Integer.parseInt(request.getParameter("num2"));
				int k = i + j;
				/* We dont even have to create object of out or PrintWriter,
				   because it is provvided by tomcat itself*/
				out.println("Output : " + k);
		%>

		<!-- Expression tag; it is an alternate of  out.println("Hello Rap god"); and this code is written inside the service method -->
		<%=
			"Hello Rap god"
		%>
		
		<%= p %>
	</f:view>
</body>
</html>