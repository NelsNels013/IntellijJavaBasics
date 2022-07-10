package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("Use keys to start me");
    }

    void stop(){
        System.out.println("Use brakes to stop me");
    }

    void park(){
        System.out.println("You can park me manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("You can push start button to start me");
    }

    @Override
    void stop() {
        System.out.println("You can use auto break or manual break to stop me");
    }
}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("You can start me from app");
    }

    @Override
    void stop() {
        System.out.println("You can use auto breaking to stop me");
    }

    @Override
    void park() {
        System.out.println("I can park myself");
    }
}
class Toyota extends Car{

}