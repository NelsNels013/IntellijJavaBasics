package com.syntax.class15;

public class VariablesDemo2 {

    String name; // instance variable
    static int num5; // static

    void printName() {
        String name = "Local"; // Local variable
        System.out.println(name);
    }

    int num=10;// whenever you have to share some

    void method(){
        int num=20;
        System.out.println(num);
    }

    void method2(){
        //System.out.println(num2);
        System.out.println(num);

    }
}