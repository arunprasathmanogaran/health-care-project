<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Doctor</title>
</head>
<body bgcolor="green">
<h2>Update doctor</h2>
<hr>
<form action="updatedr" method="post">
<pre>

                <input type="hidden" name="id" value="${doctor1.id}"/>

           First Name:<input type="text" name="fname" value="${doctor1.fname}"/>

           Last Name:<input type="text" name="lname" value="${doctor1.lname}"/>

           Email:<input type="text" name="email" value="${doctor1.email}"/>

           Mobile:<input type="text" name="mobile" value="${doctor1.mobile}"/>
           
           
                        <input type="submit" value="Update Doctor"/>


</pre>
</form>
</body>
</html>