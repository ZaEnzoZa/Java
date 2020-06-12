/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysum;

import java.util.Arrays;

/**
 *
 * @author Enzo
 */
public class ArraySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] nums =  {39, 28099};
        int total = 0;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        System.out.println("The sum is "+ total);
    }
    
}
