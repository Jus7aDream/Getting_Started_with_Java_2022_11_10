package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 09.11.2022
 */
public class ConcatenatingStrings {
    public static void main(String[] args) {
        String  name = "Abu";
        String  surname = "Bakar";
        String fullName = name + " Montana " + 1;
        System.out.println(fullName);
        String fullName2 = name.concat(" ").concat(surname);
        System.out.println(fullName2);
    }
}
