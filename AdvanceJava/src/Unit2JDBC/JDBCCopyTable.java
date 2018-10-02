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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vishalsingh
 */
public class JDBCCopyTable 
{
    static Connection conn,conn1;
    static Statement stmt;
    static ResultSet rs;
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        
        
        
        conn = null;
        stmt = null;
        conn1 = null;
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_copy?allowPublicKeyRetrieval=true&useSSL=false","root","Vishal@9423");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false","root","Vishal@9423");
            stmt = conn.createStatement();
            
//            System.out.println("Enter the name of table to be copied from the database");
//            String table_name = sc.next();
              String table_name = "student_class";
              String query = "Select * from " + table_name;
              
              rs = stmt.executeQuery(query);
              ResultSetMetaData rsmd = rs.getMetaData();
              System.out.println("column count " + rsmd.getColumnCount());
              String col1 = rsmd.getColumnName(1);
              String col2 = rsmd.getColumnName(2);
              String col3 = rsmd.getColumnName(3);
            System.out.println("col1 " + col1 + " col2 " + col2 + " col3 " + col3);
            
            String queryForTable2 = "create table student_class_copy (" + col1+ " Integer not null, "+ col2+ " Integer, "+col3+" Integer) ";
            stmt = conn1.createStatement();
            //System.out.println("A new Table created in different database");
            //stmt.executeUpdate(queryForTable2);
            while (rs.next())
            {   
                stmt.executeUpdate("Insert Into student_class_copy values( " +rs.getInt(1) + "," +rs.getInt(2)+ "," +rs.getInt(3)  +  ")");
            }
            System.out.println("Data added to table successfully");
           
            
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
            
            if (conn1 != null)
            {
                try 
                {
                    conn1.close();
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(CreateDatabase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
    }
}
