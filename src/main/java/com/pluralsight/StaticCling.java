package com.pluralsight;

public class StaticCling {
    /**
     * print max of two numbers
     * @param a
     * @param b
     */

    static int printMax(int a, int b) {
        int max;
        if(a >b) {
            max = a;
        }
        else {
            max = b;
        }
        return max;
    }


    static int printMin(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        }
        else {
            min = b;
        }
        return min;
    }

    public static void main(String[] args) {
        int num = printMin(6, 7);
        System.out.println(num);
    }




}
