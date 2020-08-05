/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author Alex
 */
public class User {
    String name, surname, username, password, number;
    private int id;
    int balance;
    
    
    public User(){}
    
    public User(String Name, String Surname, String Username, String Password,
            String Number, int Balance){
        this.name = Name;
        this.surname = Surname;
        this.username = Username;
        this.password = Password;
        this.number = Number;
        this.balance = Balance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }
    public String getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
