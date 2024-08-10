package com.in28minutes.exercises.arrays;

import com.in28minutes.exercises.referencetypes.StringMagic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMagicTest {

    @Test
    void doesHaveElementGreaterThan() {
        //Given
        int[] test = {5, 7, 9, 20, 1099};
        ArrayMagic magic = new ArrayMagic();
        //Then
        boolean res = magic.doesHaveElementGreaterThan(test, 9);
        //Assert that:
        assertTrue(res);
    }

    @Test
    void doesHaveElementGreaterThanWithStreams() {
        //Given
        int[] test = {5, 7, 9, 20, 1099};
        ArrayMagic magic = new ArrayMagic();
        //Then
        boolean res = magic.doesHaveElementGreaterThan(test, 9);
        //Assert that:
        assertTrue(res);
    }

    @Test
    void findSecondLargestElementTest1() {
        //Given
        int[] test = {5, 7, 9, 20, 1099};
        ArrayMagic magic = new ArrayMagic();
        //Then
        int res = magic.findSecondLargestElement(test);
        //Assert that:
        assertEquals(20, res);
    }
    @Test
    void findSecondLargestElementTest2() {
        //Given
        int[] test = {5, 5, 5, 4, 4};
        ArrayMagic magic = new ArrayMagic();
        //Then
        int res = magic.findSecondLargestElement(test);
        //Assert that:
        assertEquals(4, res);
    }
    @Test
    void findSecondLargestElementTest3() {
        //Given
        int[] test = {5, 5, 5, 5, 5};
        ArrayMagic magic = new ArrayMagic();
        //Then
        int res = magic.findSecondLargestElement(test);
        //Assert that:
        assertEquals(-1, res);
    }
    @Test
    void findSecondLargestElementTest4() {
        //Given
        int[] test = {-5, -2, -100, -500};
        ArrayMagic magic = new ArrayMagic();
        //Then
        int res = magic.findSecondLargestElement(test);
        //Assert that:
        assertEquals(-5, res);
    }

    @Test
    void isSortedWithNoSortedValues() {
        //Given
        int[] test = {-5, -2, -100, -500};
        ArrayMagic magic = new ArrayMagic();
        //Then
        boolean res = magic.isSorted(test);
        //Assert that:
        assertFalse(res);
    }
    @Test
    void isSortedWithIdenticalValues() {
        //Given
        int[] test = {2, 2, 2, 2};
        ArrayMagic magic = new ArrayMagic();
        //Then
        boolean res = magic.isSorted(test);
        //Assert that:
        assertTrue(res);
    }
    @Test
    void isSortedAscValid() {
        //Given
        int[] test = {-3, -2, -1, 0, 1};
        ArrayMagic magic = new ArrayMagic();
        //Then
        boolean res = magic.isSorted(test);
        //Assert that:
        assertTrue(res);
    }
}