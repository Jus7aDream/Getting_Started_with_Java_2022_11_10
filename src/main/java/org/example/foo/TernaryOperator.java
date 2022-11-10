package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int age = 15;
        String message = age>=18
                ? "Hooray... I am an adult"
                : "I am not an adult";
        System.out.println(message);
    }
}
