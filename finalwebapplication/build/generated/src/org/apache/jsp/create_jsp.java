package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.libvirt.LibvirtException;
import org.libvirt.Connect;
import form.domains;
import form.host;
import form.storage;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"fadedtab.css\" />\n");
      out.write("<title>XEN</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\t\n");
      out.write("        <div id=\"header\">\n");
      out.write("        \t<div class=\"logo\"></div>\n");
      out.write("            <h1>Mobile Virtual Manager</h1>\n");
      out.write("\t\t\t<h2>Manage Your Virtual Machines Remotely </h2>\n");
      out.write("        </div>\n");
      out.write("<div id=\"bottomContent\">\n");
      out.write("\t<div class=\"navColumn\"> \n");
      out.write("    \t\n");
      out.write("    \t<div class=\"link\"><a href=\"mainpage.jsp\">HOME</a></div>\n");
      out.write("        <div class=\"link\"><a href=\"#\">CREATE</a></div>\n");
      out.write("        <div class=\"link\"><a href=\"control.jsp\">DOMAIN</a></div>\n");
      out.write("        <div class=\"link\"><a href=\"info.jsp\">INFORAMTION</a></div>\n");
      out.write("        \n");
      out.write("<div id=\"navBottom\"></div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"contentColumn\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--Start Content Box (use one of the simple ones below -->\n");
      out.write("  \t<!--  To make a new content box, copy and paste from the Start to End, and paste it below this one.. you can create as many as you like. -->\n");
      out.write("      <div class=\"contentTop\"></div>\n");
      out.write("      <div class=\"contentMain\"> \n");
      out.write("            <h1>Create New Virtual Machine</h1>\n");
      out.write("<br />                  \n");
      out.write("                 \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <form method=\"post\">\n");
      out.write("                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                                <tr>\n");
      out.write("<br />  \n");
      out.write("                                    <td>Name of Domain: </td>\n");
      out.write("                                        <td><input type=\"text\" name=\"name\" \n");
      out.write("                                                   id=\"name\"\n");
      out.write(" size=\"20\"/></td>\n");
      out.write("                                        \n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                 <tr>\n");
      out.write("                                    <br />  \n");
      out.write("                                     <td>Domain Memory: </td>\n");
      out.write("                                        <td><input type=\"text\" name=\"memory\" id=\"memory\"\n");
      out.write(" size=\"20\"/></td>\n");
      out.write("                                        \n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                 <tr>\n");
      out.write("                                     <br />  \n");
      out.write("                                     <td>Domain CPU: </td>\n");
      out.write("                                        <td><input type=\"text\" name=\"cpu\"\n");
      out.write(" size=\"20\"/></td>\n");
      out.write("                                        \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                        \n");
      out.write("                                    <br />   \n");
      out.write("                                    <td><input type=\"submit\" name=\"submit\" />\n");
      out.write("<input type=\"reset\" name=\"B2\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                        </table>\n");
      out.write("                </form>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    \n");
      out.write("     <div class=\"contentBottom\"></div>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("   \t<!--End Content Box -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        ");
 Connect conn = null;
		int flags = 0;
                String name = request.getParameter("name");
                String memory = request.getParameter("memory");

                

		try {
			
			
			conn = new Connect("qemu:///system", false);
                        
                         
			domains d=new domains();
                        //d.domain(conn);
                        
                            


                        d.create(conn,name,memory);
                        //d.migrate(conn);
		} catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());

			return;
		}
        
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
