<%-- 
    Document   : login
    Created on : Apr 9, 2017, 12:16:15 PM
    Author     : mrwhi
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

    <head>
        <title>Login Page!</title>
        <link rel="stylesheet" type="text/css" href="login.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

    </head>
    <body>
        <h1>Welcome to Crimson Video Store!</h1> <br>
        <br>
         <form method="POST" action='FilmController' name="frmCustomerLogIn">
            Username : <input type="text" required name="username"
                             value="<c:out value="${customer.username}" />" /> <br /> 
            Password : <input type="number" required min="8" name="password"
                             value="<c:out value="${customer.password}" />" /> <br />  <input
                             type="submit" value="Submit" /> <br>
            <br>
            
            <p><a href="FilmController?action=insert">Create an Account</a></p>
            <p><a href="FilmController?action=getemployee">Manager Sign-In</a></p>
            
            
    </body>
</html>
