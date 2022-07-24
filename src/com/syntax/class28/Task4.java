package com.syntax.class28;

import java.util.ArrayList;

public class Task4 {
    //Create an arrayList of drinks.
    // If any drink has letter "a" or "e" replace it with water
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Casamigos");
        drinks.add("Tito's Vodka");
        drinks.add("Bacardi");
        drinks.add("Captain Morgan");
        drinks.add("Ciroc");
        drinks.add("Jack Daniels");
        drinks.add("Malibu Rum");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e"));{
                drinks.set(i,"Water"); //replaced
            }
        }
        System.out.println(drinks);
    }
}
