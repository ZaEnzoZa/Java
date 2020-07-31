/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Enzo
 */
public class Banking_System extends javax.swing.JFrame {

    /**
     * Creates new form Banking_System
     */
    public Banking_System() {
        initComponents();
        showLoginDlg();
        displayBal(currBalance);
    }
    
    private void showLoginDlg() {
        LoginDlg loginDlg = new LoginDlg(this);
        Boolean michaelLogin = false;
        Boolean alexLogin = false;
        Boolean aidanLogin = false;
        Boolean zikhonaLogin = false;
        Boolean commonLogin = false;
        
        if (loginDlg.getEdtUsername().equals("Michael") && loginDlg.getEdtPassword().equals("MichaelPassword")) {
            michaelLogin = true;
            commonLogin = true;
        } else if (loginDlg.getEdtUsername().equals("Alex") && loginDlg.getEdtPassword().equals("AlexPassword")) {
            alexLogin = true;
            commonLogin = true;
        } else if (loginDlg.getEdtUsername().equals("Aidan") && loginDlg.getEdtPassword().equals("AidanPassword")) {
            aidanLogin = true;
            commonLogin = true;
        } else if (loginDlg.getEdtUsername().equals("Zikhona") && loginDlg.getEdtPassword().equals("ZikhonaPassword")) {
            zikhonaLogin = true;
            commonLogin = true;
        }
        
        if (commonLogin == false) {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            System.exit(0);
            
        }
        
        
    }
    public float currBalance = 1000;
    
//    Creates the Login Dialog
    public class LoginDlg extends JDialog implements ActionListener {
    private JPasswordField  edtPassword;
    private JTextField  edtUsername;

    public LoginDlg(JFrame owner) {
        super(owner, "Login", true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(createLoginPanel(), BorderLayout.CENTER);
        add(createButtonsPanel(), BorderLayout.PAGE_END);
        pack();
        setLocationRelativeTo(owner);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        dispose();
    }

    public String getEdtUsername() {
        return edtUsername.getText();
    }
    
    public String getEdtPassword() {
        return edtPassword.getText();
    }

    private JPanel createButtonsPanel() {
        JPanel buttonsPanel = new JPanel();
        JButton button = new JButton("Login");
        button.addActionListener(this);
        buttonsPanel.add(button);
        return buttonsPanel;
    }

    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets.bottom = 5;
        gbc.insets.left = 20;
        gbc.insets.right = 5;
        gbc.insets.top = 20;
        JLabel usrLabel = new JLabel("Username:");
        loginPanel.add(usrLabel, gbc);

        gbc.gridx = 1;
        gbc.insets.left = 5;
        gbc.insets.right = 20;
        edtUsername = new JTextField(15);
        loginPanel.add(edtUsername, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets.bottom = 20;
        gbc.insets.left = 20;
        gbc.insets.right = 5;
        gbc.insets.top = 5;
        JLabel pwLabel = new JLabel("Password");
        loginPanel.add(pwLabel, gbc);

        gbc.gridx = 1;
        gbc.insets.left = 5;
        gbc.insets.right = 20;
        edtPassword = new JPasswordField(15);
        loginPanel.add(edtPassword, gbc);
        return loginPanel;
    }
}
//   End of Login Dialog
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextPane();
        btnWithdraw = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtWithdraw = new javax.swing.JTextField();
        edtDeposit = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(txaOutput);

        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        jLabel1.setText("How much would you like to Withdraw?");

        jLabel2.setText("How much would you like to deposit?");

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        jButton1.setText("Calculator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(edtDeposit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(edtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(edtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposit)
                    .addComponent(jButton1))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
    displayBal(withdraw(currBalance, Float.parseFloat(edtWithdraw.getText())));
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
    displayBal(deposit(currBalance, Float.parseFloat(edtDeposit.getText())));
    }//GEN-LAST:event_btnDepositActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // setVisible(false);
        //dispose();
        new Financial_calculator().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Banking_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banking_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banking_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banking_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banking_System().setVisible(true);
            }
        });
    }
    
    public float withdraw(float curBalance, float withdrawAmount){
        
        float newBalance = 0;
        float bankCosts = 0;
        float counter = Math.floorDiv((long)withdrawAmount,100);
        
        bankCosts = (float) (2.02 * counter);
        
        newBalance = curBalance - withdrawAmount - bankCosts;
        
        newBalance = (float) (Math.round(newBalance * 100.0) / 100.0);
        currBalance = newBalance;
        return newBalance;
    }
    
    public float deposit(float curBalance, float depositAmount){

        float newBalance = 0;
        float bankCosts = 0;
        float counter = Math.floorDiv((long)depositAmount,100);
        
        bankCosts = (float) (1.82 * counter);
        
        newBalance = curBalance + depositAmount - bankCosts;
        
        newBalance = (float) (Math.round(newBalance * 100.0) / 100.0);
        currBalance = newBalance;
        return newBalance;
    }
    
    public void displayBal(float bal){
        txaOutput.setText("Current Balance is: R" + String.valueOf(bal));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JTextField edtDeposit;
    private javax.swing.JTextField edtWithdraw;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txaOutput;
    // End of variables declaration//GEN-END:variables
}
