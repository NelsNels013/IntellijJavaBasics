package com.syntax.class16;

import com.syntax.class17.Employee;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        //System.out.println(ac.password);error because its private
        System.out.println(ac.ssn);
        System.out.println(ac.name);
        Employee emp=new Employee();
        Scanner input=new Scanner(System.in);
    }
}
