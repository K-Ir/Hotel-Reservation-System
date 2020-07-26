/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Observable;
import login.Controller;

/**
 *
 * @author Nora
 */
public class Model extends Observable{
    UserDB userDB = new UserDB();
    public static Connection conn;
    public String firstName;
    public String lastName;
    public String gender;
    public String year;
    public String month;
    public String day;
    public String email;
    public String phone;
    
    //User user=new User();
    
    public Model() {
        userDB.establishSQLConnection();
    }
    
    public void Show(){
        userDB.establishSQLConnection();
        ResultSet rs=null;
        try {
            String uid = login.Controller.uid;
            String str ="select * from userinfo where userid="+uid;
            rs = userDB.statement.executeQuery(str);
            
            while(rs.next()){
                firstName=rs.getString("firstname");
                lastName=rs.getString("lastname");
                gender=rs.getString("gender");
                String birthdate=rs.getString("birthdate");
                email=rs.getString("email");
                phone=rs.getString("phone");
                year=birthdate.substring(0,4);
                month=birthdate.substring(4,6);
                day=birthdate.substring(6,8);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Update(String firstName, String lastName , String gender, String year ,String month,String day,String email, String phone){
        userDB.establishSQLConnection();
        ResultSet rs=null;
        try {
            int uid= Integer.valueOf(login.Controller.uid);
            String str ="select * from userinfo where userid="+uid;
            rs = userDB.statement.executeQuery(str);
            String birthdate = year+month+day;
            String stateString = "update userinfo set firstname='"+firstName+"',lastname='"+lastName+"',gender='"+gender+"',email='"+email+"',phone='"+phone+"',birthdate='"+birthdate+"' where USERID="+uid;
            userDB.statement.executeUpdate(stateString);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    
}
