package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class UnderstandingMethods {
    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'A', 'A', 'A', 'A', 'A'};
        int count = countOccurrences(letters);
        System.out.println(count);
    }

    public static int countOccurrences(char[] letters) {
        System.out.println("Method - countOccurrences() was invoked");
        return -1;
    }
}
