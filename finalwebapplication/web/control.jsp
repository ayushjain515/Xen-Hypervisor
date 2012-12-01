<%-- 

    Document   : index
    Created on : May 12, 2012, 4:57:31 PM
    Author     : sidharth
--%>


<%@page import="javax.swing.text.Document"%>
<%@page import="org.libvirt.Domain"%>
<%@page import="org.libvirt.LibvirtException"%>
<%@page import="org.libvirt.Connect"%>
<%@page import="form.domains"%>
<%@page import="form.host"%>
<%@page import="form.storage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
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
        <div class="link"><a href="#">DOMAIN</a></div>
        <div class="link"><a href="info.jsp">INFORAMTION</a></div>
        
<div id="navBottom"></div>
    </div>
	<div class="contentColumn">



	<!--Start Content Box (use one of the simple ones below -->
  	<!--  To make a new content box, copy and paste from the Start to End, and paste it below this one.. you can create as many as you like. -->
      <div class="contentTop"></div>
      <div class="contentMain"> 
            <h1>Domain Control</h1>
            
            
            
<input type="text" name="name" id="name" />
<input type="submit" name="submit" onclick="mymethod();" />            
            
<%                
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
                          
                       
                       %>
<%=String.valueOf(name) %>
                        <br />  
                        <br />  

                      <p1> Numbers Of InActive States </p1> <%=s.length %>    
                      <br />
                      <br />  
                      <p1> Numbers Of Active States </p1>     <%=j.length %>
      <br /> 
      <br /> 
        
        <%
                      Domain d;
                      int i,p,k;
                      for(i=0;i<s.length;i++)
                          {
                        d=conn.domainLookupByName(s[i]);
        %> <br /> 
        <br />  
        <p1> InActive </p1><a href="http://localhost:8080/finalwebapplication/resume.jsp?name=<%=d.getName() %>" ><br /><br /> "RESUME"</a>
        <%=d.getName() %>
        <br />  
        <a href="http://localhost:8080/finalwebapplication/delete.jsp?name=<%=d.getName() %>" ><br />"DELETE"</a>
        <%=d.getName() %>
        
        
        <%              }
                      
                for(p=0;p<j.length;p++)
                          {
                        d=conn.domainLookupByID(j[p]);
                       
        %> 
        
        <br />  
        <br />  
      
        
        <p2> Active </p2><a href="http://localhost:8080/finalwebapplication/pause.jsp?name=<%=d.getName() %>" ><%=d.getName() %></a><%
        	}%>


      </div>

     
    
     <div class="contentBottom"></div>
     </div>

                   <%    }
           
                catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());

			return;
		}
   
%>
   
   
   
    </body>
</html>
