package com.john;

import java.time.LocalDate;

/// Reference Data Types
public class ReferenceDataTypes {

    public static void main(String[] args) {
        // Non primitive data types AKA reference data types
        String name = new String("Amigoscode");
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println();

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
    }

}
