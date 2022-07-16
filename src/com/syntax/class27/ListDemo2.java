package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>();//recommended
        legends.add("Mante");
        legends.add("Jorge");
        legends.add("Gucc");
        legends.add("Gookie");
        legends.add("Ant");

        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("Tara");
        moreStudents.add("Greg");

        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);

        allStudents.removeAll(legends);//opposite to addAll method
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);
    }
}
