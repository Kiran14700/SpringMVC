<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>     
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is help page</title>

</head>
<body>
<%
/*
// not need to write this length code
// by the help of $ expression tag

String name=(String) request.getAttribute("name");
Integer rollno=(Integer) request.getAttribute("rollno");
LocalDateTime now=(LocalDateTime)request.getAttribute("now");

LocalTime time=(LocalTime)request.getAttribute("time");
LocalDate date=(LocalDate)request.getAttribute("date");
-->
*/
%>



<!-- use tag isELIgnored to show this tag on page -->
<h3>${name }</h3>
<h3>${rollno }</h3>
<h3>${date }</h3>
<h3>${time }</h3>


<!-- use this JSTL to print list values in eachloop -->
<c:forEach var="item" items="${marks }">    

<!-- we have two method to print values in iterator -->

<c:out value="item"></c:out> 
<h1>${item }</h1>
 
 
</c:forEach>



<h3>This is help page</h3>
</body>
</html>