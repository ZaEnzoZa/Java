/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_training;



class Person {
    String fName;
    int fAge;
    
    public Person(String sName, int sAge) {
        fName = sName;
        fAge = sAge;
   }
    
}






/**
 *
 * @author Enzo
 */
public class Technical_training {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person neo = new Person("Neo", 15);
        Person kabo = new Person("Kabo", 6);
        System.out.println(neo.fName +" is "+ neo.fAge +" years old");
        System.out.println(kabo.fName +" is "+ kabo.fAge +" years old");
    }
    
}
