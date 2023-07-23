<%@page import="com.demo.test.DTO.Registration.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<h1>Welcome ${ts}</h1>
<br><br>
<a href="Login.jsp">Login here</a>
<%
StudentDTO fromdb=(StudentDTO)session.getAttribute("student");
int sid=fromdb.getSid();
%>
<br><br>
<a href="Edit.jsp?id=<%=sid %>">Edit here</a>
</body>
</html>