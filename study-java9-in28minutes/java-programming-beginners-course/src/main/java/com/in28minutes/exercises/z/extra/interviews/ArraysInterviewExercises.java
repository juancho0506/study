package com.in28minutes.exercises.z.extra.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysInterviewExercises {
    /**
     * You will be given an array with 5 numbers.
     * The first 2 numbers represent a range, and the next two numbers represent another range.
     * The final number in the array is X. The goal of your program is to determine if both ranges overlap by at least X numbers.
     * For example, in the array [4, 10, 2, 6, 3] the ranges 4 to 10 and 2 to 6 overlap by at least 3 numbers (4, 5, 6),
     * so your program should return true.
     * @param numbers the array of number to check overlaps.
     * @return true or false if overlaps are happening.
     */
    public boolean itHasOverlaps(int[] numbers) {
        if (numbers == null)
            return false;
        if (numbers.length != 5)
            return false;
        int min1 = numbers[0];
        int min2 = numbers[2];
        int max1 = numbers[1];
        int max2 = numbers[3];
        int xOverlap = numbers[4];
        //Edge case
        if (Math.min(max1, max2) < Math.max(min1, min2))
            return false;
        //int maxOverlaps = Math.abs(Math.max(max1, max2) - Math.max(min1, min2));
        int maxOverlaps = Math.abs(Math.min(max1, max2) - Math.max(min1, min2)) + 1; //To be inclusive with the origin number.
        System.out.println("Number of overlaps in range: " + maxOverlaps);
        return maxOverlaps >= xOverlap;
    }

    /**
     * Given two arrays A[] and B[] having n unique elements each.
     * The task is to find the overlapping sum of the two arrays.
     * That is the sum of elements that is common in both of the arrays.
     * Note: Elements in the arrays are unique.
     * That is the array does not contain duplicates
     * @param a array of unique integers
     * @param b array of unique integers
     * @return the overlapping sum of both.
     */
    public int sumArrayOverlaps(int []a, int[] b){
        //Edge cases
        if (a == null || b == null)
            return 0;
        if (a.length == 0 && b.length==0)
            return 0;
        if (a.length == 1 && b.length==1)
            return a[0]==b[0] ? a[0]+b[0] : 0;
        List<Integer> bList = Arrays.stream(b)
                .boxed()
                .toList();
        return Arrays.stream(a).filter(bList::contains).sum();
    }
}
