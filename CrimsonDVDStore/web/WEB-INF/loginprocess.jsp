<%@page import="dvdrental.FilmDAO"%>  
<jsp:useBean id="obj" class="dvdrental.Customer"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
boolean status=FilmDAO.validate(obj);  
if(status){  
out.println("You are successfully logged in");  
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Sorry, email or password error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  
