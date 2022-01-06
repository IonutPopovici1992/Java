package com.john;

import java.util.Arrays;

/// Arrays
public class ArraysIntro {

    public static void main(String[] args) {
        // Arrays
        int zero = 0;
        int one = 1;

        int [] numbers1 = new int[3];

        int [] numbers2 = new int[3];
        numbers2[0] = 0;
        numbers2[1] = 1;
        numbers2[2] = 2;

        int [] numbers3 = {100, 200, 300, 400, 500};

        String [] names = {"Ali", "Maria", "Nathan"};

        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers1.length);
        System.out.println("**********");
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        System.out.println("**********");
        System.out.println(Arrays.toString(numbers3));
        System.out.println(numbers3.length);
        System.out.println("**********");
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }

}
