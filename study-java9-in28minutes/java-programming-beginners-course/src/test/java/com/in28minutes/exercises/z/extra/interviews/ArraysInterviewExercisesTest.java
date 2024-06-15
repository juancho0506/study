package com.in28minutes.exercises.z.extra.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysInterviewExercisesTest {

    @Test
    void itHasOverlapsValidArray() {
        int[] numbers = {4, 10, 2, 6, 3};
        ArraysInterviewExercises exercises = new ArraysInterviewExercises();
        boolean res = exercises.itHasOverlaps(numbers);
        assertTrue(res);
    }
    @Test
    void itHasOverlapsValidArrayNoOverlaps() {
        int[] numbers = {10, 20, 1, 5, 3};
        ArraysInterviewExercises exercises = new ArraysInterviewExercises();
        boolean res = exercises.itHasOverlaps(numbers);
        assertFalse(res);
    }
    @Test
    void itHasOverlapsValidArrayNoOverlapsReverse() {
        int[] numbers = {1, 5, 10, 20, 3};
        ArraysInterviewExercises exercises = new ArraysInterviewExercises();
        boolean res = exercises.itHasOverlaps(numbers);
        assertFalse(res);
    }
    @Test
    void itHasOverlapsValidArrayOverlaps5() {
        int[] numbers = {10, 115, 100, 150, 10};
        ArraysInterviewExercises exercises = new ArraysInterviewExercises();
        boolean res = exercises.itHasOverlaps(numbers);
        assertTrue(res);
    }

    @Test
    void sumArrayOverlapsWithOverlapping() {
        int[] a = {4, 10, 2, 6, 3};
        int[] b = {1, 5, 10, 20, 3};
        ArraysInterviewExercises exercises = new ArraysInterviewExercises();
        int res = exercises.sumArrayOverlaps(a, b);
        assertEquals(13, res);
    }
    @Test
    void sumArrayOverlapsNoOverlapping() {
        int[] a = {4, 2, 6, 7};
        int[] b = {1, 5, 10, 20, 3};
        ArraysInterviewExercises exercises = new ArraysInterviewExercises();
        int res = exercises.sumArrayOverlaps(a, b);
        assertEquals(0, res);
    }
}