/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthlysavings;

import javax.swing.JOptionPane;

/**
 *
 * @author Enzo
 */
public class MonthlySavings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String accountName = JOptionPane.showInputDialog("What is the name of the account?");
        String sBalance = JOptionPane.showInputDialog("How much money do you want to put in your saving account?");
        
        double balance = Float.parseFloat(sBalance);
        
        double yearlyRate =0.025;
        
        for (int i = 0; i < 12; i++) {
            String withdrawMoney = JOptionPane.showInputDialog("How much do you want to withdraw?");
            int withdraw = Integer.parseInt(withdrawMoney);
            
            balance = balance - withdraw;
            balance = balance + (yearlyRate / 12) * balance;
            JOptionPane.showMessageDialog(null, "Your balance this month is: "+ balance);
        }
        JOptionPane.showMessageDialog(null, "The final balance of "+ accountName +"'s account is: "+ balance);
    }
    
}
