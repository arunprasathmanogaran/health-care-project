<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Doctor Registration</title>
</head>
<body>
<h2>New Doctor Registration</h2>
<hr>
<form action="savedoctor" method="post">
<pre>

           First Name:<input type="text" name="fname"/>

           Last Name:<input type="text" name="lname"/>

           Email:<input type="text" name="email"/>

           Mobile:<input type="text" name="mobile"/>
           
           
                        <input type="submit" value="Register Doctor"/>


</pre>
</form>
</body>
</html>