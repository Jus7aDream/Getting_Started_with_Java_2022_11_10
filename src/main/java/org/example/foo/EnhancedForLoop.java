package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " - ");
            System.out.print(numbers[i] + "\n");
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        String[] names = {"Muhammad", "AbuBakar", "Umar", "Uthman", "Ali"};
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

}
