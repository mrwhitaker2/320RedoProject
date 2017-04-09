<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
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

    <div class="form">
        <form class="register-form">
            <input type="radio" name="store" value="<c:out value="${customer.store}" />" checked>
            Store 1
            <input type="radio" name="store" value="<c:out value="${customer.store}" />">Store 2
            <input type="text" name="fistName" placeholder="First Name" 
                   value="<c:out value="${customer.firstName}" />" required/>
            <input type="text" name="lastName" placeholder="Last Name" 
                   value="<c:out value="${customer.lastName}" />" required/>
            <input type="email" name="email" placeholder="email address" 
                   value="<c:out value="${customer.email}" />"required/>
            <input type="password" name = "password" placeholder="password" minlength="8" 
                   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
                   title="Must contain at least one number and one uppercase and lowercase letter, 
                   and at least 8 or more characters" value="<c:out value="${customer.password}" />"
                   required/>
            <button>create</button>
            <p class="message">Already registered? <a href="#" onclick="signIn()">Sign In</a></p>
        </form>

        <form class="login-form">
            <input type="email" name = "email" autocomplete="on" placeholder="email" 
                   value="<c:out value="${customer.email}" />" required />
            <input type="password" name ="password" placeholder="password" minlength="8" 
                   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
                   title="Must contain at least one number and one uppercase and lowercase letter, 
                   and at least 8 or more characters"  value="<c:out value="${customer.password}" />"
                   required/>
            <button>login</button>
            <p class="message">Not registered? <a href="#" onclick="register()">Create an account</a></p>
            <p class="message"> Manager or Staff?<a href="#">Click Here</a></p>
        </form>
    </div>
</div>


