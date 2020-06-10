/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class Average {

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
        int total = a + b + c;
        System.out.println("Your total is: "+ total);
        double average = total / 3;
        System.out.println("Your Average is: "+average);
    }
    
}
