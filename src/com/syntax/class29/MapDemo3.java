package com.syntax.class29;

import java.util.*;

public class MapDemo3 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit = new HashMap<>();
        fruit.put("Apple",2000.00); //auto upcasting does not work with wrappers
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",10.2);
        fruit.put("Peach",10.5);
        Set<String> keys = fruit.keySet(); //all the keys from a map in the form of a set
        for (String key : keys) {
            System.out.println("Key = " + key);
        }

            //All the values in the form of a collection
            Collection<Double> values = fruit.values();
            for (Double value : values) {
                System.out.println("Value " + value);
            }

    }
}
