package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //declaration / constructor : " String example " , " String[] "
        //expression : " type variable = value"
        //array : list
        //.length : length of array(index), .length() : length of array(character count)
        // variable outside psvm : class level / field / property variables
        // primitive : lowercase , non-primitive/reference type : Uppercase -
        //- Uppercase VariableName = new Uppercase();
        //- for primitive  : t.name












        Person j = new Person();
        j.name = "John";
        j.age = 30;
        j.title = "Manager";
        j.length = 4;

        Person[] people = new Person[1];

        System.out.println(j.name + " is " + j.age + " and will be your " +j.title + ".");

        System.out.println(people.length);

        stringExample();

    }

    public static void stringExample() {
        String thing1 = "wand";
        String thing2 = "fairy";
        String thing3 = "troll";

        String[] things = {"wand", "fairy", "troll"};


    }
}