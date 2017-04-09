package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Search Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form name=\"myform\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <h1>Search for a film here:</h1>\r\n");
      out.write("                        <select id=\"DropDownList1\" name=\"search\" >\r\n");
      out.write("                            <option value=\"\">Select...\r\n");
      out.write("                            <option value=\"1\">Category/Genre\r\n");
      out.write("                            <option value=\"2\">Actor Name\r\n");
      out.write("                            <option value=\"3\">Rating\r\n");
      out.write("                        </select> \r\n");
      out.write("\r\n");
      out.write("                        <select id=\"DropDownList2\" name=\"genreSearch\" >\r\n");
      out.write("                            <option value=\"\">Select a Genre...\r\n");
      out.write("                            <option value=\"1\">Action \r\n");
      out.write("                            <option value=\"2\">Animation\r\n");
      out.write("                            <option value=\"3\">Children\r\n");
      out.write("                            <option value=\"4\">Classics\r\n");
      out.write("                            <option value=\"5\">Comedy\r\n");
      out.write("                            <option value=\"6\">Documentary\r\n");
      out.write("                            <option value=\"7\">Drama\r\n");
      out.write("                            <option value=\"8\">Family\r\n");
      out.write("                            <option value=\"9\">Foreign\r\n");
      out.write("                            <option value=\"10\">Games\r\n");
      out.write("                            <option value=\"11\">Horror\r\n");
      out.write("                            <option value=\"12\">Music\r\n");
      out.write("                            <option value=\"13\">New\r\n");
      out.write("                            <option value=\"14\">Sci-Fi\r\n");
      out.write("                            <option value=\"15\">Sports\r\n");
      out.write("                            <option value=\"16\">Travel\r\n");
      out.write("                        </select> \r\n");
      out.write("                        <select id=\"DropDownList3\" name=\"actorSearch\" >\r\n");
      out.write("                            <option value=\"\">Select an Actor...\r\n");
      out.write("                            <option value=\"1\">Akroyd \r\n");
      out.write("                            <option value=\"2\">Astaire\r\n");
      out.write("                            <option value=\"3\">Bailey\r\n");
      out.write("                            <option value=\"4\">Barrymore\r\n");
      out.write("                            <option value=\"5\">Bergen\r\n");
      out.write("                            <option value=\"6\">Berry\r\n");
      out.write("                            <option value=\"7\">Bloom\r\n");
      out.write("                            <option value=\"8\">Bolger\r\n");
      out.write("                            <option value=\"9\">Bridges\r\n");
      out.write("                            <option value=\"10\">Brody\r\n");
      out.write("                            <option value=\"11\">Cage\r\n");
      out.write("                            <option value=\"12\">Chaplin\r\n");
      out.write("                            <option value=\"13\">Chase\r\n");
      out.write("                            <option value=\"14\">Costner\r\n");
      out.write("                            <option value=\"15\">Crawford\r\n");
      out.write("                            <option value=\"16\">Cronyn\r\n");
      out.write("                            <option value=\"17\">Cruise\r\n");
      out.write("                            <option value=\"18\">Cruz\r\n");
      out.write("                            <option value=\"19\">Damon\r\n");
      out.write("                            <option value=\"20\">Davis\r\n");
      out.write("                            <option value=\"21\">Day-Lewis\r\n");
      out.write("                            <option value=\"22\">Dean\r\n");
      out.write("                            <option value=\"23\">Degeneres\r\n");
      out.write("                            <option value=\"24\">Depp\r\n");
      out.write("                            <option value=\"25\">Dukakis\r\n");
      out.write("                            <option value=\"26\">Fawcett\r\n");
      out.write("                            <option value=\"27\">Gable\r\n");
      out.write("                            <option value=\"28\">Goldberg\r\n");
      out.write("                            <option value=\"29\">Grant\r\n");
      out.write("                            <option value=\"30\">Guiness\r\n");
      out.write("                            <option value=\"31\">Hackman\r\n");
      out.write("                            <option value=\"32\">Harris\r\n");
      out.write("                            <option value=\"33\">Hawke\r\n");
      out.write("                            <option value=\"34\">Hoffman\r\n");
      out.write("                            <option value=\"35\">Hopkins\r\n");
      out.write("                            <option value=\"36\">Hudson \r\n");
      out.write("                            <option value=\"37\">Hunt \r\n");
      out.write("                            <option value=\"38\">Johansson \r\n");
      out.write("                            <option value=\"39\">Jolie \r\n");
      out.write("                            <option value=\"40\">Jovovich \r\n");
      out.write("                            <option value=\"41\">Keitel \r\n");
      out.write("                            <option value=\"42\">Kilmer \r\n");
      out.write("                            <option value=\"43\">Lollobrigida \r\n");
      out.write("                            <option value=\"44\">Marx \r\n");
      out.write("                            <option value=\"45\">Mcconaughey \r\n");
      out.write("                            <option value=\"46\">Mckellen \r\n");
      out.write("                            <option value=\"47\">Mcqueen \r\n");
      out.write("                            <option value=\"48\">Miranda \r\n");
      out.write("                            <option value=\"49\">Mostel \r\n");
      out.write("                            <option value=\"50\">Neeson \r\n");
      out.write("                            <option value=\"51\">Nicholson \r\n");
      out.write("                            <option value=\"52\">Olivier \r\n");
      out.write("                            <option value=\"53\">Paltrow \r\n");
      out.write("                            <option value=\"54\">Peck \r\n");
      out.write("                            <option value=\"55\">Penn \r\n");
      out.write("                            <option value=\"56\">Pesci\r\n");
      out.write("                            <option value=\"57\">Phoenix\r\n");
      out.write("                            <option value=\"58\">Pinkett\r\n");
      out.write("                            <option value=\"59\">Pitt\r\n");
      out.write("                            <option value=\"60\">Posey\r\n");
      out.write("                            <option value=\"61\">Presley\r\n");
      out.write("                            <option value=\"62\">Sinatra\r\n");
      out.write("                            <option value=\"63\">Sobieski\r\n");
      out.write("                            <option value=\"64\">Stallone\r\n");
      out.write("                            <option value=\"65\">Streep\r\n");
      out.write("                            <option value=\"66\">Swank\r\n");
      out.write("                            <option value=\"67\">Tandy\r\n");
      out.write("                            <option value=\"68\">Tautou\r\n");
      out.write("                            <option value=\"69\">Temple\r\n");
      out.write("                            <option value=\"70\">Torn\r\n");
      out.write("                            <option value=\"71\">Tracy\r\n");
      out.write("                            <option value=\"72\">Voight\r\n");
      out.write("                            <option value=\"73\">Wahlberg\r\n");
      out.write("                            <option value=\"74\">Wayne\r\n");
      out.write("                            <option value=\"75\">Williams\r\n");
      out.write("                            <option value=\"76\">Willis\r\n");
      out.write("                            <option value=\"77\">Winslet\r\n");
      out.write("                            <option value=\"78\">Wood\r\n");
      out.write("                            <option value=\"79\">Wray\r\n");
      out.write("                            <option value=\"80\">Zellweger\r\n");
      out.write("                        </select>  \r\n");
      out.write("                        \r\n");
      out.write("                        <select id=\"DropDownList4\" name=\"ratingSearch\" >\r\n");
      out.write("                            <option value=\"\">Select a Rating...\r\n");
      out.write("                            <option value=\"1\">G \r\n");
      out.write("                            <option value=\"2\">PG\r\n");
      out.write("                            <option value=\"3\">PG-13\r\n");
      out.write("                            <option value=\"4\">R\r\n");
      out.write("                            <option value=\"5\">NC-17                   \r\n");
      out.write("                        </select>   \r\n");
      out.write("                        <input type=\"submit\" value=\"Search\" name=\"search_btn\">  \r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
