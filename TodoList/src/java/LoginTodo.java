/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vishalsingh
 */
@WebServlet(urlPatterns = {"/LoginTodo"})
public class LoginTodo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginTodo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginTodo at " + request.getContextPath() + "</h1>");
            
            
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            
            
            if ((new JdbcServlet()).checkPresence(user, pass,out))
            {
                out.println(" " + user + " " + pass + " user present");
            }
            else
                out.println(" " + user + " " + pass + " user not present");
            
            out.println("</body>");
            out.println("</html>");
            
            
            
            
            
            
            
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


class JdbcServlet{
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static Connection conn;
    static Statement stmt;    

    boolean checkPresence (String username , String password, PrintWriter out)
    {
        conn = null;
        stmt = null;
        
        String query = "select * from Login";// where username= '" + username + "'";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TodoList?allowPublicKeyRetrieval=true&useSSL=false","root","Vishal@9423");
            System.out.println("connected");
            stmt = conn.createStatement();
            
            
            out.println("stmt exec " + stmt.executeUpdate(query));
            ResultSet rs = stmt.getResultSet();
            while (rs.next())
            {
                out.println(" string" + rs.getString("password"));
                if (rs.getString(2).equals(password))
                    return true;
            }
            
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Some exception");
        }
        
        finally
        {
            if(stmt != null)
            {
                try 
                {
                    stmt.close();
                } 
                catch (SQLException ex) 
                {
               
                }
            }
            if (conn != null)
            {
                try 
                {
                    conn.close();
                } 
                catch (SQLException ex) 
                {
                    
                }
            }
                
        }
        
        System.out.println("End of program");
        
        
        
        
        
        
        
        return  false;
    }
    
    

    
    

}
