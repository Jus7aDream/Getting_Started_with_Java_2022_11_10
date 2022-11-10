package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        String[] names = {"Muhammad", "AbuBakar", "Umar", "Uthman", "Ali"};
        for (String name : names) {
            if (name.equals("Umar")) {
                break;
            }
            System.out.println(name);
        }
//        Muhammad
//        AbuBakar
        System.out.println("-----------------");
        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
//        Muhammad
//        Umar
//        Uthman
    }
}
