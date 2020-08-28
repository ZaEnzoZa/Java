/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Enzo
 */
//public class Inheritance {

    class Vehicle {
        public void move() {
            System.out.println("I am Moving");
        }
    }
    
    class Bicycle extends Vehicle{
        public void manualMove() {
            System.out.println("I am using my Legs to move");
        }
    } 
    
    class PoweredVehicle extends Vehicle{
//        @Override
        public void engineMove() {
            System.out.println("My engine is making me move");
            }
        
            public static void main(String[] args) {
            PoweredVehicle car = new PoweredVehicle();
            Bicycle bmx = new Bicycle();
            car.engineMove();
            car.move();
            bmx.manualMove();
            bmx.move();
        }
    }
    
//}
