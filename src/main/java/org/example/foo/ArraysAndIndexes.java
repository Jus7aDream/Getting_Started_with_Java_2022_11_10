package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class ArraysAndIndexes {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 4, 100, 4, 5, 6, 7, 8, 9, 12};
        int oneHundred = numbers[4];
        int index3 = numbers[3];
        int lastIndex = numbers[numbers.length - 1];
        System.out.println(oneHundred);
        System.out.println(index3);
        System.out.println(lastIndex);
    }
}
