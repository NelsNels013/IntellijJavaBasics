package com.syntax.reviewClass8;

public class Doctor {
    public String firstName, lastName;
    protected String specialty;
    int experience;
    private double salary;
    public static String hospital; //static is used when the variable remains the same for all methods
    public Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    Doctor(String firstName, String lastName, String specialty, int experience){
        this(firstName, lastName);
        this.specialty=specialty;
        this.experience=experience;

    }
    public void printInfo(){
        System.out.println("Doctor name is "+firstName+" "+lastName+" and speciality is "+specialty);
    }
    //instance accessing both static and instance
    protected void work(){
        System.out.println("Doctor "+lastName+" works at "+hospital);
    }
    void treat(String patientName){
        this.printInfo();
        System.out.println("Treats patient "+patientName);
    }
    private void getPaid(){
        System.out.println("Doctor "+lastName+" gets paid "+salary);
    }
    //static method can work only with static variables and methods
    public static void study(String university){
        //printInfo(); CE: Cannot make a static reference to the non-static
        System.out.println("Doctor studied at "+university+" and now works at "+hospital);
    }
}
