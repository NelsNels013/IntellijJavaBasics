package com.syntax.class23;

public class Animal {

    Animal(){
        System.out.println("Parent");
    }
    void eat(){
        System.out.println("All animals eat");
    }
}

class Panda extends Animal{
    // no other class can inherit from animal class because its declared final
    final double G=9.8;

    void eat(){
        //G=10; //can't change it cause G was declared final
        System.out.println("All animals eat");
    }

    Panda(){
        System.out.println("Child");
    }
}
class Tester{
    public static void main(String[] args) {
        new Panda();
    }
}