<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h3>SOS</h3>
<%
String name=(String) request.getAttribute("name");
Integer id=(Integer) request.getAttribute("ID");

List<String> friends =(List<String>) request.getAttribute("f");
%>

<h3>
Name : <%=name %> <br><br>
ID :<%=id %>

<%

for(String s:friends){
	
out.println(s);
}
%>
</h3>
</body>
</html>