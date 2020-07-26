/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import personalInfo.User;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Machenike
 */
public class NewJFrame extends javax.swing.JFrame {
    public static Connection conn;
    public static String url="jdbc:derby://localhost:1527/hotelDB";
    public String username = null;
    public String password = null;
    public Statement statement = null;
    ResultSet rs=null;
    String text;
    String s1=null,s2=null,s3=null,s4=null;
    public static String arriveMonth,arriveDay,leaveMonth,leaveDay;
    Image image;
    Image hotelImage;
    
    public void connectionHotelDB() throws SQLException{
        conn = DriverManager.getConnection(url, username, password);
    }


    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        jButton28.setText("Pujue International Hotel");
        jButton29.setText("Vienna Hotel");
        jButton31.setText("Wassim R Hotel");
        jButton32.setText("Crystal Orange Hotel");
        jButton30.setText("SciTech Hotel");
        jButton33.setText("Phoenix Su Yuan Hotel");
        jButton36.setText("Piao Home Inn");
        jButton39.setText("Yunchuan Hotel");
        //add background picture;
        ImageIcon backgroundIcon = new ImageIcon("111.jpg");
        int width=Toolkit.getDefaultToolkit().getScreenSize().width;
        int height=Toolkit.getDefaultToolkit().getScreenSize().height;
        image = backgroundIcon.getImage().getScaledInstance(width, height, 1);
        backgroundIcon = new ImageIcon(image);
        backgroundLabel.setIcon(backgroundIcon);
        
        //add hotel picture;
        ImageIcon hotel1 = new ImageIcon("hotel1.jpg");
        int lb1_width= jButton28.getWidth();
        int lb1_height= jButton28.getHeight();
        hotelImage = hotel1.getImage().getScaledInstance(lb1_width, lb1_height, 1);
        hotel1 = new ImageIcon(hotelImage);
        jButton28.setIcon(hotel1);
        
        ImageIcon hotel2 = new ImageIcon("hotel2.jpg");
        int lb2_width= jButton29.getWidth();
        int lb2_height= jButton29.getHeight();
        hotelImage = hotel2.getImage().getScaledInstance(lb2_width, lb2_height, 1);
        hotel2 = new ImageIcon(hotelImage);
        jButton29.setIcon(hotel2);
        
        ImageIcon hotel3 = new ImageIcon("hotel3.jpg");
        int lb3_width= jButton32.getWidth();
        int lb3_height= jButton32.getHeight();
        hotelImage = hotel3.getImage().getScaledInstance(lb3_width, lb3_height, 1);
        hotel3 = new ImageIcon(hotelImage);
        jButton32.setIcon(hotel3);
        
        ImageIcon hotel4 = new ImageIcon("hotel4.jpg");
        int lb4_width= jButton31.getWidth();
        int lb4_height= jButton31.getHeight();
        hotelImage = hotel4.getImage().getScaledInstance(lb4_width, lb4_height, 1);
        hotel4 = new ImageIcon(hotelImage);
        jButton31.setIcon(hotel4);
        
        ImageIcon hotel5 = new ImageIcon("hotel10.jpg");
        int lb5_width= jButton30.getWidth();
        int lb5_height= jButton30.getHeight();
        hotelImage = hotel5.getImage().getScaledInstance(lb5_width, lb5_height, 1);
        hotel5 = new ImageIcon(hotelImage);
        jButton30.setIcon(hotel5);
        
        ImageIcon hotel6 = new ImageIcon("hotel11.jpg");
        int lb6_width= jButton33.getWidth();
        int lb6_height= jButton33.getHeight();
        hotelImage = hotel6.getImage().getScaledInstance(lb6_width, lb6_height, 1);
        hotel6 = new ImageIcon(hotelImage);
        jButton33.setIcon(hotel6);
        
        ImageIcon hotel7 = new ImageIcon("hotel12.jpg");
        int lb7_width= jButton36.getWidth();
        int lb7_height= jButton36.getHeight();
        hotelImage = hotel4.getImage().getScaledInstance(lb7_width, lb7_height, 1);
        hotel7 = new ImageIcon(hotelImage);
        jButton36.setIcon(hotel7);
        
