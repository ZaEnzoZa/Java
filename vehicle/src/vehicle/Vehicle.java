/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Enzo
 */

class Vehicle {
    protected String brand = "Mazda";
    public void honk() {                        //vehicle attribute
        System.out.println("Tuut,tuut");        //vehicle method
    }
}


class Mazda extends Vehicle {
    private String modelName = "CX-7";            //car attribute
    private String engine = "Turbo Charged";

    
    public static void main(String[] args) {
        // Create a myCar Object
        Mazda myCar = new Mazda();
        
        //Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
        
        //Display the value of the brand  attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand +" "+ myCar.modelName);
        System.out.println("The engine is "+ myCar.engine);
        
        if (myCar.modelName.equals("CX-3")) {
            System.out.println("Performance is low");
        } else if (myCar.modelName.equals("CX-5")) {
            System.out.println("Performance is average");
        } else if (myCar.modelName.equals("CX-7")) {
            System.out.println("Performance is above average");
        }
        System.out.println("This is a Mazda "+ myCar.modelName +" we are talking about");
    }
}