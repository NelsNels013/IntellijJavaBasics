package com.syntax.class28;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("Eggs", 12);
        groceries.put("Milk",3);
        groceries.put("Apple",3);
        groceries.put("Fish",25);

        Set<String> key = groceries.keySet();
        for (String s : key) {
            System.out.println(s);
        }
    }
}