        ImageIcon hotel8 = new ImageIcon("hotel13.jpg");
        int lb8_width= jButton39.getWidth();
        int lb8_height= jButton39.getHeight();
        hotelImage = hotel8.getImage().getScaledInstance(lb8_width, lb8_height, 1);
        hotel8 = new ImageIcon(hotelImage);
        jButton39.setIcon(hotel8);
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(d.width,d.height);
        try {
            this.connectionHotelDB();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
//                jf.setContentPane(tabbedpane);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        backpanel = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton46 = new javax.swing.JButton();
        btnPC = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(800, 800));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        backpanel.setBackground(new java.awt.Color(255, 255, 255));
        backpanel.setOpaque(false);
        backpanel.setLayout(new java.awt.GridBagLayout());

        jTabbedPane3.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane3.setPreferredSize(new java.awt.Dimension(1196, 800));

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setOpaque(false);

        jButton30.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton30.setText("jButton");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton33.setText("jButton");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton36.setText("jButton");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton39.setText("jButton");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(108, 108, 108))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );

        jTabbedPane3.addTab("BeiJing", jPanel13);

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setOpaque(false);

        jButton28.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton28.setText("jButton");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton29.setText("jButton");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton31.setText("jButton");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton32.setText("jButton");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(149, 149, 149)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 190, 190))
        );

        jTabbedPane3.addTab("ShangHai", jPanel11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.ipady = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 73, 0, 0);
        backpanel.add(jTabbedPane3, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setText("Listings");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 73, 0, 0);
        backpanel.add(jLabel16, gridBagConstraints);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField1.setText("Enter destination");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 299;
        gridBagConstraints.ipady = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 6, 0, 0);
        backpanel.add(jTextField1, gridBagConstraints);

        jButton46.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton46.setText("search");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 40, 0, 0);
        backpanel.add(jButton46, gridBagConstraints);

        btnPC.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnPC.setText("Personal center");
        btnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 73, 0, 0);
        backpanel.add(btnPC, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 29, 0, 0);
        backpanel.add(jComboBox1, gridBagConstraints);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 45, 0, 0);
        backpanel.add(jComboBox2, gridBagConstraints);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 37, 0, 0);
        backpanel.add(jComboBox3, gridBagConstraints);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 56, 0, 0);
        backpanel.add(jComboBox4, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("ARRIVEDATE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 33, 0, 0);
        backpanel.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("LEAVEDATE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(71, 23, 0, 0);
        backpanel.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(backpanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(backgroundLabel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPCActionPerformed
        new personalInfo.Personal();// TODO add your handling code here:
    }//GEN-LAST:event_btnPCActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        text = jTextField1.getText().toUpperCase();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        if((Integer.valueOf(arriveMonth) > Integer.valueOf(leaveMonth)) || (Integer.valueOf(arriveMonth) == Integer.valueOf(leaveMonth))&&(Integer.valueOf(arriveDay)>Integer.valueOf(leaveDay))){
            JOptionPane.showMessageDialog(null, "Sorry,date has wrong", "wrong", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                statement =  conn.createStatement();
                rs = statement.executeQuery("select PLACE FROM HOTELINFO WHERE CAST(PLACE AS VARCHAR(128))='"+text+"'");
                if(rs.next()){
                    if(rs.getString("PLACE").equals(text)){
                        this.dispose();
                        new SearchFrame(text);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sorry,this city is not in the database", "wrong", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        s1 = jButton39.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        s1 = jButton36.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        s1 = jButton33.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        s1 = jButton30.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        s1 = jButton32.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        s1 = jButton31.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        s1 = jButton29.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        s1 = jButton28.getText();
        arriveMonth = (String) jComboBox1.getSelectedItem();
        arriveDay = (String) jComboBox2.getSelectedItem();
        leaveMonth = (String) jComboBox3.getSelectedItem();
        leaveDay = (String) jComboBox4.getSelectedItem();
        try {
            System.out.println(rs);
            statement = conn.createStatement();
            rs=statement.executeQuery("select * FROM HOTELINFO WHERE HOTELNAME='"+s1+"'");
            if(rs.next()){
                s2 = rs.getString("ROOMLEFT");
                s3 = rs.getString("ROOMPRICE");
                s4 = rs.getString("SCORE");
            }
            new InformFrame(s1,s2,s3,s4).setVisible(true);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton28ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel backpanel;
    private javax.swing.JButton btnPC;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton46;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane3;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
