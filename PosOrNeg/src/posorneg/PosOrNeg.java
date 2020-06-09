/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posorneg;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class PosOrNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a Number");
        int a = scan.nextInt();
        
        if (a >=0 ) {
            System.out.println(a +" is a Positive number!");
        } else if (a < 0) {
            System.out.println(a +" is a Negative number");
        }
    }
    
}
