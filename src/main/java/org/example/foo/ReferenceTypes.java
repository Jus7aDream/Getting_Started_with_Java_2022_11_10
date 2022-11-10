package org.example.foo;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * @ In the name of Allah, most gracious and most merciful! 09.11.2022
 */
public class ReferenceTypes {
    public static void main(String[] args) {
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
    }
}
