package com.syntax.reviewClass11;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mante");
        names.add("Gucc");
        names.add("Jorge");
        names.add("Nelson");
        for(String name : names){
            System.out.println("name = " + name);
        }

        Collections.sort(names);
        System.out.println(names);

    }
}
