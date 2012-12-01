package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.libvirt.Domain;
import org.libvirt.LibvirtException;
import org.libvirt.Connect;
import form.domains;
import form.host;
import form.storage;

public final class domain1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Domain</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("   \n");

            Connect conn = null;
		int flags = 0;

		try {
			
			
			conn = new Connect("qemu:///system", false);
                       String s[]=conn.listDefinedDomains();
                      int j[]=conn.listDomains();
                       
      out.write("   \n");
      out.write("\n");
      out.write("                      <p1> Numbers Of InActive States </p1> ");
      out.print(s.length );
      out.write("    \n");
      out.write("                        <p1> Numbers Of Active States </p1>     ");
      out.print(j.length );
      out.write("\n");
      out.write("                            \n");
      out.write("        \n");
      out.write("        ");

                      Domain d;
                      int i,p;
                      for(i=0;i<s.length;i++)
                          {
                        d=conn.domainLookupByName(s[i]);
        
      out.write(" <p1> InActive </p1><a href=\"http://localhost:8080/finalwebapplication/pause.jsp?name=");
      out.print(d.getName() );
      out.write("\" >");
      out.print(d.getName() );
      out.write("</a>");

		}
                for(p=0;p<j.length;p++)
                          {
                        d=conn.domainLookupByID(j[p]);
                       
        
      out.write(" <p2> Active </p2><a href=\"http://localhost:8080/finalwebapplication/pause.jsp?name=");
      out.print(d.getName() );
      out.write("\" >");
      out.print(d.getName() );
      out.write("</a>");

		}}
                catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());

			return;
		}
        

      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
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
