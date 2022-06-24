package com.syntax.class20;

public class AppleLaptop extends Laptop{
    void printMake() {
        //can't access because we are in a different package
        System.out.println(make);
    }
}
