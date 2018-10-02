<%-- 
    Document   : DifferClass
    Created on : Aug 16, 2018, 4:52:30 PM
    Author     : vishalsingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="File.Temperary"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        hello  <%= Temperary.bhejo("some thing")%>
    </head>
    <body>
        <h1>Hello World!</h1>
        ye dekho <%= File.Temperary.bhejo("chuppppp")%>
        
        user agent :: <%= request.getHeader("user-agent") %>
        language :: <%= request.getLocale()%>
    </body>
</html>
