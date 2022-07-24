package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
Create an arrayList of cars and retrieve all the values using 3 different ways
 */

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes AMG C63");
        cars.add("Audi RS5");
        cars.add("Tesla Model X");
        cars.add("Toyota Supra");

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("***********************");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("***********************");

        System.out.println(cars);

        System.out.println("***********************");

        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("***********************");

        cars.forEach(System.out::println);
    }
}
