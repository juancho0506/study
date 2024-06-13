package com.in28minutes.exercises.referencetypes;

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
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        //Edge cases:
        if (str != null && str.isBlank())
            return 0;
        String removeSpaces = Objects.requireNonNull(str).replace(" ", "");
        if (removeSpaces.matches("[a-z]+"))
            return 0;

        return 1;
    }
}
