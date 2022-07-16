package com.syntax.class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>();//recommended
        legends.add("Mante");//0
        legends.add("Jorge");//1
        legends.add("Gucc");//2
        legends.add("Gookie");//3
        legends.add("Ant");//4
        legends.add("Ant");
        legends.add("Asghar");
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);

        legends.set(0,"Mantequilla");//replaces an index
        System.out.println(legends);
        System.out.println(legends.indexOf("Ant"));

        System.out.println(legends.subList(0,3));

    }
}
