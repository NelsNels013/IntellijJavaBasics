package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        /*Car car=new Tesla();
        car=new Toyota(); // reassigning the value
        car.start();
        //Tesla tesla=new Car();*/
        /*BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();*/

        /*Car car=new BMW(); //replace the object to test all
        car.start();         //methods above quicker
        car.stop();
        car.park();*/

        Car[] cars={new BMW(),new Tesla(),new Toyota()};

        for(Car c:cars){ //you can create an array to
            c.start();   //to test all objects at the
            c.stop();    //same time replacing the above
            c.park();    //code.
        }
    }
}
