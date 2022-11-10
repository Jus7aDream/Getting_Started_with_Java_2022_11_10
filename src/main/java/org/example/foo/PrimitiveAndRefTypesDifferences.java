package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 09.11.2022
 */
public class PrimitiveAndRefTypesDifferences {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person("alex");
        Person mariam = alex;
        alex.name = "john";
        System.out.println(alex.name);
        System.out.println(mariam.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
