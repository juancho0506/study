package com.in28minutes.exercises.conditionals;

/**
 * You are tasked with creating a method in the MyChar class
 * to determine if a given character is a vowel.
 */
public class MyChar {

    /**
     * Method to determine if a character is a vowel
     * The switch statement should return true if the character is a vowel (either lowercase or uppercase) and false otherwise.
     * The vowels are: 'A', 'E', 'I', 'O', 'U', and their respective lowercase versions.
     */
    public boolean isVowel(char ch) {
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        //Using new switch impl:
        return switch (ch) {
            case 'A', 'a', 'E', 'e', 'I', 'i',  'O', 'o', 'U', 'u' -> true;
            default -> false;
        };
        //Another approach with no switch at all:
        //return "AEIOUaeiou".indexOf(c) != -1;
    }
}
