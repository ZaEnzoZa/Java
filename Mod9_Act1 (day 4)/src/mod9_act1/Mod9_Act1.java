/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9_act1;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class Mod9_Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
       Scanner scanInt = new Scanner(System.in);
       System.out.println("What is the first number?");
       int a = scanInt.nextInt();
       System.out.println("What is the second number?");
       int b = scanInt.nextInt();
       int total = getTotal(a, b);
        
       System.out.print("The sum of "+ a +" and "+ b +" is "+ total +" ");
    }
    
    public static int getTotal (int a, int b) {
        return a + b;
    }
    
}