package com.in28minutes.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiArrayTest {

    @Test
    void areSumsEqual() {
        //Given
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};
        BiArray biArray = new BiArray(a, b);
        //Then
        boolean res = biArray.areSumsEqual();
        //Assert that:
        assertTrue(res);
    }
}