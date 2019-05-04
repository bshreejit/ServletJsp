
<!-- --------------------------------------------------------------- -->
<!-- @page directive tag -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" info="Directive Page"	isELIgnored="false" isThreadSafe="true" session="false" %>
<%-- <%@page extends="com.shreejit.cookies.AddServlet" %> --%>
	
<!-- Import is the only directive tag that can be used multiple times unlike other tags -->
<!-- Single Import -->
<%@ page import = "java.util.ArrayList" %>
<!-- Multiple Import -->
<%@ page import = " java.sql.* , java.util.Random" %>

<!-- ----------------------------------------------------------------- -->
<!-- @include directive tag -->
<%@ include file="Header.jsp" %>

<!-- ----------------------------------------------------------------- -->
<!-- @taglib directive tag -->
<%-- <%@ taglib uri = "org.apache.taglibs.standard" prefix = "mytag" %> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= "From directive " %>
</body>
</html>