package com.syntax.class33;

public class InsufficientFunds extends RuntimeException{
    //To Create a custom exception simple create a class and extend it from RuntimeException or any other
    //Exception if you want to create a checked exception extend from Exception class otherwise
    // RuntimeException
    InsufficientFunds(String message){
        super(message);
    }
}
