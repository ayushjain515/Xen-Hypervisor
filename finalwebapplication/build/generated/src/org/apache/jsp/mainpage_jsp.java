package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"fadedtab.css\" />\n");
      out.write("<title>Mobile Virtual Manager</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\t\n");
      out.write("        <div id=\"header\">\n");
      out.write("        \t<div class=\"logo\"></div>\n");
      out.write("            <h1>Mobile Virtual Manager</h1>\n");
      out.write("\t\t\t<h2></t>Manage Your Virtual Machines Remotely</h2>\n");
      out.write("        </div>\n");
      out.write("<div id=\"bottomContent\">\n");
      out.write("\t<div class=\"navColumn\"> \n");
      out.write("    \t\n");
      out.write("    \t<div class=\"link\"><a href=\"#\">HOME</a></div>\n");
      out.write("        <div class=\"link\"><a href=\"create.jsp\">CREATE</a></div>\n");
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
      out.write("            <h1>Mobile Virtual Manager</h1>\n");
      out.write("                <br />  <p>In this fairly competitive world, where everyone is running a rat race to be the best, the role of technology and productivity increases multifoldly in such a scenario. To be ahead of competitors and to have an extra edge a fairly efficient android application that manages wirelessly our computer with a feature of virtualization is nothing but an added advantage to it.</p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                        <br />\n");
      out.write("                        <br />  \n");
      out.write("                        <br />\n");
      out.write("                        \n");
      out.write("            <h1>Why Virtualization?</h1>\n");
      out.write("            <br />  <p>The usual goal of virtualization is to centralize administrative tasks while improving scalability and overall hardware-resource utilization. With virtualization, several operating systems (OSs) can be run in parallel on a single CPU. This parallelism tends to reduce overhead costs and differs from multitasking, which involves running several programs on the same OS.</p>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("                                    <br />\n");
      out.write("                                    <br />\n");
      out.write("                                    <br />\n");
      out.write("            <h1>How we work?</h1>\n");
      out.write("            <br />  <p>Mobile Virtual Manager gives you the portabiity of accessing and managing you virtual machines while you are on the go. With the full fledged website and smartphone applications, now managing you virtual domains on the server is very simple. </p>\n");
      out.write("             <br />\n");
      out.write("                <li>Web Support</li>\n");
      out.write("                <li>Mobile Access</li>\n");
      out.write("                <li>Create New Domains</li>\n");
      out.write("                <li>Access Domain Information</li>\n");
      out.write("                <li>Manage Domains</li>\n");
      out.write("             \n");
      out.write("                <br />\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("     </div>\n");
      out.write("     <div class=\"contentBottom\"></div>\n");
      out.write("   \t<!--End Content Box -->\n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
