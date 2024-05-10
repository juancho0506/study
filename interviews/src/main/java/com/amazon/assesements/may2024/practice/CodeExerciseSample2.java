package com.amazon.assesements.may2024.practice;

import java.util.Scanner;

/**
 * Run Length Encoding:
 * Encode a series of letters that represents parts of an image or similar to have small representation of it.
 * This is an older lossless compression algorithm from the sixties, or seventies.
 * <br>
 * We are going to use a simple input as series of letters in a String.
 * Example: aaaabbccc -> 4a2b3c
 * This cover only consecutive characters of the same value so for example:
 * Edge case 1: aaaabbcca  -> 4a2b3c1a  (so even we already count a's the last one is an new one)
 * Edge case 2: abcd -> 1a1b1c1d (always retain the counter).
 */
public class CodeExerciseSample2 {

    public static void main(String[] args) {
        //Input test
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.printf("Result encoding: %s%n", encode(input));
        String encoded = encode2(input);
        System.out.printf("Result encoding2: %s%n", encoded);
        //System.out.printf("Result decoding: %s%n", decode(encoded));
        System.out.printf("Result decoding Premium: %s%n", decodePremium(encoded));
    }

    private static String encode(String input) {
        //First edge case:
        if (input == null || input.isEmpty())
            return "";
        //Initial data needed:
        char[] items = input.toCharArray();
        int contOccurrences = 0;
        char prevItem = items[0];
        StringBuilder result = new StringBuilder();
        for (char item : items){
            if (item == prevItem) {
                contOccurrences++;
            } else{
                result.append(contOccurrences).append(prevItem);
                contOccurrences = 1;
                prevItem = item;
            }
        }
        result.append(contOccurrences).append(prevItem);
        return result.toString();
    }

    /**
     * Another way to do it. *Source from: <a href="https://www.geeksforgeeks.org/run-length-encoding/">GeeksForGeeks</a>
     * @param input
     * @return the encoded String
     */
    private static String encode2(String input) {
        int n = input.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {

            // Count occurrences of current character
            int count = 1;
            while (i < n - 1
                    && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }

            // Save character and its count
            result.append(count).append(input.charAt(i));
        }
        return result.toString();
    }

    /**
     * Assumptions: <br>
     * - The format is like: [times][letter] where letter is a char that can be a number as well.
     * - The number of times a character can be repeated is from 1 to 9
     * @param input
     * @return
     */
    private static String decode(String input) {
        //First edge case:
        if (input == null || input.isEmpty())
            return "";
        //Initial data needed:
        char[] items = input.toCharArray();
        StringBuilder result = new StringBuilder();

        //Algorithm
        for (int i = 0; i<items.length; i++){ //4a2b3c-> aaaabbccc
            if (i <= items.length-1){
                int cont = 0;
                int actualCharTimesValue = Character.getNumericValue(items[i]);
                while (cont < actualCharTimesValue) {
                    result.append(items[i+1]);
                    cont++;
                }
                i++;
            }
        }
        return result.toString();
    }

    /**
     * Assumptions: <br>
     * - The format is like: [times][letter] where letter is a char but can't be a number as well.
     * - The number of times a character can be repeated is from 1 to 99
     * @param input
     * @return
     */
    private static String decodePremium(String input) {
        //First edge case:
        if (input == null || input.isEmpty())
            return "";
        //Initial data needed:
        char[] items = input.toCharArray();
        StringBuilder result = new StringBuilder();

        //Algorithm
        for (int i = 0; i<items.length; i++){ //10a2b3c-> aaaaaaaaaabbccc
            if (i <= items.length-1){
                int cont = 0;
                int actualCharTimesValue = Character.getNumericValue(items[i]);
                while (i+1 < items.length && Character.getNumericValue(items[i+1]) >= 0
                        && Character.getNumericValue(items[i+1]) <= 9){
                    StringBuilder tempNumChars = new StringBuilder().append(actualCharTimesValue);
                    int nextCharTimes = Character.getNumericValue(items[i+1]);
                    tempNumChars.append(nextCharTimes);
                    actualCharTimesValue = Integer.parseInt(tempNumChars.toString());
                    i++;
                }
                while (cont < actualCharTimesValue && i+1 < items.length) {
                    result.append(items[i+1]);
                    cont++;
                }
                i++;
            }
        }
        return result.toString();
    }
}
