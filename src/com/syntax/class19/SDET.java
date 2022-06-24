package com.syntax.class19;

public class SDET extends Human {
    boolean goodWithJava;
    SDET(String name, String eyeColor, String job, int age, boolean goodWithJava){
        this.name=name;//this.name is coming from Parent class Human
        this.eyeColor=eyeColor;
        this.job=job;
        this.age=age;
        this.goodWithJava=goodWithJava;
    }
    void printInfo(){
        System.out.println("My name is "+name+", I do "+job+". Am I good with Java? "+goodWithJava);
    }

    public static void main(String[] args) {
        SDET sdet=new SDET("Mante", "Brown", "Supervising", 22, true);
        sdet.printInfo();
    }
}
