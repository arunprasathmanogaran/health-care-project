<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Patient</title>
</head>
<body>
<h2>List All Patient</h2>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>B Group</th>
<th>Age</th>
<th>Delete</th>
<th>Update</th>
</tr>

<c:forEach var="patients" items="${patients}">
<tr>
<td>${patients.fname}</td>
<td>${patients.lname}</td>
<td>${patients.email}</td>
<td>${patients.mobile}</td>
<td>${patients.bgroup}</td>
<td>${patients.age}</td>
<td><a href="deletepat?id=${patients.id}">delete</a></td>  
<td><a href="updatepat?id=${patients.id}">update</a></td> 

</tr>
</c:forEach>
</table>
</body>
</html>