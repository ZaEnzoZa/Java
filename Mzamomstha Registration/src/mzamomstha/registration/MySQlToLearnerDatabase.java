/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mzamomstha.registration;

/**
 *
 * @author Enzo
 */
class MySQlToLearnerDatabase {
    private int ID;
    private String name, surname, gender, DoB, number;
    
    public MySQlToLearnerDatabase (int ID, String name, String surname, String gender, String DoB, String number) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.DoB = DoB;
        this.number = number;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getDoB() {
        return DoB;
    }

    public String getNumber() {
        return number;
    }
    
    
    
}
