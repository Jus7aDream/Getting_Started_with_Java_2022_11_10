package org.example.foo;

import java.util.Arrays;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class BonusTip {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        String[] names = {"Muhammad", "AbuBakar", "Umar", "Uthman", "Ali"};
//        numbers.for
        for (int number : numbers) {

        }
//        numbers.fori
        for (int i = 0; i < numbers.length; i++) {
            
        }
//        numbers.forr
        for (int i = numbers.length - 1; i >= 0; i--) {
            
        }
        System.out.println("Artour");
        Arrays.stream(numbers).forEach(System.out::println);
//        names.for
        for (String name : names) {

        }
//        names.fori
        for (int i = 0; i < names.length; i++) {

        }
//        names.forr
        for (int i = names.length - 1; i >= 0; i--) {

        }
        System.out.println("Artour");
        Arrays.stream(names).forEach(System.out::println);
    }
}
