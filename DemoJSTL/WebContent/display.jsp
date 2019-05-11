
<!-- JSTL Core Tag -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

<!-- Importing the tag-library of jstl -->	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DISPLAY</title>
</head>
<body>

	<%-- <%
		//String name=request.getAttribute("label");
		/* getAttrbute will return and object so: */
		String name = request.getAttribute ("label").toString();
		out.println(name);
	%> --%>

	<!-- Expression Language(EL): Alternate of above java code inside scriplet -->
	<%-- ${label}<!-- JSTL Version 1.2 -->
	<br> --%>
	<!-- Using JSTL to print, we use <out> tag but its an external 
		tag or custom tag and not an inbuilt tag of html -->
	<%-- <c:out value="Hello World" /><!-- JSTL Version 1.1 --> --%>
	
	<!-- Importing other websites in the project -->
	<%-- <c:import url="http://www.telusko.com"></c:import> --%>
	
	
	<!-- We can print the object names only without roll number i.e
	     can print single value -->
	<%-- ${student.name}<br> --%>
	
	
	<!-- But the main intention is to get a complete object rather than just one 
	of its value, for that we use toString method in the servlet -->
	<%-- ${student} <br> --%>
	
	<!-- But printing the list above way is not applicable -->
	<!-- So to print in iterative format we use forEach -->
	<c:forEach items="${student}" var="s">
		${s} <br/>
	</c:forEach>
	<br/>
	
	<%= "-----------------------------------------" %><br/>
	
	<c:forEach items="${student}" var="s">
		${s.name} <br/>
	</c:forEach>
	
	<%= "-----------------------------------------" %><br/>
	
	<c:forEach items="${student}" var="s">
		${s.rollNo} <br/>
	</c:forEach>
	
	<%= "-----------------------------------------" %><br/>
	
	
</body>
</html>