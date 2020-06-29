/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enzo
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Database
        StudentDetails data= new StudentDetails();
        data.createConnection();
        
        
        
        
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("What is your Name?");
//        String name = scan.nextLine();
//        
//        System.out.println("What is your Surname?");
//        String surname = scan.nextLine();
//        
//        System.out.println("What is your date of birth? (yyyy/mm/dd)");
//        String dob = scan.nextLine();
//        
//        System.out.println("What is your gender?");
//        String gender = scan.nextLine();
//        
//        System.out.println("What grade are you in?");
//        int grade = scan.nextInt();
//        
//        System.out.println("");
//        System.out.println("Student Name: "+ name);
//        System.out.println("Student Surname: "+ surname);
//        System.out.println("Student Date of Birth: "+ dob);
//        System.out.println("Student Gender: "+ gender);
//        System.out.println("Student Grade: "+ grade);
    }
    
    void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","root");
            System.out.println("Database Connected Succesfully");
        }catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
