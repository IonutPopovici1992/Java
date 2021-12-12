package com.john;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/// Packages and Import Keyword
public class PackagesAndImport {

    public static void main(String[] args) {
        String string = "Amigoscode";
        System.out.println(string);

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

}
