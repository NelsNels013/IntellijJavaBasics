package com.syntax.class28;

import java.util.ArrayList;

public class Task1 {
    /*
    Create an ArrayList that will store 5 names into it.
   Find out whether the given ArrayList is empty or not?
   Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that
 */
    public static void main(String[] args) {
        //always good to specify initial capacity
        //it always improves the performance
        ArrayList<String> names = new ArrayList<>(5);
        names.add("mante");
        names.add("Gookie");
        names.add("Jorge");
        names.add("Gucc");
        names.add("Nelson");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mante"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
