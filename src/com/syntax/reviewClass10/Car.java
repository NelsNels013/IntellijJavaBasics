package com.syntax.reviewClass10;

public abstract class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    abstract void park();
    void start(){
        System.out.println("Use keys to start me");
    }
}

class BMW extends Car{

    public BMW(String make, String model) {
        super(make, model);
    }

    @Override
    void park() {
        System.out.println("Use my auto parking mode to park me");
    }
}
