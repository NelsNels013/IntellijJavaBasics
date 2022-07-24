package com.syntax.reviewClass10;

public class Flower {

    String color;
    Flower(String color){
        this.color=color; //we can use this keyword to distinguish a local and instance variable
    }
    void showColor(){
        System.out.println("Flowers have beautiful colors");
    }
    void smell(){
        System.out.println("Flowers smell good");
    }
    void bloom(){
        System.out.println("Generally bloom in Spring");
    }
}

class Rose extends Flower{

    Rose(String color) {
        super(color);
    }
    void showColor(){
        System.out.println("Roses have "+color+" Colors");
    }
    void bloom(){
        System.out.println("Roses bloom in March");
    }
    void thorns(){
        System.out.println("Please be careful");
    }
}

class Tulip extends Flower{

    Tulip(String color) {
        super(color);
    }
    void showColor(){
        System.out.println("Tulips have "+color+" color");
    }
}