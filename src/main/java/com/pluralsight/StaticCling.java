package com.pluralsight;

public class StaticCling {

    public static void main(String[] args) {
        StaticCling.printMax(1, 2);
    }


    /**
     * print max of two numbers
     * @param a
     * @param b
     */

    static void printMax(int a, int b) {
       if(a >b) {
           System.out.println(a);
       }
       else {
           System.out.println(b);
       }

    }



}
