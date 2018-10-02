<%-- 
    Document   : Calci
    Created on : Aug 23, 2018, 10:34:06 AM
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
        <h1 align="center">Calculator</h1>
        <form align="center" action="Calci.jsp">
            <%!String val = "";%>
            <%
                try{
               char c[] = request.getParameter("op").toCharArray();
               int num1 = Integer.parseInt(request.getParameter("word1"));
                int num2 = Integer.parseInt(request.getParameter("word2"));
                if (c[0] == '+')
                {
                    out.println(num1+num2);
                }
                if (c[0] == '-')
                {
                    out.println(num1-num2);
                }
                if (c[0] == '*')
                {
                    out.println(num1*num2);
                }
                if (c[0] == '/')
                {
                    out.println(num1/(num2*1.0));
                }
                }
                catch(NullPointerException ex)
                {
                    out.println("No val");
                }
                
                

                
            %>
            
           <br/>
           <input type="text" name="word1" id="w1"/>
           
           <input type="text" name="word2" id=""/>
           <br/>
           <input type="button" name="oper"  value="1" onclick="">
           <input type="button" name="oper" value="2">
           <input type="button" name="oper" value="3">
           <input type="button" name="oper" value="4">
           <input type="button" name="oper" value="5">
           <br/>
           <input type="button" name="oper" value="6">
           <input type="button" name="oper" value="7">
           <input type="button" name="oper" value="8">
           <input type="button" name="oper" value="9">
           <input type="button" name="oper" value="0">
           <br/>
           
           <input type="submit"  name="op" value="+">
           <input type="submit" name="op" value="-">
           <input type="submit" name="op" value="/">
           <input type="submit" name="op" value="*">
           
           
           <%out.println(val);%>
           
      
           
           <input type="submit" value="="/>
        </form>
    </body>
</html>
