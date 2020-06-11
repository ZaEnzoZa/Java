/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findindex;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class FindIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Scanner scan = new Scanner(System.in);
        System.out.println("What number do you wan the index of?");
        int element = scan.nextInt();
        int index = 0;
        
        for (int i = 0; i < Array.length; i++) {
            if (element == Array[i]) {
                index = i;
            }
        }
        System.out.println("The index of "+ element +" is "+ index);
    }
    
}
