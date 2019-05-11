
<!-- JSTL Function Tags-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- For core tags-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- For Sql tags -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<!-- For Jstl Function tags -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Function Tags</title>
</head>
<body>
	<!-- Assigning a string -->
	<c:set var="str" value="Nepal is a beautiful country"></c:set>

	<!-- TO find the length of the variable "var" -->
	length : ${fn:length(str)}
<br/>
		<%= "-----------------------------------------" %><br/>

	<!-- Breaking(Splitting) a string whenever there's a string -->
	<!-- But it will break i the form of array: in this case arr[1];0 and 1-->
	<!-- So using enhanched loop -->
	
	<!-- Spliting on the basis of ' ' i.e space -->
	<c:forEach items="${fn:split(str,' ')}" var="s">
		<br>
		${s}
	</c:forEach><br/>
	
		<%= "-----------------------------------------" %><br/>
	
	<!-- Spliting on the basis of 'a' i.e space -->
	<c:forEach items="${fn:split(str,'a')}" var="p">
		<br>
		${p}  
	</c:forEach><br/>
		<%= "-----------------------------------------" %><br/>	
		
	<!-- Finding the index number of that particular string using indexOf tag -->
	INDEX: ${fn:indexOf(str, "is")}<br/>
		<%= "-----------------------------------------" %><br/>	
		
	<!-- Contains function -->	
	IS there: ${fn:contains(str,"beautiful")}<br/>
		<%= "-----------------------------------------" %><br/>	
	
	<!-- Also can use if statements -->
	<c:if test="${fn:contains(str,'beautiful')}">
		Beautiful is present in the given String.
	</c:if><br/>
		<%= "-----------------------------------------" %><br/>	
		
	<!-- endsWith function -->
	<c:if test="${fn:endsWith(str,'country')}">
		Yes, it ends with country
	</c:if><br/>
		<%= "-----------------------------------------" %><br/>		
		
</body>
</html>