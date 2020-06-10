/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Enzo
 */

class Car {
    String brand;
    
        public Car() {
            this.brand = "Ford";
        }
        
        public String getBrand() {
            return brand;
        }
    
        void run() {
            System.out.println("Car is running...");
        }
    }
public class Test {
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        Car ford = new Car(); 
        String brand = ford.getBrand();
        System.out.println(brand);
    }
    
}
