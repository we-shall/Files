<%-- 
    Document   : somefile
    Created on : Aug 16, 2018, 4:03:27 PM
    Author     : vishalsingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%!
            String kuchBhej(String s)
            {
                return "vishal";
            }
        
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <%! int a = 6; %>
        The time is :: <%= new java.util.Date()%>
        
        <%-- this is a expression--%>
        The time is :: <%= (new String("hellllp0000").toUpperCase())  %>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% // this is a scriplet 
            for(int i = 0; i < 5; i ++)
            {
                out.println("<br> hello 0000" + i + 1);
            }
            out.println(a);
        %>
        
        data collected : <%= kuchBhej("ehy") %>
    </body>
</html>
