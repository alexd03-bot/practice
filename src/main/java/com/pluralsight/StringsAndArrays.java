package com.pluralsight;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringsAndArrays {

    public static void main(String[] args) {

        // string id|description|quantity|price

//        String order = "223|Cookie's and Cream cookies|34|20.67";
//        String[] myOrder = order.split("\\|");
//
//        int id = Integer.parseInt(myOrder[0]);
//        String description = myOrder[1];
//        int quantity = Integer.parseInt(myOrder[2]);
//        double price = Double.parseDouble(myOrder[3]);



//        String input = "04/19/2003";
//        DateTimeFormatter formatter;
//        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        LocalDate birth = LocalDate.parse(input, formatter);
//        System.out.println(birth + " \n" + birth.getDayOfMonth());



        int i = 1;
        int sum = 0;

        do {

            sum +=1;
            i ++;
        } while (i <=3);
        System.out.println("Sum = " + sum);

        for (int j = 0; j <= 3; j++) {
            System.out.println(j);
        }



    }
}
