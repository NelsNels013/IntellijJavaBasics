package com.syntax.class26;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        int num3=10;
        int num4=10;
        int num5=10;
        System.out.println(num1+num2+num3+num4+num5);
        //Whenever we have to store more than three values of same type which are
        //also logically connected, we should create an array for them
        String name="Mante";
        String name2="Gucc";
        String name3="Jorge";
        String name4="Nelson";
        String[]names={"Mante","Gucc","Jorge","Nelson"};
        //Not a good fit for an array because data is not the same logically
        String name5="James";
        String address="New York";
        String moveName="Falco PUNCH!";

        String[] arr={"James","New York","Falco PUNCH!"};

        Object []array={10,51.2,"Asghar"};//Very bad idea to use this object array to store all the elements

        //ArrayList

    }
}
