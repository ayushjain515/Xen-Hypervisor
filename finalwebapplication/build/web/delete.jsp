<%@page import="form.delete"%>
<%
            
			
			
			delete p =new delete();
                        String s= request.getParameter("name");
                        p.delete(s);
%>
   