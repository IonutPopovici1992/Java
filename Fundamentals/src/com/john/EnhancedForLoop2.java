package com.john;

import java.util.Arrays;

/// Enhanced For Loop - Part 2
public class EnhancedForLoop2 {

    public static void main(String[] args) {
        // Enhanced For Loop
        int[] numbers = {100, 200, 300, 400, 500};
        String[] names = {"Anna", "Ali"};

        System.out.println("Enhanced For Loop");
        // Enhanced For Loop
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println("For Loop (i)");
        // For Loop (i)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        System.out.println("For Loop (r)");
        // For Loop (r)
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println();

        System.out.println("Advanced For Loop");
        // Advanced For Loop
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println();
        Arrays.stream(names).forEach(System.out::println);
    }

}
