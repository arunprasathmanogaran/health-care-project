<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Patient Registration</title>
</head>
<body>
<h2>New Patient Registration</h2>
<br>
<form action="savepatient" method="post">
<pre>

           First Name:<input type="text" name="fname"/>

           Last Name:<input type="text" name="lname"/>

           Email:<input type="text" name="email"/>

           Mobile:<input type="text" name="mobile"/>
           
           B Group:<input type="text" name="bgroup"/>
           
           Age:<input type="text" name="age"/>
           

                        <input type="submit" value="Register Patient"/>


</pre>
</form>
</body>
</html>