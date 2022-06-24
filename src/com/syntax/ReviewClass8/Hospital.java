package com.syntax.ReviewClass8;

import javax.print.Doc;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Jane", "Smith");
        doc.printInfo();
        Doctor.hospital="UCSF";
        doc.work();

        //creating another doctor
        Doctor doctor=new Doctor("Joe", "Doe", "cardiologyst", 10);
        doctor.printInfo();
        doctor.work();

        //changing value of static variable
        Doctor.hospital="George Washington";
        doc.work();
        doctor.work();

        //Changing value of instance variable
        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital="Mayo Clinic";

        doc.work();
        doctor.work();

    }
}
