<%-- 
    Document   : info
    Created on : May 15, 2012, 1:43:21 AM
    Author     : ayush
--%>


<%@page import="org.libvirt.Domain"%>
<%@page import="org.libvirt.LibvirtException"%>
<%@page import="org.libvirt.Connect"%>
<%@page import="form.domains"%>
<%@page import="form.host"%>
<%@page import="form.storage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html
<link rel="stylesheet" type="text/css" href="fadedtab.css" />
<title>Mobile Virtual Manager</title>
</head>

<body>
		
        <div id="header">
        	<div class="logo"></div>
            <h1>Mobile Virtual Manager</h1>
			<h2>Manage Your Virtual Machines Remotely </h2>
        </div>
<div id="bottomContent">
	<div class="navColumn"> 
    	
    	<div class="link"><a href="mainpage.jsp">HOME</a></div>
        <div class="link"><a href="create.jsp">CREATE</a></div>
        <div class="link"><a href="control.jsp">DOMAIN</a></div>
        <div class="link"><a href="#">INFORAMTION</a></div>
        
<div id="navBottom"></div>
    </div>
    <div class="contentColumn">



	<!--Start Content Box (use one of the simple ones below -->
  	<!--  To make a new content box, copy and paste from the Start to End, and paste it below this one.. you can create as many as you like. -->
      <div class="contentTop"></div>
      <div class="contentMain"> 
            <h1>Domain Information</h1>

        
        <% Connect conn = null;
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
                       %>   

                        <br />
                      <p1 style="margin:2;padding:2;"> Numbers Of InActive States </p1> <%=s.length %>    
                       <br />
                        <p1 style="margin:2;padding:2;"> Numbers Of Active States </p1>     <%=j.length %>
                           <%
                      Domain d1;
                      int i,p,k;
                      for(i=0;i<s.length;i++)
                          {
                        d1=conn.domainLookupByName(s[i]);
        %>
         <br />
          <br />
        <p1 /n> InActive </p1>
        <%=d1.getName() %>
       <% }
        for(p=0;p<j.length;p++)
                          {
                        d1=conn.domainLookupByID(j[p]);
                       
        %> 
         <br />
          <br />
        <p1 /n> Active </p1><%=d1.getName() %>
        <%	}%>
          
        
                            
			
                 <br />  
                 <br />        
                        <p1 /n> Connection Version</p1><%= String.valueOf(l)%>
                <br />        
                <br />        
                        <p1>Host Name</p1><%= String.valueOf(s3)%>
                        <br />
                        <br />        
                        <p1>Hypervisor</p1><%= String.valueOf(s4)%>
                        <br />        
                        <br />        

                        <p1>Lib Vort Version</p1><%= String.valueOf(l1)%>
                        <br />        
                        <br />        
                        <p1>Hyper version</p1><%= String.valueOf(s5)%>
                        <br />        
                        <br />        
                        <p1>Network List</p1><%= s6.length%>
                        <br />        
                        <br />        
                        <p1>Network Number</p1><%= n1%>
                        <br />        
                        <br />        
                                <p1> Capabilities of Hypervisor</p1><%= String.valueOf(s1)%>
                        <%--  <p1> Free Memory</p1><%= String.valueOf(o)%> --%>
                                               
                
                   
        </div>

     
    
     <div class="contentBottom"></div>
     </div>
    </body>
</html>
