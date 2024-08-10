package com.in28minutes.exercises.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayMagic {

    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        if (array == null)
            return false;
        for (int elem:array){
            if (elem > number)
                return true;
        }
        return false;
    }
    //Using Streams:
    public boolean doesHaveElementGreaterThanWithStreams(int[] array, int number) {
        if (array == null)
            return false;
        return Arrays.stream(array).anyMatch(e-> e > number);

    }
    /**
     * This method finds and returns the second-largest element in the given array.
     * You need to implement the logic to find the second-largest number in the array.
     * If there is no second-largest number (for example, if all the elements are the same or if the array has less than two elements), return -1.
     * If there are two or more distinct elements, you need to find the second-largest one.
     * For this, iterate over the array, comparing each element with the currently largest and second-largest elements.
     * Remember to initialize these two tracking variables properly.
     * Finally, return the second-largest element or -1 if there is no second-largest element.
     * Consider edge cases.
     * For example, what happens if all the elements in the array are the same?
     * What if the array contains fewer than two elements?
     * @param array the array in which to find the second-largest element
     * @return the second-largest element in the array
     */

    public int findSecondLargestElement(int[] array) {
        //Edge cases
        if (array == null || array.length == 0)
            return -1;
        if (array.length ==1)
            return -1;
        //What if all the elements are the same?
        int largestElem = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int elem:array){
            System.out.print(elem);
            if (elem > largestElem){
                secondLargest=largestElem;
                largestElem = elem;
            } else if (elem > secondLargest && elem != largestElem){
                secondLargest=elem;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) //No second-largest number found.
            return -1;
        return secondLargest;
    }

    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {
        //Edge cases:
        if (array == null)
            return false;
        if (array.length <= 1)
            return true;
        int minorInteger = Integer.MIN_VALUE;

        //First way to do it:
        /*int cont = 0;
        for (int current: array){
            if (current >= minorInteger && cont ==0){
                minorInteger = current;
                cont++;
            } else {
                if (current < minorInteger)
                    return false;
            }
        }
        return true;*/

        //Second way:
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1])
                return false;
        }
        return true;
    }
}