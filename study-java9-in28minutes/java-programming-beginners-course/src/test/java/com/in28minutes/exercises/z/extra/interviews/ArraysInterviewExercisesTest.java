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
}