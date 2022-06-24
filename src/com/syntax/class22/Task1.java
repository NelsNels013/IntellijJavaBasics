package com.syntax.class22;

public class Task1 {
    /*
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
 */
    static void area(double length, double width){
        System.out.println("Area "+(length*width));
    }
    static void area(double length){
        System.out.println("Area "+(length*length));
    }
    static void volume(double length, double width, double height){
        System.out.println("Volume of box "+(length*width*height));
    }

    public static void main(String[] args) {
        area(10);
    }
}
