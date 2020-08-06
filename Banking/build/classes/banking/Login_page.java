package banking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Alex
 */
public class Login_page extends javax.swing.JFrame {

    private static SessionFactory factory;
    Connection con = null;
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbLink = "jdbc:mysql://localhost/banking?autoReconnect=true&useSSL=false";
    String dbUname = "root";
    String dbPswd = "root";
    ResultSet rs;
    Statement stmt = null;

    public Login_page() {
        initComponents();
        checkDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtUsername = new javax.swing.JTextField();
        edtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(edtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 117, -1));
        jPanel1.add(edtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 117, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, -1));

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 90, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login_screen.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(dbLink, dbUname, dbPswd);
            stmt = con.createStatement();
            String query = "Select * from banking.users where Username = '"
                    + edtUsername.getText() + "' AND Password = '"
                    + String.valueOf(edtPassword.getPassword()) + "'";
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                int ID = rs.getInt("id");
                String name = rs.getString("Name");
                String Sname = rs.getString("Surname");
                String Num = rs.getString("Number");
                String Uname = rs.getString("Username");
                String pswd = rs.getString("Password");
                int Balance = rs.getInt("Balance");

                saveUserDetails(ID, name, Sname, Uname, pswd, Num, Balance);

                new Banking_System().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }

        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Registration_form().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void saveUserDetails(int id, String Name, String Surname, String Username, String Password,
            String Number, int Balance) throws IOException {

        File myFile = new File("User.txt");
        FileWriter writer = new FileWriter(myFile);
        writer.write(String.valueOf(id) + "," + Name + "," + Surname + "," + Password + "," + Number
                + "," + String.valueOf(Balance));

        writer.close();
    }

    public void CheckTables() {
        try {
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(dbLink, dbUname, dbPswd);
            stmt = con.createStatement();
            String query = "select * from banking.users";
            rs = stmt.executeQuery(query);

            stmt.close();
            rs.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1146) {
                createTables();
            } else {
                Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void checkDB() {
        try {
            factory = new Configuration().configure().buildSessionFactory();
            CheckTables();
        } catch (HibernateException e) {
            System.out.println("You messed up");
            throw new ExceptionInInitializerError(e);
        }
    }

    public void createTables() {
        try {
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(dbLink, dbUname, dbPswd);
            stmt = con.createStatement();
            String query = "create table users ( "
                    + "id INT NOT NULL auto_increment,"
                    + "Name VARCHAR(25) default NULL,"
                    + "Surname VARCHAR(25) default NULL,"
                    + "Number VARCHAR(25) default NULL,"
                    + "Username VARCHAR(25) default NULL,"
                    + "Password VARCHAR(25) default NULL,"
                    + "Balance INT default NULL,"
                    + "PRIMARY KEY (id));";
            stmt.executeUpdate(query);

            stmt.close();
            con.close();
            System.out.println("Successfully created new table");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void testConnection(){
        
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Login_page().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
