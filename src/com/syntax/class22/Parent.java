package com.syntax.class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hey Mante we have found a girl for you to get married to");
    }
}
class Mante extends Parent{
    void getMarried(){
        System.out.println("I want to try on Shakira first");
    }
public static void main(String[]args){
        Mante mante=new Mante();
        mante.getMarried();

        }
}