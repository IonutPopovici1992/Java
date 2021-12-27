package com.john;

/// Logical Operators
public class LogicalOperators {

    public static void main(String[] args) {
        // Logical Operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;

        // Logical "and" - &&
        System.out.println(isAdult && isStudent);
        // Logical "or" - ||
        System.out.println(isAdult || isStudent);
        // Logical "not" - !
        System.out.println((!isAdult || isStudent) && !isAmigoscodeMember);
    }

}
