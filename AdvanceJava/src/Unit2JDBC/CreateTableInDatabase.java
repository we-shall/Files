/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2JDBC;

import static Unit2JDBC.CreateDatabase.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vishalsingh
 */
public class CreateTableInDatabase 
{
    static Connection conn;
    static Statement stmt;
    static String query = "create table Dictionary ( word varchar(30) not null, meaning varchar(30) not null ,PRIMARY KEY(word))";
    public static void main(String[] args)
    {
     conn = null;
        stmt = null;
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TodoList?allowPublicKeyRetrieval=true&useSSL=false","root","Vishal@9423");
            stmt = conn.createStatement();
            
            stmt.executeUpdate(query);
            System.out.println("Table created");
           
            
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
        
    }
}
