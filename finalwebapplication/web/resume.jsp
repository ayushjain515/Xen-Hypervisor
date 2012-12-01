<%@page import="form.resume"%>
<%
            
			
			
			resume p =new resume();
                        String s= request.getParameter("name");
                        p.resume(s);
%>
   