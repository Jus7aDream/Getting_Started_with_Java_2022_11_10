package org.example.foo;


import java.util.Arrays;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class WorkingWithArrays {
    public static void main(String[] args) {
        int zero = 0;
        int one = 1;
        int[] numbers = new int[3];
        numbers[0] = zero;
        numbers[1] = one;
        numbers[2] = 3;
        System.out.println("numbers " + Arrays.toString(numbers));

        int[] numbers2 = {zero, one, 2};
        System.out.println("numbers2" + Arrays.toString(numbers2));

        String[] names = {"Muhammad", "Abu Bakar", "Umar", "Uthman", "Ali"};
        System.out.println("names: " + Arrays.toString(names));

        boolean[] booleans = new boolean[3];
        String[] strings = new String[3];
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(strings));
    }

}
