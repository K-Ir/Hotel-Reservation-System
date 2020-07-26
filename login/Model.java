/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.InvalidationListener;
import java.util.Observable;

/**
 *
 * @author lailili
 */
public class Model extends Observable{
    Statement statement ;
    boolean isIDExisted =false;
    boolean ispswRight = false;

    public Model() {
        UserDB userDB = new UserDB();
        userDB.establishSQLConnection();
        statement=userDB.statement;
        
    }
    
    public void message(){
        setChanged();
        notifyObservers("Sorry ,the user id or password is wrong!");
    }
    
    
    public boolean checkID(String uid) {
        try {
            String str ="select * from userinfo where userid="+uid;
            isIDExisted=statement.execute(str);
        } catch (SQLException ex) {
            message();
        }
        if(isIDExisted)
            return true;
        else
            return false;
          
    }
    
    public boolean checkPSW(String uid, String psw){
        String rightPsw = null;
        try {
            String str ="select * from userinfo where userid="+uid;
            ResultSet rs = statement.executeQuery(str);
            while (rs.next()) {
                rightPsw = rs.getString("password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ifPSWRight(psw, rightPsw)) 
                return true;
            else
                return false;
    }
    
    public boolean ifPSWRight(String currentPsw , String rightPsw){
        if (currentPsw.equals(rightPsw)) {
            return true;
        }
        else
            return false;
    }
    
}
