package com.syntax.class23;

public class Parent {

    public static void eat(){
        System.out.println("I like to eat Pupusas");
    }
    public static void sleep(){
        System.out.println("I like to sleep 8 hours");
    }
    public static void activity(){
        System.out.println("Go to Beach");
    }
}
class Child extends Parent{

    public static void activity(){
        System.out.println("Go to the Bar");
    }
}
class ParentTester{
    public static void main(String[] args) {
        //Child mante=new Child(); //you dont do this when working with static methods
        Child.sleep();             //use class name (Child) when working with static
        Child.activity();

        Parent.activity();
        Child.activity();
    }
}