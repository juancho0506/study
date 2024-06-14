package com.in28minutes.exercises.referencetypes;

import java.util.Arrays;
import java.util.Objects;

/**
 * Exercises from the in28Minutes Java Programming Course.
 * Section 17: Reference Types.
 */
public class StringMagic {

    /**
     * This method counts the number of uppercase letters in a given string.
     * Remember to consider the following edge cases:
     * If the string is empty, the method should return 0.
     * If the string does not contain any uppercase letters, the method should also return 0.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        //Edge cases:
        if (str != null && str.isBlank())
            return 0;
        String removeSpaces = Objects.requireNonNull(str).replace(" ", "");
        /*if (removeSpaces.matches("[a-z]+")) //Not needed at the end.
            return 0;*/
        //Find the upper case chars:
        return (int) str.chars().filter(Character::isUpperCase).count();
    }

    public int countUppercaseLettersOldStyle(String str) {
        // Initialize a counter to 0.
        int count = 0;

        // Edge case: if the string is empty, return 0.
        if (str.isEmpty()) {
            return count;
        }

        // Loop over each character in the string.
        for (int i = 0; i < str.length(); i++) {
            // Get the current character.
            char c = str.charAt(i);

            // If the current character is an uppercase letter, increment the counter.
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        // Edge case: if the string does not contain any uppercase letters, return 0.
        // This is implicitly handled as the count would remain 0 if no uppercase letter is found.

        // Return the number of uppercase letters found.
        return count;
    }
    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasCharDuplicates(String str) {
        //Edge cases:
        if (str == null)
            return false;
        if (str.isBlank())
            return false;
        if (str.length() == 1)
            return false;
        String noSpacesStr = str.replace(" ", ""); //Ex: hello; size=5
        return str.chars().distinct().count() < noSpacesStr.length(); //distinct = 4
    }
    public boolean hasConsecutiveDuplicatesOldStyle(String str){
        // Edge case: if the string is empty or has only one character, return false.
        if (str.isEmpty() || str.length() == 1) {
            return false;
        }
        // Loop over each character in the string, stopping at the second-to-last character.
        for (int i = 0; i < str.length() - 1; i++) {
            // Get the current character and the one after it.
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);

            // If the current character and the next one are the same, return true.
            if (currentChar == nextChar) {
                return true;
            }
        }
        // If no duplicate consecutive characters were found, return false.
        return false;

    }
    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {
        //Edge cases
        if (str == null)
            return -1;
        if (str.isBlank())
            return -1;
        return str.chars().filter(Character::isDigit).max().orElse(-1);
    }
}
