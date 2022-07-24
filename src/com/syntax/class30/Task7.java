package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {

    /*
Create a collection of integers in which you can keep duplicates.
  Write a logic to find sum of all integers
 */
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum=0;
        for(Integer num:numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}
