package com.in28minutes.exercises.intro.section7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {

    @Test
    void isValidTriangle() {
        //Given
        int angle1, angle2, angle3;
        angle1 = 60;
        angle2 = 60;
        angle3 = 60;

        //Then
        Exercises triangleValidator = new Exercises();
        boolean result = triangleValidator.isValidTriangle(angle1, angle2, angle3);

        //Assert that
        assertTrue(result);

    }

    @Test
    void isNotValidTriangleWithZeros() {
        //Given
        int angle1, angle2, angle3;
        angle1 = 0;
        angle2 = 60;
        angle3 = 120;

        //Then
        Exercises triangleValidator = new Exercises();
        boolean result = triangleValidator.isValidTriangle(angle1, angle2, angle3);

        //Assert that
        assertFalse(result);
    }
    @Test
    void isNotValidTriangleWithSumNotEq180() {
        //Given
        int angle1, angle2, angle3;
        angle1 = 80;
        angle2 = 60;
        angle3 = 120;

        //Then
        Exercises triangleValidator = new Exercises();
        boolean result = triangleValidator.isValidTriangle(angle1, angle2, angle3);

        //Assert that
        assertFalse(result);
    }

    @Test
    void isRightAngledWithSide1AsHyp() {
        //Given
        double side1, side2, side3;
        side1 = 5;
        side2 = 4;
        side3 = 3;

        //Then
        Exercises triangleValidator = new Exercises();
        boolean result = triangleValidator.isRightAngled(side1, side2, side3);

        //Assert that
        assertTrue(result);
    }
    @Test
    void isRightAngledWithSide3AsHyp() {
        //Given
        double side1, side2, side3;
        side1 = 5;
        side2 = 12;
        side3 = 13;

        //Then
        Exercises triangleValidator = new Exercises();
        boolean result = triangleValidator.isRightAngled(side1, side2, side3);

        //Assert that
        assertTrue(result);
    }

    @Test
    void calculateSumOfSquaresFor3() {
        //Given
        int n = 3;
        //Then
        Exercises sumOfSquares = new Exercises();
        long sum = sumOfSquares.calculateSumOfSquares(n);
        //Assert that
        assertEquals(14, sum);
    }

    @Test
    void calculateSumOfSquaresFor100() {
        System.out.println("Start process no optimized..");
        long startTime = System.currentTimeMillis();
        //Given
        int n = 100;
        //Then
        Exercises sumOfSquares = new Exercises();
        long sum = sumOfSquares.calculateSumOfSquares(n);
        long endTime = System.currentTimeMillis();
        //Assert that
        assertEquals(338350, sum);
        System.out.printf("Total time to excute: %d%n", endTime-startTime);
    }

    @Test
    void calculateSumOfSquaresFor0() {
        //Given
        int n = 0;
        //Then
        Exercises sumOfSquares = new Exercises();
        long sum = sumOfSquares.calculateSumOfSquares(n);
        //Assert that
        assertEquals(0, sum);
    }

    @Test
    void calculateSumOfSquaresOptimizedFor3() {
        //Given
        int n = 3;
        //Then
        Exercises sumOfSquares = new Exercises();
        long sum = sumOfSquares.calculateSumOfSquaresOptimized(n);
        //Assert that
        assertEquals(14, sum);
    }
    @Test
    void calculateSumOfSquaresOptimizedFor1000() {
        System.out.println("Start process optimized..");
        long startTime = System.currentTimeMillis();
        //Given
        int n = 1000;
        //Then
        Exercises sumOfSquares = new Exercises();
        long sum = sumOfSquares.calculateSumOfSquaresOptimized(n);
        System.out.println("Result: " + sum);
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time to execute: %d%n", endTime-startTime);
        //Assert that
        assertEquals(333833500, sum);
    }

    @Test
    void isNotLeapYear1900() {
        //Given
        int year = 1900;
        Exercises leapYear = new Exercises();
        //Then
        boolean result = leapYear.isLeapYear(year);
        //Assert that
        assertFalse(result);
    }

    @Test
    void isLeapYear2000() {
        //Given
        int year = 2000;
        Exercises leapYear = new Exercises();
        //Then
        boolean result = leapYear.isLeapYear(year);
        //Assert that
        assertTrue(result);
    }
}