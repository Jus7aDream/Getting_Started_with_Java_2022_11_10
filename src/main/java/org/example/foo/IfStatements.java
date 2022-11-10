package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class IfStatements {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Hooray... I am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an an adult");
        } else {
            System.out.println("I am not an adult");
        }
    }
}
