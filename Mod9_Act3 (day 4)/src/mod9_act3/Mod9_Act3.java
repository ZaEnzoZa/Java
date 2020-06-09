/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9_act3;

/**
 *
 * @author Enzo
 */
public class Mod9_Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 500 are :");
        
        for (int i = 2; i < 501; i++) {
            if (isPrime(i)) {
                System.out.println(i+ ": is a Prime");
            } else {
                System.out.println(i);
            }  
        }
       
    }
    public static Boolean isPrime(int a) {
        for(int i=2;i<a;i++) {
        if(a%i==0)
            return false;
    }
    return true;
    }
}
