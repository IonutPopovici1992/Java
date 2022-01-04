package com.john;

/// Switch Statements
public class SwitchStatements {

    public static void main(String[] args) {
        // Switch Statements
        String gender = "FEMALE";

        if (gender.equals("FEMALE")) {
            // ...
        } else if (gender.equals("MALE")) {
            // ...
        } else if (gender.equals("PREFER_NOT_SAY")) {
            // ...
        } else {
            // ...
        }

        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a female.");
                break;
            case "MALE":
                System.out.println("I am a male.");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say.");
                break;
            default:
                System.out.println("Unknown gender!");
        }
    }

}
