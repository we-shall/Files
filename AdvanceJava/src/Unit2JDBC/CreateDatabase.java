/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2JDBC;

/**
 *
 * @author vishalsingh
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class CreateDatabase 
{
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //static final String DB_URL = "jdbc:mysql://localhost/";
    static Connection conn;
    static Statement stmt;
    static String query = "create database TodoList";
    
    
    public static void main(String[] args) 
    {
        conn = null;
        stmt = null;
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?allowPublicKeyRetrieval=true&useSSL=false","root","Vishal@9423");
            stmt = conn.createStatement();
            
            stmt.executeUpdate(query);
           
            
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(CreateDatabase.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(CreateDatabase.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(CreateDatabase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
        }
        
        System.out.println("End of program");
    }
}
