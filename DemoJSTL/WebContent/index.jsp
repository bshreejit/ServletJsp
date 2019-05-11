
<!-- JSTL SQL -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!-- For Sql tags -->	
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!-- For using core(forEach) tag  -->	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gadgets</title>
</head>
<body>
	<!-- Connecting to the database -->
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://127.0.0.1:3307/jdbcDemo" user="root" password="admin"/>
	
	<!-- Query -->
	<sql:query var="rs" dataSource="${db}"> select * from gadgets</sql:query>
	
	<!-- For Fetching data -->
	<!-- Using Enhanched For Loop -->
	<c:forEach items="${rs.rows}" var="gadget">
		<br><c:out value="${gadget.gid}"></c:out>:<c:out value="${gadget.gname}"></c:out>:<c:out value="${gadget.gprice}"></c:out><br/>
	</c:forEach>
	
</body>
</html>