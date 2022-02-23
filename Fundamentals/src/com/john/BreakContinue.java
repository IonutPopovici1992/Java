package com.john;

/// Break and Continue
public class BreakContinue {

    public static void main(String[] args) {
        // Break and Continue
        String[] names = {"Anna", "Ali", "Bob", "Mike"};

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        // break
        for (String name : names) {
            if (name.equals("Bob")) {
                break;
            }

            System.out.println(name);
        }

        System.out.println();

        // continue
        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }

            System.out.println(name);
        }
    }

}
