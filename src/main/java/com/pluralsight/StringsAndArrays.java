package com.pluralsight;

import java.time.LocalDate;

public class StringsAndArrays {

    public static void main(String[] args) {

        // string id|description|quantity|price

        String order = "223|Cookie's and Cream cookies|34|20.67";
        String[] myOrder = order.split("\\|");

        int id = Integer.parseInt(myOrder[0]);
        String description = myOrder[1];
        int quantity = Integer.parseInt(myOrder[2]);
        double price = Double.parseDouble(myOrder[3]);




        String input = "2003-04-19";
        LocalDate birth = LocalDate.parse(input);
        System.out.println(birth);


    }
}
