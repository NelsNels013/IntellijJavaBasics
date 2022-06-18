package com.syntax.ReviewClass7;

public class B13StringTester {
    public static void main(String[] args) {

        B13String str=new B13String("abcsssesd");
        int count=str.countChar('s');
        System.out.println(count);
        str.printChars('a');
    }
}
