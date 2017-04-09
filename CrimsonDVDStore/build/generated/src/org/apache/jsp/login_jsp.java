package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Login Page!</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"login.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<div class=\"login-page\">        \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function register() {\r\n");
      out.write("            $('form').animate({height: \"toggle\", opacity: \"toggle\"}, \"slow\");\r\n");
      out.write("        }\r\n");
      out.write("        ;\r\n");
      out.write("        function signIn() {\r\n");
      out.write("            $('form').animate({height: \"toggle\", opacity: \"toggle\"}, \"slow\");\r\n");
      out.write("        }\r\n");
      out.write("        ;\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form\">\r\n");
      out.write("        <form class=\"register-form\">\r\n");
      out.write("            <input type=\"radio\" name=\"store\" value=\"1\" checked>Store 1\r\n");
      out.write("            <input type=\"radio\" name=\"store\" value=\"2\">Store 2\r\n");
      out.write("            <input type=\"text\" name=\"fistName\" placeholder=\"First Name\" required/>\r\n");
      out.write("            <input type=\"text\" name=\"lastName\" placeholder=\"Last Name\" required/>\r\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"email address\" required/>\r\n");
      out.write("            <input type=\"password\" name = \"password\" placeholder=\"password\" minlength=\"8\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" required/>\r\n");
      out.write("            <button>create</button>\r\n");
      out.write("            <p class=\"message\">Already registered? <a href=\"#\" onclick=\"signIn()\">Sign In</a></p>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form class=\"login-form\">\r\n");
      out.write("            <input type=\"email\" name = \"email\" autocomplete=\"on\" placeholder=\"email\" required />\r\n");
      out.write("            <input type=\"password\" name =\"password\" placeholder=\"password\" minlength=\"8\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" required/>\r\n");
      out.write("            <button>login</button>\r\n");
      out.write("            <p class=\"message\">Not registered? <a href=\"#\" onclick=\"register()\">Create an account</a></p>\r\n");
      out.write("            <p class=\"message\"> Manager or Staff?<a href=\"#\">Click Here</a></p>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
