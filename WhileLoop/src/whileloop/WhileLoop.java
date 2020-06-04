/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        int nums = 0;
 
        System.out.println("What is the maxinum number you want the odd or even to?");
        int maxValue = scanInt.nextInt();
        System.out.println("Do you want the odd or even numbers from 0 to "+ maxValue +"?");
        String oddOrEven = scanString.nextLine();
        System.out.println("The "+ oddOrEven +" numbers from 0 to "+ maxValue +" are:");
        
        if (oddOrEven.equals("odd")) {
            nums = 1;
        }
        
        while (nums < maxValue) {            
            System.out.println(nums);
            
            nums += 2;
        }
        
    }
    
}
