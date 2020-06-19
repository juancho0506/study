package com.jtorres.geeksforgeeks.exercises;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * we have to count occurrences of each integer in given array of integers.
 * Input: arr[] = {10, 3, 5, 10, 3, 5, 10};
 * Output: Frequency of 10 is 3
 *         Frequency of 3 is 2
 *         Frequency of 5 is 2
 */
public class CountOccurrencesOnArray {

    private static HashMap<Integer, Integer> hashMapImpl(final int[] numbers){
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap =
                new HashMap<Integer, Integer>();

        // Traverse through the given array
        for (int number : numbers) {
            Integer c = hmap.get(number);

            // If this is first occurrence of element
            if (hmap.get(number) == null)
                hmap.put(number, 1);

                // If elements already exists in hash map
            else
                hmap.put(number, ++c);
        }
        return hmap;
    }

    private static TreeMap<Integer, Integer> treeMapImpl(final int[] numbers){
        // Creates an empty TreeMap
        TreeMap<Integer, Integer> tmap =
                new TreeMap<Integer, Integer>();

        // Traverse through the given array
        for (int number : numbers) {
            Integer c = tmap.get(number);

            // If this is first occurrence of element
            if (tmap.get(number) == null)
                tmap.put(number, 1);

                // If elements already exists in hash map
            else
                tmap.put(number, ++c);
        }
        return tmap;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 10, 3, 5, 10};

        HashMap<Integer, Integer> hashMap = hashMapImpl(numbers);

        TreeMap<Integer, Integer> treeMap = treeMapImpl(numbers);

        //Print Hashmap
        hashMap.forEach((key, value) -> System.out.println("Frequency of " + key +
                " is " + value));

        //Print Treemap
        treeMap.forEach((key, value) -> System.out.println("Frequency of " + key +
                " is " + value));

    }
}
