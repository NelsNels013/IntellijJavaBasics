package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static <objects> void main(String[] args) {
        // we can store the object of a class inside a variable of type parent class
        //interface if that class implements that interface
        List<String> legends = new ArrayList<>();
        legends.add("Mante");
        legends.add("Jorge");
        legends.add("Gucc");
        legends.add("Gookie");
        legends.add("Ant");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Anthony"));// will return false
        System.out.println(legends.contains("Mante"));// will return true
        Object[] arr= legends.toArray();
        System.out.println(arr[0]);
        legends.remove("Ant");
        System.out.println(legends);

        List<String> names=new ArrayList<>();
        

    }
}
