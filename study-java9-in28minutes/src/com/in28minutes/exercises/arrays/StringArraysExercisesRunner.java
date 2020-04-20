package com.in28minutes.exercises.arrays;

public class StringArraysExercisesRunner {

    public static void main(String[] args) {
        String[] daysOfWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String longestString = findLongestString(daysOfWeek);
        System.out.println("Longest day of week according to char size: " + longestString);
        printBackwards(daysOfWeek);
    }

    private static String findLongestString(String[] daysOfWeek) {
        String longest = "";
        for (String value : daysOfWeek) {
            if (value.length() > longest.length()) {
                longest = value;
            }
        }
        return longest;
    }

    private static void printBackwards(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
