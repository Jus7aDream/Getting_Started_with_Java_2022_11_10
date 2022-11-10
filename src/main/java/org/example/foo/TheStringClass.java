package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 09.11.2022
 */
public class TheStringClass {
    public static void main(String[] args) {
//        String name = new String("Amigoscode");
        String name = "Amigoscode";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() -1));
        String code = new String("codes");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
    }
}
