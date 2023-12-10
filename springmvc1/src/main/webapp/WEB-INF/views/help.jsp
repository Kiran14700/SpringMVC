<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is help page</title>

<%
String name=(String) request.getAttribute("name");
Integer rollno=(Integer) request.getAttribute("rollno");
LocalDateTime now=(LocalDateTime)request.getAttribute("now");

LocalTime time=(LocalTime)request.getAttribute("time");
LocalDate date=(LocalDate)request.getAttribute("date");

%>

<h3>My name is :<%=name %></h3>
<h3>My rollno is :<%=rollno %></h3>
<h3> Date And Time is :<%=now %></h3>
<h3> Date  is :<%=date %></h3>
<h3> Time is :<%=time %></h3>



<h3>This is help page</h3>
</head>
<body>

</body>
</html>