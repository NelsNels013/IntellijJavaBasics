package com.syntax.reviewClass10;

import javafx.scene.layout.FlowPane;

public class FlowerTest {
     public static void main(String[] args) {
        Rose rose = new Rose("red");
        rose.showColor();
        rose.bloom();
        rose.smell();
        rose.thorns();

        System.out.println("******************************************");

        Flower flower = new Rose("Green");
        flower.showColor();
        flower.bloom();
        flower.smell();
        Rose rose1=(Rose)flower;
        rose1.thorns();
        //flower.thorn();   not possible
        Flower[] flowers={new Rose("Red"), new Tulip("Pink")};
        System.out.println("******************************************");
        for (Flower flower1 : flowers) {
            flower1.bloom();
            flower1.smell();
            flower1.showColor();
        }

        main("Mante got confused");

    }

    public static void main(String args) {
        System.out.println("Hehehehe got confused");
    }
}
