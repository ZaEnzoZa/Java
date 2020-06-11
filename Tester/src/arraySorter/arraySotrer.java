/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraySorter;
 import java.util.Arrays;
/**
 *
 * @author Enzo
 */
public class arraySotrer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] nums =  {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    
}
