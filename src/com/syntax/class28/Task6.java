package com.syntax.class28;

import org.apache.commons.compress.utils.OsgiUtils;

import java.util.ArrayList;

public class Task6 {
    /*Create a class Insurance that will have an attribute as insuranceName and unimplemented
 behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/
    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Pets("Petco", "Happy Dogs"));
        insurances.add(new Car("Geico", "Audi RS6"));
        insurances.add(new Health("Wrong turn pic"));

        for (Insurance insurance : insurances) {
            insurance.getQuote();
             insurance.cancelInsurance();
        }
    }
}

abstract class Insurance{
    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();
}

class Car extends Insurance{
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("2% of your cars price");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Car Insurance cancelled");
    }
}

class Pets extends Insurance {
    String petType;

    public Pets(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("$90 for insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Pet insurance cancelled");
    }
}

class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("300/Month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Health Insurance cancelled");
    }
}