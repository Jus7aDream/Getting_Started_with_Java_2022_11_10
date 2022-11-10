package org.example.foo;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class ScannerIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + " !");

        System.out.println("How old you?");
        int userAge = scanner.nextInt();
        int year = LocalDate.now().minusYears(userAge).getYear();
        System.out.println("You were born in " + year);

        if (userAge < 18) {
            System.out.println("You are not an adult :(");
        } else {
            System.out.println("You are an adult :)");
        }
    }
}
