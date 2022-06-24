package com.syntax.ReviewClass8;

public class Doctor {
    String firstName, lastName, specialty;
    int experience;
    double salary;
    static String hospital; //static is used when the variable remains the same for all methods
    Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    Doctor(String firstName, String lastName, String specialty, int experience){
        this(firstName, lastName);
        this.specialty=specialty;
        this.experience=experience;

    }
    void printInfo(){
        System.out.println("Doctor name is "+firstName+" "+lastName+" and speciality is "+specialty);
    }
    void work(){
        System.out.println("Doctor "+lastName+" works at "+hospital);
    }
}
