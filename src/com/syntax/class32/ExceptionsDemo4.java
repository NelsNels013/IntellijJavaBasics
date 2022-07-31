package com.syntax.class32;

public class ExceptionsDemo4 {

    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(10/0);
            System.out.println("3");
        }catch (Exception e){
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");
        }finally {
            System.out.println("It will always be executed");
        }
        System.out.println("6");
    }
}
