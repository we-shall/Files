<%-- 
    Document   : OpenMeaning
    Created on : Aug 16, 2018, 5:40:12 PM
    Author     : vishalsingh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%! String meaning="";%>
        <%! String link="";%>
        <%
            Connection conn;
            Statement stmt;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TodoList?allowPublicKeyRetrieval=true&useSSL=false","root","Vishal@9423");
            stmt = conn.createStatement();
            
            String query = "Select * from Dictionary where word= '"+ request.getParameter("word") +"'";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next())
            {
                meaning = rs.getString(2) ;
            }
            else
            {
                meaning = "Word Not Present in the dictionary!!";
            }
             
        
           link = "https://www.google.co.in/search?q="+request.getParameter("word") + "+meaning&oq="+request.getParameter("word")+"+meaning";
        %>
    </head>
    <body>
        <br><br>
        <jsp:include page="Header.html"/>
        <h4>Meaning of word : ${param.word} :: <%= meaning %> </h4>
        <a style="color:blue" href = <%= link %>  >Search on google instead?</a>
        
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>
