package com.john;

/// Primitive Data Types
public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // Data Type; Size; Description

        // byte; 1 byte; Stores whole numbers from -128 to 127.
        byte theByte = -128;
        // short; 2 bytes; Stores whole numbers from -32,768 to 32,767.
        short theShort = -32768;
        // int; 4 bytes; Stores whole numbers from -2,147,483,648 to 2,147,483,647.
        int theInt = -2147483648;
        // long; 8 bytes; Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        long theLong = 123456789L;

        // float; 4 bytes; Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits.
        float pi = 3.14F;
        // double; 8 bytes; Stores fractional numbers. Sufficient for storing 15 decimal digits.
        double doublePi = 3.1415;

        // boolean; 1 bit; Stores true or false values.
        boolean theBoolean = true;

        // char; 2 bytes; Stores a single character/letter or ASCII values.
        char theChar = 'A';

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(theBoolean);
        System.out.println(theChar);
    }

}
