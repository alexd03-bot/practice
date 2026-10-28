package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Error {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String yourFile = scanner.nextLine();
    String fileName = "src/main/resources/" + yourFile;

    try {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufReader = new BufferedReader(fileReader);

        String line = bufReader.readLine();

        System.out.println("'" + line + "', he said.");
    }
    catch(FileNotFoundException e) {
        System.out.println("Yea no");
    }
    catch (IOException e) {
        System.out.println("your mom");
    }




    }

}
