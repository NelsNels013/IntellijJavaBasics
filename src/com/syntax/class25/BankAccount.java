package com.syntax.class25;

public class BankAccount {

    private String name;
    private String username;
    private String password;
    private double balance;
    private int age;

    public void setName(String name) {
        //123Mante
        String nameWithoutNumbers = name.replaceAll("[^A-Za-z]", "");
        //Mante
        if (nameWithoutNumbers.equals(name)) {
            System.out.println("Numbers not present in the name, checking more rules");
            this.name = name;
        } else {
            System.out.println("Only alphabets are allowed");
        }
    }

    public void setUsername(String userName) {
        if (userName.length() > 8 && userName.length() < 15) {
            System.out.println("Username accepted");
            this.username = userName;
        } else {
            System.out.println("User names should be greater than 8 characters or less then 15");
        }
    }

    double getBalance(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            return balance;
        } else {
            return -1;
        }
    }
}

