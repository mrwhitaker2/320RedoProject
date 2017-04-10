<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose/dtd">
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="index.jsp" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Login Page!</title>
    <link rel="stylesheet" type="text/css" href="login.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

</head>

<div class="login-page">        
    <script type="text/javascript">
        function register() {
            $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
        }
        ;
        function signIn() {
            $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
        }
        ;
    </script>

   <%
        String browse_msg = (String) request.getAttribute("browse_msg");
        if (browse_msg != null) {
            out.print(browse_msg);
        }
        String login_msg = (String) request.getAttribute("login_msg");
        if (login_msg != null) {
            out.print(login_msg);
        }
    %>    

    <div class="form">
        <form class="register-form" method="POST" action='FilmController'>
            <input type="radio" name="store" value="<c:out value="${customer.store}" />" checked>
            Store 1
            <input type="radio" name="store" value="<c:out value="${customer.store}" />">Store 2
            <input type="text" name="username" placeholder="Username" 
                   value="<c:out value="${customer.username}" />" required/>
            <input type="password" name = "password" placeholder="password" minlength="8" 
                   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
                   title="Must contain at least one number and one uppercase and lowercase letter, 
                   and at least 8 or more characters" value="<c:out value="${customer.password}" />"
                   required/>
            <input type="email" name="email" placeholder="Email" 
                   value="<c:out value="${customer.email}" />"required/>
            <input type="text" name="moviePref" placeholder="Movie Preference" 
                   value="<c:out value="${customer.customerPref}" />"required/>
            <button type="submit">create</button>
            <p class="message">Already registered? <a href="#" onclick="signIn()">Sign In</a></p>
        </form>

        <form class="login-form" method="POST" action='loginprocess.jsp'>
            <input type="text" name = "username" autocomplete="on" placeholder="Username" 
                   value="<c:out value="${customer.username}" />" required />
            <input type="password" name ="password" placeholder="password" minlength="8" 
                   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
                   title="Must contain at least one number and one uppercase and lowercase letter, 
                   and at least 8 or more characters"  value="<c:out value="${customer.password}" />"
                   required/>
            <button type="submit">login</button>
            <p class="message">Not registered? <a href="#" onclick="register()">Create an account</a></p>
            <p class="message"> Manager or Staff?<a href="#">Click Here</a></p>
        </form>
    </div>
</div>


