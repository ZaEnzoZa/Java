/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatdayofweek;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class WhatDayOfWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number of the day is it? (1-7)");
        int day = scan.nextInt();
        if (day > 7 || day < 1) {
            System.out.println("Try again and please input a number from 1 to 7");
        }
            switch (day) {
                case 1:
                    System.out.println("Today is Monday");
                    break;
                case 2:
                    System.out.println("Today is Tuesday");
                    break;
                case 3:
                    System.out.println("Today is Wednesday");
                    break;
                case 4:
                    System.out.println("Today is Thursday");
                    break;
                case 5:
                    System.out.println("Today is Friday");
                    break;
                case 6:
                    System.out.println("Today is Saterday");
                    break;
                case 7:
                    System.out.println("Today is Sunday");
                    break;   
            }
            
        
    }
    
}
