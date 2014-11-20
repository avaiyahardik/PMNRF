/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shidhav
 */
public class DBConnection {
    
    
    private static Connection conn=null;
    private static String Driver="com.mysql.jdbc.Driver";
    private static String user="pmnrf";
    private static String password="pmnrf@1111";
   // private static String DBUser="postgres";
    
    
    public static Connection open() throws ClassNotFoundException , SQLException {
        
        Class.forName(Driver);
        
        //conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/", user, password);
        conn=DriverManager.getConnection("jdbc:mysql://db4free.net/pmnrf", user, password);
        Statement stmt=conn.createStatement();
        //stmt.execute("set search_path to public;");
        return conn;
    }
    
    public static void close() throws SQLException {
        conn.close();
    }
    
    public static void main(String[] args) {
        
        try{
            Connection conn=open();
            if(conn==null){
                System.out.println("Connection Error");
            }
            else {
                System.out.println("Connection ok");
                
                
            }
        }catch(Exception e){
            System.out.println("Error : "+e);
        }
        
    }
}
