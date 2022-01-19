package com.john;

/// Enhanced For Loop
public class EnhancedForLoop {

    public static void main(String[] args) {
        // Loops
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Anna", "Ali"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        // Enhanced For Loop
        System.out.println("Enhanced For Loop");

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        for (String name : names) {
            System.out.println(name);
        }
    }

}
