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

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html\n");
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
      out.write("        <div class=\"link\"><a href=\"control.jsp\">DOMAIN</a></div>\n");
      out.write("        <div class=\"link\"><a href=\"#\">INFORAMTION</a></div>\n");
      out.write("        \n");
      out.write("<div id=\"navBottom\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"contentColumn\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--Start Content Box (use one of the simple ones below -->\n");
      out.write("  \t<!--  To make a new content box, copy and paste from the Start to End, and paste it below this one.. you can create as many as you like. -->\n");
      out.write("      <div class=\"contentTop\"></div>\n");
      out.write("      <div class=\"contentMain\"> \n");
      out.write("            <h1>Domain Information</h1>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 Connect conn = null;
		int flags = 0;
              //  String name = request.getParameter("name");
               // String memory = request.getParameter("memory");

                

		
			
			
			conn = new Connect("qemu:///system", false);
                        
                         String s[]=conn.listDefinedDomains();
                         java.lang.String s3=conn.getHostName();
                         java.lang.String s5=conn.getURI();
                      int j[]=conn.listDomains();
                      int n1=conn.numOfNetworks();
                      long l = conn.connectionVersion(conn);
                      long l1=conn.getLibVirVersion();
                      String s6[]=conn.listNetworks();
                      java.lang.String s4=conn.getType();
                    //  long o= conn.getFreeMemory();
                      String s1=conn.getCapabilities();
                      domains d=new domains();
                         storage s2=new storage();
                          host h=new host();
                        s2.storage(conn);
         //             int a[]=conn.isActive();
                       
      out.write("   \n");
      out.write("\n");
      out.write("                        <br />\n");
      out.write("                      <p1 style=\"margin:2;padding:2;\"> Numbers Of InActive States </p1> ");
      out.print(s.length );
      out.write("    \n");
      out.write("                       <br />\n");
      out.write("                        <p1 style=\"margin:2;padding:2;\"> Numbers Of Active States </p1>     ");
      out.print(j.length );
      out.write("\n");
      out.write("                           ");

                      Domain d1;
                      int i,p,k;
                      for(i=0;i<s.length;i++)
                          {
                        d1=conn.domainLookupByName(s[i]);
        
      out.write("\n");
      out.write("         <br />\n");
      out.write("          <br />\n");
      out.write("        <p1 /n> InActive </p1>\n");
      out.write("        ");
      out.print(d1.getName() );
      out.write("\n");
      out.write("       ");
 }
        for(p=0;p<j.length;p++)
                          {
                        d1=conn.domainLookupByID(j[p]);
                       
        
      out.write(" \n");
      out.write("         <br />\n");
      out.write("          <br />\n");
      out.write("        <p1 /n> Active </p1>");
      out.print(d1.getName() );
      out.write("\n");
      out.write("        ");
	}
      out.write("\n");
      out.write("          \n");
      out.write("        \n");
      out.write("                            \n");
      out.write("\t\t\t\n");
      out.write("                 <br />  \n");
      out.write("                 <br />        \n");
      out.write("                        <p1 /n> Connection Version</p1>");
      out.print( String.valueOf(l));
      out.write("\n");
      out.write("                <br />        \n");
      out.write("                <br />        \n");
      out.write("                        <p1>Host Name</p1>");
      out.print( String.valueOf(s3));
      out.write("\n");
      out.write("                        <br />\n");
      out.write("                        <br />        \n");
      out.write("                        <p1>Hypervisor</p1>");
      out.print( String.valueOf(s4));
      out.write("\n");
      out.write("                        <br />        \n");
      out.write("                        <br />        \n");
      out.write("\n");
      out.write("                        <p1>Lib Vort Version</p1>");
      out.print( String.valueOf(l1));
      out.write("\n");
      out.write("                        <br />        \n");
      out.write("                        <br />        \n");
      out.write("                        <p1>Hyper version</p1>");
      out.print( String.valueOf(s5));
      out.write("\n");
      out.write("                        <br />        \n");
      out.write("                        <br />        \n");
      out.write("                        <p1>Network List</p1>");
      out.print( s6.length);
      out.write("\n");
      out.write("                        <br />        \n");
      out.write("                        <br />        \n");
      out.write("                        <p1>Network Number</p1>");
      out.print( n1);
      out.write("\n");
      out.write("                        <br />        \n");
      out.write("                        <br />        \n");
      out.write("                                <p1> Capabilities of Hypervisor</p1>");
      out.print( String.valueOf(s1));
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("                                               \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    \n");
      out.write("     <div class=\"contentBottom\"></div>\n");
      out.write("     </div>\n");
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
