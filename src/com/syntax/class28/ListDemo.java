package com.syntax.class28;

public class ListDemo {
    public static void main(String[] args) {
        Object[] arr={"Mante",10.2,"Name"};// bad programming

        for(Object obj : arr){
            if(obj instanceof String)
            //instanceof checks if a variable contains a specific type of object
            System.out.println(((String)obj).length());
        }
    }
}
