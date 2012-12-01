<%-- 
    Document   : index
    Created on : May 14, 2012, 11:34:21 PM
    Author     : ayush
--%>

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
        <div class="link"><a href="#">CREATE</a></div>
        <div class="link"><a href="control.jsp">DOMAIN</a></div>
        <div class="link"><a href="info.jsp">INFORAMTION</a></div>
        
<div id="navBottom"></div>
    </div>
	<div class="contentColumn">



	<!--Start Content Box (use one of the simple ones below -->
  	<!--  To make a new content box, copy and paste from the Start to End, and paste it below this one.. you can create as many as you like. -->
      <div class="contentTop"></div>
      <div class="contentMain"> 
            <h1>Create New Virtual Machine</h1>
                  
                 
       
        
        <form method="post">
                        <table border="0" cellpadding="0" cellspacing="0">
                                <tr>

                                    <td>Name of Domain: </td>
                                        <td><input type="text" name="name" 
                                                   id="name"
 size="20"/></td>
                                    
                                        
                                </tr>
                                
                                 <tr>
                                    
                                     <td>Domain Memory: </td>
                                        <td><input type="text" name="memory" id="memory"
 size="20"/></td>
                                        
                                </tr>
                                
                                 <tr>
                                    
                                     <td>Domain CPU: </td>
                                        <td><input type="text" name="cpu"
 size="20"/></td>
                                       
                                </tr>
                                <tr>
                                        
                                       
                                    <td><input type="submit" name="submit" />
<input type="reset" name="B2"/></td>
                                </tr>
                        </table>
                </form>
     </div>

     
    
     <div class="contentBottom"></div>
     </div>
     
   	<!--End Content Box -->
    
    
    
    
        
        <% Connect conn = null;
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
        %>        
        
    </body>
</html>
