/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleTwo;

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


class Ford extends Vehicle {
    private String modelName = "Pinto";            //car attribute
    private String engine = "Turbo Charged";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Ford() {
    }

    @Override
    public String toString() {
        return "Ford{" + "modelName=" + modelName + ", engine=" + engine + '}';
    }

    
    public static void main(String[] args) {
        // Create a myCar Object
        Ford myCar = new Ford();
        
        //Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
        
        //Display the value of the brand  attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand +" "+ myCar.modelName);
        System.out.println("The engine is "+ myCar.engine);
        
        if (myCar.modelName.equals("Fiesta")) {
            System.out.println("Performance is low");
        } else if (myCar.modelName.equals("Pinto")) {
            System.out.println("Performance is average");
        } else if (myCar.modelName.equals("Focus")) {
            System.out.println("Performance is above average");
        }
        System.out.println("This is a Ford "+ myCar.modelName +" we are talking about");
    }
}