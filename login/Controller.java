/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import book.NewJFrame;
import signin.SignIn;

/**
 *
 * @author lailili
 */
public class Controller implements ActionListener,MouseListener{
    Login loginView;
    Model model;
    public static String uid;
    public String psw;
    public Controller() {
    }
    
    public void addView(Login login){
        this.loginView = login;
    }
    public void addModel(Model model){
        this.model = model;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== loginView.login) {
            uid = loginView.userid.getText();
            psw = loginView.password.getText();
            if (loginView.userid.getText().equals("")||loginView.password.getText().equals("")) {
                loginView.empty();
            }
            else if(!model.checkID(uid)||!model.checkPSW(uid, psw))
                model.message();
            else
                new NewJFrame();
        }
        else if (e.getSource()==loginView.cancel) {
            loginView.jFrame.dispose();
        }
    }
    
//    public static void main(String[] args) {
//        Controller controller = new Controller();
//    }

    @Override
    public void mouseClicked(MouseEvent e) {
        new SignIn();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        return;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       return;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        return;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        return;
    }

  
    
}
