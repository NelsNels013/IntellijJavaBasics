package com.syntax.Class18;

public class CarTester {

    public static void main(String[] args) {
        Car car1=new Car("Audi", "RS6", "Blue");
        car1.printInfo();
        Car car2=new Car("Toyota", "GR Supra", "Black");
        car2.printInfo();

        Car car=new Car();
        car.printCarModel();
    }
}
