<%-- 
    Document   : index
    Created on : May 12, 2012, 4:57:31 PM
    Author     : sidharth
--%>


<%@page import="org.libvirt.LibvirtException"%>
<%@page import="org.libvirt.Connect"%>
<%@page import="form.domains"%>
<%@page import="form.host"%>
<%@page import="form.storage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Domain</title>
    </head>
    <body>
        <h1>Domain Created Successfully!</h1>
   
<%
            Connect conn = null;
		int flags = 0;

		try {
			
			
			conn = new Connect("qemu:///system", false);
                         
			domains d=new domains();        //DOMAIN CLASS CALLED
                        //d.domain(conn);
                        String s=request.getParameter("name");
                        d.create(conn,s);
                        
                        //d.migrate(conn);
                        
                          
		}
                catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());

			return;
		}
        
%>
   
   
   
    </body>
</html>
