/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalInfo;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import personalInfo.Model;
/**
 *
 * @author Nora
 */
public class User implements Observer{
//    public static void main(String[] args){
//        User user=new User();
//    }
        JFrame User = new JFrame(); 
        JPanel panel1;
        JPanel panelPi = new JPanel();
        JLabel lblPi = new JLabel("Personal Information");
        JLabel lblRooms = new JLabel("Saved Rooms");
        
        JPanel panelSr = new JPanel();
        JLabel lblDate1 = new JLabel();
        JLabel lblHotelName1 = new JLabel();
        JLabel lblDate2 = new JLabel();
        JLabel lblHotelName2 = new JLabel();
        JLabel lblDate3 = new JLabel();
        JLabel lblHotelName3 = new JLabel();
        JLabel lblDate4 = new JLabel();
        JLabel lblHotelName4 = new JLabel();
        JLabel lblDate5 = new JLabel();
        JLabel lblHotelName5 = new JLabel();
        JLabel lblDate6 = new JLabel();
        JLabel lblHotelName6 = new JLabel();
        
        JLabel lblFirstName = new JLabel();
        JLabel lblLastName = new JLabel();
        JLabel lblGender = new JLabel();
        JLabel lblBirthDate = new JLabel();
        JLabel lblEmail = new JLabel();
        JLabel lblPhone = new JLabel();
        JTextField txtFirstName = new JTextField();
        JTextField txtLastName = new JTextField();
        JTextField txtGender = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtPhone = new JTextField();
        JTextField txtMonth = new JTextField();
        JTextField txtDay = new JTextField();
        JTextField txtYear = new JTextField();
        
