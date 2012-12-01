package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.text.Document;
import org.libvirt.Domain;
import org.libvirt.LibvirtException;
import org.libvirt.Connect;
import form.domains;
import form.host;
import form.storage;

public final class control_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"fadedtab.css\" />\n");
      out.write("<title>Mobile Virtual Manager</title>\n");
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
      out.write("        <div class=\"link\"><a href=\"create.jsp\">CREATE</a></div>\n");
      out.write("        <div class=\"link\"><a href=\"#\">DOMAIN</a></div>\n");
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
      out.write("            <h1>Domain Control</h1>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("<input type=\"text\" name=\"name\" id=\"name\" />\n");
      out.write("<input type=\"submit\" name=\"submit\" onclick=\"mymethod();\" />            \n");
      out.write("            \n");
                
     //mymethod(String name) { 

   

            Connect conn = null;
		int flags = 0;
                	//	java.lang.String gg= request.getParameter("name");


		try {
              

			
			conn = new Connect("qemu:///system", false);
                       String s[]=conn.listDefinedDomains();
                      int j[]=conn.listDomains();
                      java.lang.String name = request.getParameter("name");

         //             int a[]=conn.isActive();
                          
                       
                       
      out.write('\n');
      out.print(String.valueOf(name) );
      out.write("\n");
      out.write("                        <br />  \n");
      out.write("                        <br />  \n");
      out.write("\n");
      out.write("                      <p1> Numbers Of InActive States </p1> ");
      out.print(s.length );
      out.write("    \n");
      out.write("                      <br />\n");
      out.write("                      <br />  \n");
      out.write("                      <p1> Numbers Of Active States </p1>     ");
      out.print(j.length );
      out.write("\n");
      out.write("      <br /> \n");
      out.write("      <br /> \n");
      out.write("        \n");
      out.write("        ");

                      Domain d;
                      int i,p,k;
                      for(i=0;i<s.length;i++)
                          {
                        d=conn.domainLookupByName(s[i]);
        
      out.write(" <br /> \n");
      out.write("        <br />  \n");
      out.write("        <p1> InActive </p1><a href=\"http://localhost:8080/finalwebapplication/resume.jsp?name=");
      out.print(d.getName() );
      out.write("\" ><br /><br /> \"RESUME\"</a>\n");
      out.write("        ");
      out.print(d.getName() );
      out.write("\n");
      out.write("        <br />  \n");
      out.write("        <a href=\"http://localhost:8080/finalwebapplication/delete.jsp?name=");
      out.print(d.getName() );
      out.write("\" ><br />\"DELETE\"</a>\n");
      out.write("        ");
      out.print(d.getName() );
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
              }
                      
                for(p=0;p<j.length;p++)
                          {
                        d=conn.domainLookupByID(j[p]);
                       
        
      out.write(" \n");
      out.write("        \n");
      out.write("        <br />  \n");
      out.write("        <br />  \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <p2> Active </p2><a href=\"http://localhost:8080/finalwebapplication/pause.jsp?name=");
      out.print(d.getName() );
      out.write("\" >");
      out.print(d.getName() );
      out.write("</a>");

        	}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    \n");
      out.write("     <div class=\"contentBottom\"></div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("                   ");
    }
           
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
