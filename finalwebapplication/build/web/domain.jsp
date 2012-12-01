<%-- 
    Document   : index
    Created on : May 12, 2012, 4:57:31 PM
    Author     : sidharth
--%>


<%@page import="org.libvirt.Domain"%>
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
       
   
<%
            Connect conn = null;
		int flags = 0;

		try {
			
			
			conn = new Connect("qemu:///system", false);
                       String s[]=conn.listDefinedDomains();
                       int j[]=conn.listDomains();
                      long l;
                    //  int id[]=conn.listDomainsID();
                    
                     // java.lang.String n=conn.getName();

                    
                      l=conn.connectionVersion(conn); //version of connection used
                      
                                                                         
                           
                    

                                     %>   

                       <%=s.length %>    
                            <%=j.length %>
                            <%=l %>
                              
                            

                             
                      
                            
                                 
      
                            
   <%
		}
                catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());

			return;
		}
        
%>
   
   
   
    </body>
</html>
