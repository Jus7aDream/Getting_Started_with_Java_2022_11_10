package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 09.11.2022
 */
public class PrimitiveDataType {
    public static void main(String[] args) {
        byte theByte = -128;
        short theShort = -32_768;
        int theInt = -2_147_483_648;
        long theLong = -9_223_372_036_854_775_808L;

        float pi = 3.14F;
        double doublePi = 3.1415;

        boolean isAdult = false; // or true

        char nameInitial = 'A';
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(nameInitial);
    }
}
