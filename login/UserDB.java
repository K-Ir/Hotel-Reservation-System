/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lailili
 */
public class UserDB {
    public static Connection conn;
    public static String url="jdbc:derby://localhost:1527/hotelDB";
    public static String username=null;
    public static String password=null;
    public Statement statement;
    
    public void establishSQLConnection(){
        try {
            conn = DriverManager.getConnection(url,username,password);
            System.out.println(url+" connected...");
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException:"+ex.getMessage());
        }
    }
    
}
