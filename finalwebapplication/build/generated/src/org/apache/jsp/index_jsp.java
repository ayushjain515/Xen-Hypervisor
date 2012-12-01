package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.libvirt.LibvirtException;
import org.libvirt.Connect;
import form.domains;
import form.host;
import form.storage;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Creat New  </h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                                <tr>\n");
      out.write("                                        <td>Enter name: </td>\n");
      out.write("                                        <td><input type=\"text\" name=\"name\" \n");
      out.write("                                                   id=\"name\"\n");
      out.write(" size=\"20\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                        \n");
      out.write("                                </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                        <td>Enter memory: </td>\n");
      out.write("                                        <td><input type=\"text\" name=\"memory\" id=\"memory\"\n");
      out.write(" size=\"20\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                \n");
      out.write("                                </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                        <td>Enter cpu: </td>\n");
      out.write("                                        <td><input type=\"text\" name=\"cpu\"\n");
      out.write(" size=\"20\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                        <td> </td>\n");
      out.write("                                        <td><input type=\"submit\" name=\"submit\" />\n");
      out.write("<input type=\"reset\" name=\"B2\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                        </table>\n");
      out.write("                </form>\n");
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
