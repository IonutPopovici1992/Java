package com.john;

/// Understanding Methods
/// User Defined Methods
public class Methods2 {

    public static void main(String[] args) {
        // Understanding Methods

        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'Z');

        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter) {
        // System.out.println("Method countOccurrences() was invoked!");
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }

}
