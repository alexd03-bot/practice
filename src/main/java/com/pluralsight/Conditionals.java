package com.pluralsight;

public class Conditionals {
    public static void main(String[] args) {

        int age = 25;
        double price;

        if (age < 18) {
            price = 18.35;
        }
        else {
            if (age < 65) {
                price = 25.00;
            } else {
                price = 18.00;
            }
        }
        System.out.println(price);











    }
}
