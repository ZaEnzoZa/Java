/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enzo
 */
public class AddElements {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static double main(String[] args) {
        
        double [][] nums = {
            {1, 5, 2.5, 6.9, 2},
            {5, 7, 8.0, 7.1, 5},
            {6, 8, 4.5, 6.5, 7},
            {9, 5, 7.5, 9.5, 7},
        };
        
        double sum=0;
        double amount=0;
        
        for (double[] row : nums)
        for (double val : row) {
        sum += val; amount += 1;
        }

       return sum / (double) amount;
    }
    
}