        JButton btnSave = new JButton("Save");
        JButton btnCancel = new JButton("Cancel and Exit");
        Model model = new Model();
        UserDB userDB = new UserDB();
        public String hotelName;
        public String orderTime;
        public String leaveTime;
    public User(){
        
        User.setTitle("Personal Center");
        User.setResizable(true);
        //this.setLocationRelativeTo(null);
        User.setExtendedState(JFrame.MAXIMIZED_BOTH);
        User.setDefaultCloseOperation(User.DISPOSE_ON_CLOSE); 
        
        int width=Toolkit.getDefaultToolkit().getScreenSize().width;
        int height=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        
        
        JPanel panel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                try {
                    Image image = ImageIO.read(new File("1.jpg"));
                    g.drawImage(image, 0, 0, width, height, null);
                }catch(IOException e) {
                    e.printStackTrace();
                }
            }
        };     
        panel1.setOpaque(false);
        panel1.setLayout(new GridBagLayout());

        lblPi.setFont(new Font("Arial",Font.PLAIN, 30));
        
        lblRooms.setFont(new Font("Arial",Font.PLAIN, 30));
        
        GridBagConstraints gbc= new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.ipadx = 3;
        gbc.ipady = 40;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(97, 0, 0, 0);
        panel1.add(lblPi,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.ipadx = 89;
        gbc.ipady = 40;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(55, 0, 0, 0);
        panel1.add(lblRooms,gbc);
        
        panelPi.setBorder(BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(102, 102, 102))); 
        panelPi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelPi.setOpaque(false);
        lblPi.setForeground(Color.red);
        
        lblFirstName.setFont(new Font("Arial", Font.PLAIN, 24));
        lblFirstName.setText("First Name");

        lblLastName.setFont(new Font("Arial", Font.PLAIN, 24));
        lblLastName.setText("Last Name");

        lblGender.setFont(new Font("Arial", Font.PLAIN, 24));
        lblGender.setText("Gender");

        lblBirthDate.setFont(new Font("Arial", Font.PLAIN, 24));
        lblBirthDate.setText("Birth Date");

        lblEmail.setFont(new Font("Arial", Font.PLAIN, 24));
        lblEmail.setText("Email Address");

        lblPhone.setFont(new Font("Arial", Font.PLAIN, 24));
        lblPhone.setText("Phone Number");
        
        txtFirstName.setFont(new Font("Arial", Font.PLAIN, 24));
        txtLastName.setFont(new Font("Arial", Font.PLAIN, 24));
        txtEmail.setFont(new Font("Arial", Font.PLAIN, 24));
        txtPhone.setFont(new Font("Arial", Font.PLAIN, 24));
        
        txtGender.setFont(new Font("Arial", Font.PLAIN, 24));

        txtMonth.setFont(new Font("Arial", Font.PLAIN, 24));
        
        txtDay.setFont(new Font("Arial", Font.PLAIN, 24));
        
        txtYear.setFont(new Font("Arial", Font.PLAIN, 24));
        
        btnSave.setFont(new Font("Arial", Font.PLAIN, 24));
        btnSave.setBackground(new java.awt.Color(255, 102, 102));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        
        btnCancel.setFont(new Font("Arial", Font.PLAIN, 24));
        btnCancel.setBackground(Color.BLACK);
        btnCancel.setForeground(Color.white);
                
        GroupLayout panelPiLayout = new GroupLayout(panelPi);
        panelPi.setLayout(panelPiLayout);
        panelPiLayout.setHorizontalGroup(
            panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPiLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPiLayout.createSequentialGroup()
                        .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(lblBirthDate)
                            .addComponent(lblEmail)
                            .addComponent(lblPhone)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName))
                        .addGap(57, 57, 57)
                        .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPiLayout.createSequentialGroup()
                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 176, Short.MAX_VALUE))
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)
                            .addComponent(txtLastName)
                            .addComponent(txtGender)
                            .addComponent(txtFirstName))
                        .addGap(63, 63, 63))))
        );
        panelPiLayout.setVerticalGroup(
            panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addGap(40, 40, 40)
                .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirthDate)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelPiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
  
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridheight = 4;
        gbc.ipadx = 176;
        gbc.ipady = 52;
        gbc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gbc.insets = new java.awt.Insets(22, 96, 23, 109);
        panel1.add(panelPi, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 16;
        gbc.ipady = 30;
        gbc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gbc.insets = new java.awt.Insets(206, 36, 0, 0);
        panel1.add(btnCancel, gbc);
        
        
        panelSr.setBackground(new java.awt.Color(255, 255, 255));
        panelSr.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saved Rooms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N
        panelSr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelSr.setVisible(false);
        panelSr.setLayout(new java.awt.GridBagLayout());
        panelSr.setOpaque(false); 
        
        lblDate1.setFont(new Font("Arial", Font.PLAIN, 24));
        lblDate2.setFont(new Font("Arial", Font.PLAIN, 24));
        lblDate3.setFont(new Font("Arial", Font.PLAIN, 24));
        lblDate4.setFont(new Font("Arial", Font.PLAIN, 24));
        lblDate5.setFont(new Font("Arial", Font.PLAIN, 24));
        lblDate6.setFont(new Font("Arial", Font.PLAIN, 24));
        lblHotelName1.setFont(new Font("Arial", Font.PLAIN, 24));
        lblHotelName2.setFont(new Font("Arial", Font.PLAIN, 24));
        lblHotelName3.setFont(new Font("Arial", Font.PLAIN, 24));
        lblHotelName4.setFont(new Font("Arial", Font.PLAIN, 24));
        lblHotelName5.setFont(new Font("Arial", Font.PLAIN, 24));
        lblHotelName6.setFont(new Font("Arial", Font.PLAIN, 24));
        
        GroupLayout panelSrLayout = new GroupLayout(panelSr);
        panelSr.setLayout(panelSrLayout);
        panelSrLayout.setHorizontalGroup(
            panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSrLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                        .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate1)
                            .addComponent(lblDate2)
                            .addComponent(lblDate3)
                            .addComponent(lblDate4)
                            .addComponent(lblDate5)
                            .addComponent(lblDate6))
                        .addGap(57, 57, 57)
                        .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHotelName1)
                            .addComponent(lblHotelName2)
                            .addComponent(lblHotelName3)
                            .addComponent(lblHotelName4)
                            .addComponent(lblHotelName5)
                            .addComponent(lblHotelName6))
                        .addGap(63, 63, 63))
        );
        panelSrLayout.setVerticalGroup(
            panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSrLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate1)
                    .addComponent(lblHotelName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHotelName2))
                .addGap(40, 40, 40)
                .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate3)
                    .addComponent(lblHotelName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate4)
                    .addComponent(lblHotelName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate5)
                    .addComponent(lblHotelName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelSrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate6)
                    .addComponent(lblHotelName6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
        );
        
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridheight = 4;
        gbc.ipadx = 176;
        gbc.ipady = 52;
        gbc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gbc.insets = new java.awt.Insets(22, 96, 23, 109);
        panel1.add(panelSr, gbc);
        
        GroupLayout layout = new GroupLayout(User.getContentPane());
        User.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        
        User.add(panel1);
        User.pack();
        model.Show();
        txtFirstName.setText(model.firstName);
        txtLastName.setText(model.lastName);
        txtGender.setText(model.gender);
        txtEmail.setText(model.email);
        txtPhone.setText(model.phone);
        txtMonth.setText(model.month);
        txtDay.setText(model.day);
        txtYear.setText(model.year);

        lblRooms.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e) {
		userDB.establishSQLConnection();
        ResultSet rs=null;
        try{
            int uid= Integer.valueOf(login.Controller.uid);
            String str ="select * from USERUSER"+uid;
            rs = userDB.statement.executeQuery(str);
            
            while(rs.next()){
                hotelName=rs.getString("hotelname");
                orderTime=rs.getString("ordertime");
                leaveTime=rs.getString("leaveTime");
                if(lblHotelName1.getText()==""){
                    lblHotelName1.setText(hotelName);
                    lblDate1.setText(orderTime +"-"+leaveTime);
                    
                }else if(lblHotelName2.getText()==""){
                    lblHotelName2.setText(hotelName);
                    lblDate2.setText(orderTime +"-"+leaveTime);
                }else if(lblHotelName3.getText()==""){
                    lblHotelName3.setText(hotelName);
                    lblDate3.setText(orderTime +"-"+leaveTime);
                }else if(lblHotelName4.getText()==""){
                    lblHotelName4.setText(hotelName);
                    lblDate4.setText(orderTime +"-"+leaveTime);
                }else if(lblHotelName5.getText()==""){
                    lblHotelName5.setText(hotelName);
                    lblDate5.setText(orderTime +"-"+leaveTime);
                }else if(lblHotelName6.getText()==""){
                    lblHotelName6.setText(hotelName);
                    lblDate6.setText(orderTime +"-"+leaveTime);
                }
            }
        }
        catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }

        });
        
        User.setVisible(true);
    }
    
    public void addController(Controller controller){
        btnSave.addActionListener(controller);
        btnCancel.addActionListener(controller);
        lblPi.addMouseListener(controller);
        lblRooms.addMouseListener(controller);
    }


    @Override
    public void update(Observable o, Object o1) {
        
    }
}

