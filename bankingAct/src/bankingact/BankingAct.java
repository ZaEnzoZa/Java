/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingact;

/**
 *
 * @author Enzo
 */
public class BankingAct {

    public class RegularAccount {
        String name, pin;
        double balance, minBalance, penalty;
    }

    public class CheckAccount {
        String name, pin;
        double balance, minBalance, interrest, penalty;
        int transactions;
    }
         
    public class InterrestAccount {
        String name, pin;
        double balance, interrest;
    }
    
    public class CDAccount{
        String name, pin;
        double balance, interrest, penalty;
        int months;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
