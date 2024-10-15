<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Doctors</title>
</head>
<body>
<h2>List All Doctors</h2>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>
</tr>

<c:forEach var="doctors" items="${doctors}">
<tr>
<td>${doctors.fname}</td>
<td>${doctors.lname}</td>
<td>${doctors.email}</td>
<td>${doctors.mobile}</td>
<td><a href="deletedoctor?id=${doctors.id}">delete</a></td>
<td><a href="updatedoctor?id=${doctors.id}">update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>