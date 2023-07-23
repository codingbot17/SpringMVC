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
<%
int id=Integer.parseInt(request.getParameter("id"));
StudentDTO fromdb=(StudentDTO)session.getAttribute("student");
%>
<h1>Update Registration</h1>
<form action="update.do" method="post"><br>
Student Id : <input type="number" name="sid" value="<%=fromdb.getSid()%>" disabled="disabled"><br><br>
Student Name : <input type="text" name="sname" value="<%=fromdb.getSname()%>"><br><br>
Student Address : <input type="text" name="saddress" value="<%=fromdb.getSaddress()%>"><br><br>
Course :<select name="scourse" value="<%=fromdb.getScourse()%>"><br><br>
<option value="Btech">Btech</option>
<option value="Bcom">Bcom</option>
<option value="BBA">BBA</option>
<option value="BCA">BCA</option>
</select><br><br>
Place : <input type="text" name="splace" value="<%=fromdb.getSplace()%>"><br><br>
Age : <input type="number" name="sage" value="<%=fromdb.getSage()%>"><br><br>
Email : <input type="email" name="semail" value="<%=fromdb.getSemail()%>"><br><br>
Password : <input type="password" name="spass" value="<%=fromdb.getSpass()%>"><br><br>
<input type="submit" value="Update"><br><br>
</body>
</html>