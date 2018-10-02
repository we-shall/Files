<%-- 
    Document   : Footer
    Created on : Aug 16, 2018, 5:17:59 PM
    Author     : vishalsingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p align="left"> 
            <div align="left">
            <b>Miss: </b> <%= 3*4 %>
            <b>Hit: </b> <%= 10*5 %>
            </div>
            <div align="right">
            Last Updated: <%= new java.util.Date()%>  
            </div>    
        </p>
    </body>
</html>
