package com.in28minutes.exercises.arrays;

/**
 * In the class BiArray, you are given two integer arrays.
 * Your task is to write a method to compare the sum of these two arrays and determine if they are equal.
 * You are also required to write a method to calculate the sum of the elements of an array.
 */
public class BiArray {

    private final int[] array1;
    private final int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    /**
     * This method should compare the sum of array1 and array2 and return true if they are equal, and false otherwise.
     * Use the calculateSum(int[] array) method to calculate the sum of array1 and array2.
     *
     * @return true if the sum of each array elements are equal, false otherwise.
     */
    public boolean areSumsEqual() {
        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        return sum1 == sum2;
    }

    /**
     * This method should calculate and return the sum of the elements in the provided array.
     * Use a for-each loop to iterate over each element in the array and add it to a sum variable.
     * At the end of the loop, return the sum.
     *
     * @param array the array to calculate the sum of elements.
     * @return the total sum of the array elements.
     */
    private int calculateSum(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum;
        //return Arrays.stream(array).sum();
    }
}
