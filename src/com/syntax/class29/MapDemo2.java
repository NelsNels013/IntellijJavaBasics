package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> Fruit = new TreeMap<>();
        Fruit.put("Apple",20);
        Fruit.put("Watermelon",20);
        Fruit.put("Peach",20);
        Fruit.put("Strawberry",100);

        TreeMap<String,Integer> cosmetics = new TreeMap<>();
        cosmetics.put("Foundation",20);
        cosmetics.put("Lipstick",25);
        cosmetics.put("Mascara",20);
        cosmetics.put("Blush",100);

        LinkedHashMap<String,Integer> groceries = new LinkedHashMap<>();
        groceries.putAll(Fruit);
        groceries.putAll(cosmetics);
        groceries.putAll(groceries);
    }
}
