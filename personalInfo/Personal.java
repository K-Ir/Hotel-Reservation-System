/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalInfo;

import personalInfo.Controller;
import personalInfo.Model;
import personalInfo.User;

/**
 *
 * @author Nora
 */
public class Personal {
    public Personal(){
        Model myModel = new Model();
        User myView = new User();
        myModel.addObserver(myView);
        
        Controller myController = new Controller();
        //pass the reference of model and view to the controllor
        myController.addModel(myModel);
        myController.addView(myView);
        myView.addController(myController);
    } 
}
