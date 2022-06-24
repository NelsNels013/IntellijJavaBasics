package com.syntax.class20;

public class Task2 {
        /* Write program to inherit class G that has method printF
which is static and call or reuse that method into class B
 */

    public static void main(String[] args) {
        E.printF();
    }
}


class G{
    public static void printF(){
        System.out.println("Method print");
    }
}
class E extends G{

}

