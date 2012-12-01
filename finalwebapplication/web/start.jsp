<%@page import="form.pause"%>
<%
            
			
			
			pause p =new pause();
                        String s= request.getParameter("name");
                        p.pause(s);
%>
   