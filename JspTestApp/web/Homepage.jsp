<%-- 
    Document   : Homepage
    Created on : Aug 16, 2018, 5:16:19 PM
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
        <br><br>
        <jsp:include page="Header.html"/>
        <form align="center" action="OpenMeaning.jsp">
            <br><br><br><br><br><br><br><br><br>
           <b>Enter Word!</b>
           <br/>
           <input x type="text" name="word"/>
           <br/>
           <input type="submit" value="Find Meaning"/>
            
        </form>
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>
