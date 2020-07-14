/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mzamomstha.registration;

import javax.swing.JOptionPane;


/**
 *
 * @author Enzo
 */
public class Login extends javax.swing.JFrame {   
    
    //go to Learner Database
    public LearnerDatabase learnerDatabaseFrame;
    
    public void setLearnerDatabase (LearnerDatabase learnerDatabaseFrame) {
        this.learnerDatabaseFrame = learnerDatabaseFrame;
    }
    
    public void openLearnerDataBase() {
        this.dispose();
        new LearnerDatabase().setVisible(true);
    }
    
    //go to teacher Database
    public TeacherDatabase teacherDatabase;
    
    public void setTeacherDatabase (TeacherDatabase teacherDatabase) {
        this.teacherDatabase = teacherDatabase;
    }
    
    public void openTeacherDatabase() {
        this.dispose();
        new TeacherDatabase().setVisible(true);
    }
    
    //go to Parent Database
    public ParentDatabase parentDatabase;
    
    public void setParentDatabase (ParentDatabase parentDatabase) {
        this.parentDatabase = parentDatabase;
    }
    
    public void openParentDatabase() {
        this.dispose();
        new ParentDatabase().setVisible(true);
    }
    
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtUsername = new javax.swing.JTextField();
        edtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Frame");
        setLocation(new java.awt.Point(0, 0));
        setName("loginFrame"); // NOI18N

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(100, 100, 100)
                                .addComponent(edtPassword))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(100, 100, 100)
                                .addComponent(edtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnLogin)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(edtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnLogin)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("loginFrame");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        boolean parentLogin = false;
        boolean teacherLogin = false;
        boolean adminLogin = false;
        boolean learnerLogin = false;
        String username = edtUsername.getText();
        String password = edtPassword.getText();
        
        //Leaner Login Details
        if (username.equals("Enzo") && password.equals("EnzoPassword")) {
            learnerLogin = true;
        }
        //Parent Login Details
        if (username.equals("Sharon") && password.equals("SharonPassword")) {
            parentLogin = true;
        }
        //Teacher Login Details
        if (username.equals("Karl") && password.equals("KarlPassword")) {
            teacherLogin = true;
        }
        //Admin Login Details
        if (username.equals("Michael") && password.equals("MichaelPassword")) {
            adminLogin = true;
        }
        
        if (learnerLogin) {
            openLearnerDataBase();
        } else if (parentLogin) {
            openParentDatabase();
        } else if (teacherLogin) {
            openTeacherDatabase();
        } else if (parentLogin == false || teacherLogin == false || learnerLogin == false) {
            JOptionPane.showMessageDialog(null, "incorrect Username or Password");
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}