package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;
        // And
        System.out.println(isAdult && isStudent);
        // Or
        System.out.println(isAdult || isStudent);

        System.out.println((isAdult || isStudent) &&
                isAmigoscodeMember);
        System.out.println((isAdult || isStudent) &&
                !isAmigoscodeMember);
        System.out.println(isAdult == false);
        String name = "Mark";
        System.out.println((10 > 8 || 2 <= 2) &&
                !isAdult &&
                name.contains("M"));
    }
}
