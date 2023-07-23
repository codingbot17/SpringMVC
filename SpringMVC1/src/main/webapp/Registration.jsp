<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration</h1>
<form action="register.do" method="post"><br>
Student Name : <input type="text" name="sname"><br><br>
Student Address : <input type="text" name="saddress"><br><br>
Course :<select name="scourse"><br><br>
<option value="Btech">Btech</option>
<option value="Bcom">Bcom</option>
<option value="BBA">BBA</option>
<option value="BCA">BCA</option>
</select><br><br>
Place : <input type="text" name="splace"><br><br>
Age : <input type="number" name="sage"><br><br>
Email : <input type="email" name="semail"><br><br>
Password : <input type="password" name="spass"><br><br>
<input type="submit" value="Register"><br><br>
</form>
</body>
</html>