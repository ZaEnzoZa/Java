/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Enzo
 */
public class Banking_System extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String[] UserDetials = getUserDetails();

    public Banking_System() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        displayBal(Float.parseFloat(UserDetials[5]));
    }

    public float currBalance;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtWithdraw = new javax.swing.JTextField();
        edtDeposit = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextPane();
        btnWithdraw = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("How much would you like to Withdraw?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("How much would you like to deposit?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(edtWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 70, -1));
        jPanel1.add(edtDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 70, -1));

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 79, -1));

        jButton1.setText("Calculator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 115, -1));

        txaOutput.setEditable(false);
        jScrollPane1.setViewportView(txaOutput);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 550, 120));

        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        jPanel1.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jButton2.setText("Log out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 220, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Financial_calculator().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        displayBal(withdraw(currBalance, Float.parseFloat(edtWithdraw.getText())));
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        displayBal(deposit(currBalance, Float.parseFloat(edtDeposit.getText())));
    }//GEN-LAST:event_btnDepositActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateUserDetails();
        clearTfile();
                
        new Login_page().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public float withdraw(float curBalance, float withdrawAmount) {

        float newBalance = 0;
        float bankCosts = 0;
        float counter = Math.floorDiv((long) withdrawAmount, 100);

        bankCosts = (float) (2.02 * counter);

        newBalance = curBalance - withdrawAmount - bankCosts;

        newBalance = (float) (Math.round(newBalance * 100.0) / 100.0);
        currBalance = newBalance;
        return newBalance;
    }

    public float deposit(float curBalance, float depositAmount) {

        float newBalance = 0;
        float bankCosts = 0;
        float counter = Math.floorDiv((long) depositAmount, 100);

        bankCosts = (float) (1.82 * counter);

        newBalance = curBalance + depositAmount - bankCosts;

        newBalance = (float) (Math.round(newBalance * 100.0) / 100.0);
        currBalance = newBalance;
        return newBalance;
    }

    public void displayBal(float bal) {
        txaOutput.setText("Current Balance is: R" + String.valueOf(bal));
    }

    public void RedisplaySelf() {
        setVisible(true);
    }

    public String[] getUserDetails() {
        String[] allInfo = null;
        try {
            File tFile = new File("User.txt");
            Scanner myReader = new Scanner(tFile);

            while (myReader.hasNextLine()) {
                String info = myReader.nextLine();
                allInfo = info.split(",");
                currBalance = Float.parseFloat(allInfo[5]);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Failed to obtain user details");
        }
        return allInfo;
    }

    public void updateUserDetails() {
        try {
            Connection con;
            Statement stmt;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/banking", "root", "root");
            stmt = con.createStatement();
            
            String query = "UPDATE users SET Balance = '" + currBalance + "'" + 
                    "WHERE id = '" + UserDetials[0] + "'";
            stmt.executeUpdate(query);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to update user details on close");
        }
    }
    public void clearTfile(){
        FileWriter writer = null;
        try {
            File myFile = new File("User.txt");
            writer = new FileWriter(myFile);
            writer.write("");
            writer.close();
            System.out.println("Successfulle saved user to file");
        } catch (IOException ex) {
            Logger.getLogger(Banking_System.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Banking_System.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JTextField edtDeposit;
    private javax.swing.JTextField edtWithdraw;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txaOutput;
    // End of variables declaration//GEN-END:variables

}
