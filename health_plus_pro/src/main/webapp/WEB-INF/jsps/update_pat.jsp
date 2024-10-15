<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Patient</title>
</head>
<body bgcolor="blue">
<h2>Update Patient</h2>
<br>
<form action="updatepatient" method="post">
<pre>

           <input type="hidden" name="id" value="${patient1.id}"/>

           First Name:<input type="text" name="fname" value="${patient1.fname}"/>

           Last Name:<input type="text" name="lname" value="${patient1.lname}"/>

           Email:<input type="text" name="email" value="${patient1.email}"/>

           Mobile:<input type="text" name="mobile" value="${patient1.mobile}"/>
           
           B Group:<input type="text" name="bgroup" value="${patient1.bgroup}"/>
           
           Age:<input type="text" name="age" value="${patient1.age}"/>
           

                        <input type="submit" value="Update Patient"/>


</pre>
</form>
</body>
</html>