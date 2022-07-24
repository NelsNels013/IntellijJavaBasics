package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(20);
        num.add(10);
        num.add(40);

        //When we pass the list to the constructor of the set and java will create
        //a set out of that list using the same approach, we get a list back from the set
        num = new ArrayList<>(new LinkedHashSet<>(num));
        /*LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(); //Creating a set
        linkedHashSet.addAll(num); //Adding all the elements from the list to the set
        num = new ArrayList<>(); //Create a new Array
        num.addAll(linkedHashSet); //Adding the unique elements*/

        System.out.println(num);
    }
}
