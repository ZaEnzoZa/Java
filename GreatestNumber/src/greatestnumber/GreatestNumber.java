/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestnumber;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class GreatestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();
        System.out.println("Enter a second number");
        int b = scan.nextInt();
        System.out.println("Enter a third number");
        int c = scan.nextInt();
        
        if (a > b && a > c) {
            System.out.println("The largest number is: "+ a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is: "+ b);
        } else if (c > a && c > b) {
            System.out.println("The largest number is: "+ c);
        }
    }
    
}
