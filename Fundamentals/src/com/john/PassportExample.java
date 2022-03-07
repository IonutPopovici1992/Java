package com.john;

import java.time.LocalDate;

/// Passport Example
public class PassportExample {

    public static void main(String[] args) {
        // Classes
        Passport ukPassport = new Passport(
                "12345",
                "England (UK)",
                LocalDate.of(2025, 1, 1));

        Passport usPassport = new Passport(
                "6789",
                "USA",
                LocalDate.of(2030, 1, 1));

        System.out.println(ukPassport.number);
        System.out.println(ukPassport.country);
        System.out.println(ukPassport.expiryDate);

        System.out.println();

        System.out.println(usPassport.number);
        System.out.println(usPassport.country);
        System.out.println(usPassport.expiryDate);
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }

}
