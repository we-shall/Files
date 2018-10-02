/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2JDBC;

import static Unit2JDBC.CreateTableInDatabase.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vishalsingh
 */
public class StorageProcedure 
{
    static String query = "CREATE PROCEDURE `updateStudent1`(IN id1 int)\n" +
                            "BEGIN\n" +
                            "update studentmarks \n" +
                            "set total = (T1+T2), avg = (T1+T2)/2\n" +
                            "where id=id;\n" +
                            "END";
    
    static Connection conn;
    static Statement stmt;
    
    public static void main(String[] args) 
    {
        conn = null;
        stmt = null;
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false","root","Vishal@9423");
            stmt = conn.createStatement();
            
            //stmt.executeUpdate(query);
            System.out.println("procedure created!!!");
            int id = 70;
            stmt.executeUpdate("call `updateStudent1`("+id+")");
            
            ResultSet rs = stmt.executeQuery("Select * from studentmarks");
            while(rs.next())
            {
                System.out.println("id" + rs.getInt(1) + "T1" + rs.getInt(2) + "T2" + rs.getInt(3) + "total" + rs.getInt(4) + "average" + rs.getFloat(5));
            }
           
            System.out.println("query  exec");
            
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
