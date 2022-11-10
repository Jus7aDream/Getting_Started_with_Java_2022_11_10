package org.example.foo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class PackagesAndImportStatement {
    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date dateSql = new java.sql.Date(1);
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("date = " + date);
        System.out.println("localDate " + localDate);
        System.out.println();
        System.out.println("localDateTime " + localDateTime);
    }
}
