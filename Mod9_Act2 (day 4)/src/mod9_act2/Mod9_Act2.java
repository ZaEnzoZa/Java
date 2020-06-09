/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9_act2;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class Mod9_Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanString = new Scanner(System.in);
        System.out.println("What word or phrase would you like to be counted?");
        String word = scanString.nextLine().toUpperCase();
        int counter = 0;
        
        for(int i = 0; i < word.length(); i++)
        {
            if(isVowel(word.charAt(i)))
            {
                counter++;
            }
        
    }
       
        System.out.println("There are "+ counter +" vowels");
        }
    
    public static Boolean isVowel(char letter) {
        switch(letter) {
            case 'A':        
            case 'E':          
            case 'I':           
            case 'O':           
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
