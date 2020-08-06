package banking;

import java.awt.Color;
import javax.swing.JOptionPane;
import banking.Banking_System;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class Financial_calculator extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public Financial_calculator() {
        initComponents();
        try {
            Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/banking_system","root", "root");
        } catch (SQLException e) {
        }    
        rFinalAmt.setSelected(true);
        edtFinalAmt.setText("");
        edtFinalAmt.setEnabled(false);
        edtFinalAmt.setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ValueSelector = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        edtFinalAmt = new javax.swing.JTextField();
        edtPrincipal = new javax.swing.JTextField();
        edtInterest = new javax.swing.JTextField();
        edtNumPeriods = new javax.swing.JTextField();
        rFinalAmt = new javax.swing.JRadioButton();
        rPrincipalAmt = new javax.swing.JRadioButton();
        rInterest = new javax.swing.JRadioButton();
        rNumPeriods = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 240, 137));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Amount:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Start amount:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("What would you like to calculate:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Interest:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number of periods:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jButton1.setText("Calculate simple interest");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 220, 30));
        jPanel1.add(edtFinalAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 100, -1));

        edtPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(edtPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 100, -1));
        jPanel1.add(edtInterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 100, -1));
        jPanel1.add(edtNumPeriods, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 100, -1));

        rFinalAmt.setBackground(new java.awt.Color(51, 51, 51));
        ValueSelector.add(rFinalAmt);
        rFinalAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rFinalAmt.setForeground(new java.awt.Color(255, 255, 255));
        rFinalAmt.setText("Final amount");
        rFinalAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFinalAmtActionPerformed(evt);
            }
        });
        jPanel1.add(rFinalAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        rPrincipalAmt.setBackground(new java.awt.Color(51, 51, 51));
        ValueSelector.add(rPrincipalAmt);
        rPrincipalAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rPrincipalAmt.setForeground(new java.awt.Color(255, 255, 255));
        rPrincipalAmt.setText("Principal amount");
        rPrincipalAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPrincipalAmtActionPerformed(evt);
            }
        });
        jPanel1.add(rPrincipalAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        rInterest.setBackground(new java.awt.Color(51, 51, 51));
        ValueSelector.add(rInterest);
        rInterest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rInterest.setForeground(new java.awt.Color(255, 255, 255));
        rInterest.setText("Interest");
        rInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rInterestActionPerformed(evt);
            }
        });
        jPanel1.add(rInterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        rNumPeriods.setBackground(new java.awt.Color(51, 51, 51));
        ValueSelector.add(rNumPeriods);
        rNumPeriods.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rNumPeriods.setForeground(new java.awt.Color(255, 255, 255));
        rNumPeriods.setText("Number of periods");
        rNumPeriods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNumPeriodsActionPerformed(evt);
            }
        });
        jPanel1.add(rNumPeriods, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jButton2.setText("Calculate compound interest");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 220, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("R");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("R");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("%");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Results:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Calculator:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 220, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calculator_background.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (rFinalAmt.isSelected()) {
            try {
                int P = Integer.parseInt(edtPrincipal.getText());
                double I = Double.parseDouble(edtInterest.getText()) / 100;
                int N = Integer.parseInt(edtNumPeriods.getText());
                double A = (double) (I * N);
                A = A + 1;
                A = A * P;
                jTextArea1.setText("Final Amount: R " + String.valueOf(A));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }
        if (rInterest.isSelected()) {
            try {
                int A = Integer.parseInt(edtFinalAmt.getText());
                int N = Integer.parseInt(edtNumPeriods.getText());
                int P = Integer.parseInt(edtPrincipal.getText());

                //A = P(1+In)
                double I = (double) A / P;
                I = I - 1;
                I = I / N;
                jTextArea1.setText("Your needed interest is: " + String.valueOf(I) + "%");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }
        if (rNumPeriods.isSelected()) {
            try {
                int A = Integer.parseInt(edtFinalAmt.getText());
                int P = Integer.parseInt(edtPrincipal.getText());
                double I = Double.parseDouble(edtInterest.getText()) / 100;

                int N = (int) (A / P);
                N = N - 1;
                N = (int) ((int) N / I);

                System.out.println(String.valueOf(N));
                jTextArea1.setText("The number of periods required is: " + String.valueOf(N));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }
        if (rPrincipalAmt.isSelected()) {
            try {
                int A = Integer.parseInt(edtFinalAmt.getText());
                double I = Double.parseDouble(edtInterest.getText()) / 100;
                int N = Integer.parseInt(edtNumPeriods.getText());

                int P = (int) (A / (1 + (I * N)));
                jTextArea1.setText("The required principal amount is: R" + String.valueOf(P));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void edtPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPrincipalActionPerformed

    private void rFinalAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFinalAmtActionPerformed
        clearFields();
        edtFinalAmt.setEnabled(false);
        edtFinalAmt.setBackground(Color.darkGray);

        if (!edtInterest.isEnabled()) {
            edtInterest.setEnabled(true);
            edtInterest.setBackground(Color.white);
        }
        if (!edtNumPeriods.isEnabled()) {
            edtNumPeriods.setEnabled(true);
            edtNumPeriods.setBackground(Color.white);
        }
        if (!edtPrincipal.isEnabled()) {
            edtPrincipal.setEnabled(true);
            edtPrincipal.setBackground(Color.white);
        }

    }//GEN-LAST:event_rFinalAmtActionPerformed

    private void rPrincipalAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPrincipalAmtActionPerformed
        clearFields();
        edtPrincipal.setEnabled(false);
        edtPrincipal.setBackground(Color.darkGray);

        if (!edtFinalAmt.isEnabled()) {
            edtFinalAmt.setEnabled(true);
            edtFinalAmt.setBackground(Color.white);
        }
        if (!edtInterest.isEnabled()) {
            edtInterest.setEnabled(true);
            edtInterest.setBackground(Color.white);
        }
        if (!edtNumPeriods.isEnabled()) {
            edtNumPeriods.setEnabled(true);
            edtNumPeriods.setBackground(Color.white);
        }

    }//GEN-LAST:event_rPrincipalAmtActionPerformed

    private void rInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rInterestActionPerformed
        clearFields();
        edtInterest.setEnabled(false);
        edtInterest.setBackground(Color.darkGray);

        if (!edtFinalAmt.isEnabled()) {
            edtFinalAmt.setEnabled(true);
            edtFinalAmt.setBackground(Color.white);
        }
        if (!edtNumPeriods.isEnabled()) {
            edtNumPeriods.setEnabled(true);
            edtNumPeriods.setBackground(Color.white);
        }
        if (!edtPrincipal.isEnabled()) {
            edtPrincipal.setEnabled(true);
            edtPrincipal.setBackground(Color.white);
        }
    }//GEN-LAST:event_rInterestActionPerformed

    private void rNumPeriodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNumPeriodsActionPerformed
        clearFields();
        edtNumPeriods.setEnabled(false);
        edtNumPeriods.setBackground(Color.darkGray);

        if (!edtFinalAmt.isEnabled()) {
            edtFinalAmt.setEnabled(true);
            edtFinalAmt.setBackground(Color.white);
        }
        if (!edtInterest.isEnabled()) {
            edtInterest.setEnabled(true);
            edtInterest.setBackground(Color.white);
        }
        if (!edtPrincipal.isEnabled()) {
            edtPrincipal.setEnabled(true);
            edtPrincipal.setBackground(Color.white);
        }
    }//GEN-LAST:event_rNumPeriodsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (rFinalAmt.isSelected()) {
            try {
                int P = Integer.parseInt(edtPrincipal.getText());
                double I = Double.parseDouble(edtInterest.getText()) / 100;
                int N = Integer.parseInt(edtNumPeriods.getText());

                //A = P(1+I)^n
                double A = (double) Math.pow((1 + I), N);
                A = (double) A * P;
                jTextArea1.setText("Final Amount: R " + String.valueOf(A));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }
        if (rInterest.isSelected()) {
            try {
                int A = Integer.parseInt(edtFinalAmt.getText());
                double N = Double.parseDouble(edtNumPeriods.getText());
                int P = Integer.parseInt(edtPrincipal.getText());

                //A = P(1+I)^n
                double I = (double) A / P;
                I = (double) Math.pow(I, 1 / N);
                I = (double) I - 1;

                jTextArea1.setText("Your needed interest is: " + String.valueOf(I) + "%");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }
        if (rNumPeriods.isSelected()) {
            try {
                double A = Double.parseDouble(edtFinalAmt.getText());
                double P = Double.parseDouble(edtPrincipal.getText());
                double I = Double.parseDouble(edtInterest.getText()) / 100;

                //A = P(1+I)^n
                double N = (double) A / P;
                N = Math.pow(N, 1 / (1 + I));

                jTextArea1.setText("The number of periods required is: " + String.valueOf(N));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }
        if (rPrincipalAmt.isSelected()) {
            try {
                double A = Double.parseDouble(edtFinalAmt.getText());
                double I = Double.parseDouble(edtInterest.getText()) / 100;
                double N = Double.parseDouble(edtNumPeriods.getText());

                //A = P(1+I)^n
                double P = Math.pow((1 + I), N);
                P = (double) A / P;
                jTextArea1.setText("The required principal amount is: R" + String.valueOf(P));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please ensure that you are only using valid numbers");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Banking_System().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void clearFields() {
        edtFinalAmt.setText("");
        edtInterest.setText("");
        edtNumPeriods.setText("");
        edtPrincipal.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ValueSelector;
    private javax.swing.JTextField edtFinalAmt;
    private javax.swing.JTextField edtInterest;
    private javax.swing.JTextField edtNumPeriods;
    private javax.swing.JTextField edtPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rFinalAmt;
    private javax.swing.JRadioButton rInterest;
    private javax.swing.JRadioButton rNumPeriods;
    private javax.swing.JRadioButton rPrincipalAmt;
    // End of variables declaration//GEN-END:variables
}
