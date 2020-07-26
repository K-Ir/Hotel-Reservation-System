/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Statement;

/**
 *
 * @author lailili
 */
public class Run {
    
    
    public static void main(String[] args) {
//        UserDB userDB = new UserDB();
//        userDB.establishSQLConnection();
        Model myModel = new Model();
        Login myView = new Login();
        myModel.addObserver(myView);
        
        Controller myController = new Controller();
        //pass the reference of model and view to the controllor
        myController.addModel(myModel);
        myController.addView(myView);
//        myController.initModel(start_value);
        myView.addController(myController);
    }
    
}
