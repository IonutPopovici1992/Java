package com.john;

/// The String Class
public class TheStringClass {

    public static void main(String[] args) {
        // The String Class
        String name = "Amigoscode";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));

        String code1 = "code";
        System.out.println(name.contains(code1));
        System.out.println(name.equals(code1));

        String code2 = "codes";
        System.out.println(name.contains(code2));
        System.out.println(name.equals(code2));
    }

}
