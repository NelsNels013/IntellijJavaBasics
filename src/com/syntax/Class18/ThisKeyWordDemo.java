package com.syntax.Class18;

public class ThisKeyWordDemo {
    String name="instance";
    void printName(){
        String name="local";
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThisKeyWordDemo t=new ThisKeyWordDemo();
        t.printName();
    }
}
