/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errors;

/**
 *
 * @author Enzo
 */
public class Errors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to my first program!\n");                                       //compile error
        String ageStr = "24 years";
        int age = Integer.parseInt(ageStr.substring(0,2));                                          //run-time error
        System.out.println("I'm " + age + " years old.");                                           //compile error
        int three = 3;                                                                              //compile error
        int answerYears = age + three;
        System.out.println("Toal number of years: " + answerYears);
        int answerMonths = (answerYears * 12) + 6; 
        System.out.println("In 3 years and 6 months, I'll be " + answerMonths + " months old");

        //Once you've corrected all the errors, the answer should be 330.
    }
    
}
