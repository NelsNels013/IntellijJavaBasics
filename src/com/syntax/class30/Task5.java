package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

    /*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who
    gets the highest salary. Output should be in the below format
John Smith=$100000
     */

    public static void main(String[] args) {
        HashMap<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Mante", 1000000);
        employeeMap.put("Jorge", 70000);
        employeeMap.put("Gucc", 75000);
        employeeMap.put("Anthony", 40000);
        employeeMap.put("Gookie", 95000);
        employeeMap.put("Nelson", 115000);

        String name = "";
        Integer maxSalary = 0;
        for(Map.Entry<String, Integer> entry : employeeMap.entrySet()){
            if(entry.getValue()>maxSalary){
                maxSalary = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name+" earns the highest salary "+maxSalary);
    }
}
