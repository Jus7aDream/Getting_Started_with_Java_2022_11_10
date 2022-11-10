package org.example.foo;

import java.util.Arrays;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class UserDefinedMethods {
    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'B', 'C', 'A', 'Z'};
        char x = 'B';
        int count = countOccurrences(letters, x);
        System.out.println("count = " + count);
    }

    public static int countOccurrences(char[] letters, char searchLetters) {
        System.out.println("Method - countOccurrences() was invoked");

        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetters);

        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetters) {
                count++;
            }
        }
        return count;

    }
}
