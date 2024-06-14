package com.in28minutes.exercises.z.extra.interviews;

import java.util.Arrays;

public class ArraysInterviewExercises {

    public boolean itHasOverlaps(int[] numbers){
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
        if (Math.min(max1, max2) < Math.max(min1, min2) )
            return false;
        return  Math.abs(Math.max(max1, max2) - Math.max(min1, min2)) >= xOverlap;
    }
}
