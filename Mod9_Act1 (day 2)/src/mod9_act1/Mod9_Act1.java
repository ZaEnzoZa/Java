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
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter your second number: "); 
        int num2 = scan.nextInt();
        System.out.print("Enter your third number: ");  
        int num3 = scan.nextInt();
        System.out.print("Enter your fourth number: ");
        int num4 = scan.nextInt();
        System.out.print("Enter your fith number: ");
        int num5 = scan.nextInt();
        
        double sumAll = num1 + num2 + num3 + num4 + num5;
        
        double average = sumAll / 5;
        
        System.out.println("The average is: "+ average +"%");
    }
    
}
