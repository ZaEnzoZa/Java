/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9_act1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Enzo
 */
public class Mod9_Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {10, 22, 20, 10, 11, 0}; 
        int end = arr.length;
            Set<Integer> set = new HashSet<>();
        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }
        Iterator it = set.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
    