/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalInfo;

import personalInfo.Model;
import personalInfo.User;
import java.awt.Color;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nora
 */
public class Controller implements ActionListener,MouseListener{
    User user;
    Model model;
    
    public void addView(User user){
        this.user = user;
    }
    public void addModel(Model model){
        this.model = model;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== user.btnCancel) {
            user.User.dispose();
        }
        else if (e.getSource()==user.btnSave) {
            String fn = user.txtFirstName.getText();
            String ln = user.txtLastName.getText();
            String gender = user.txtGender.getText();
            String eamil = user.txtEmail.getText();
            String phone = user.txtPhone.getText();
            String month = user.txtMonth.getText();
            String day = user.txtDay.getText();
            String year = user.txtYear.getText();
            if(!gender.toUpperCase().equals("FEMALE") && !gender.toUpperCase().equals("MALE")){
                JOptionPane.showMessageDialog(null, "Sorry,this gender has a wrong", "wrong", JOptionPane.ERROR_MESSAGE);
            }
            if(Integer.valueOf(day)>31){
                JOptionPane.showMessageDialog(null, "Sorry,this day is over the limited", "wrong", JOptionPane.ERROR_MESSAGE);
            }
            model.Update(fn, ln, gender, year, month, day, eamil, phone);
            
            
        }
        else if (e.getSource()==user.lblPi) {
            model.Show();
            user.txtFirstName.setText(model.firstName);
            user.txtLastName.setText(model.lastName);
            user.txtGender.setText(model.gender);
            user.txtEmail.setText(model.email);
            user.txtPhone.setText(model.phone);
            user.txtMonth.setText(model.month);
            user.txtDay.setText(model.day);
            user.txtYear.setText(model.year);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== user.lblPi) {
            user.lblPi.setForeground(Color.red);
            user.lblRooms.setForeground(Color.black);
            user.panelPi.setVisible(true);
            user.panelSr.setVisible(false);
        }
        else if (e.getSource()==user.lblRooms) {
            user.lblRooms.setForeground(Color.red);
            user.lblPi.setForeground(Color.black);
            user.panelPi.setVisible(false);
            user.panelSr.setVisible(true);
        }
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
