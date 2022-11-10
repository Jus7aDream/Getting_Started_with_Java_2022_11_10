package org.example.foo;

import java.time.LocalDate;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class RepresentAPassportUsingClassesAndObjects {
    public static void main(String[] args) {
        Passport ukPassport = new Passport(1234,
                "England (UK)",
                LocalDate.of(2025, 1, 1));

        Passport usPassport = new Passport(4321,
                "USA",
                LocalDate.of(2030, 1, 1));
    }

    static class Passport {
        int number;
        String country;
        LocalDate expiryDate;

        public Passport(int number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
