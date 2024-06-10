package com.in28minutes.exercises.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiNumberTest {

    @Test
    void calculateLCM6and8() {
        //Given:
        int number1 = 6;
        int number2 = 8;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateLCM();
        //Assert that
        assertEquals(24, res);
    }
    @Test
    void calculateLCM4and7() {
        //Given:
        int number1 = 4;
        int number2 = 7;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateLCM();
        //Assert that
        assertEquals(28, res);
    }
    @Test
    void calculateLCMWithZero() {
        //Given:
        int number1 = 0;
        int number2 = 7;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateLCM();
        //Assert that
        assertEquals(0, res);
    }
    @Test
    void calculateLCMWithNegative() {
        //Given:
        int number1 = -4;
        int number2 = 7;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateLCM();
        //Assert that
        assertEquals(-1, res);
    }
    @Test
    void calculateLCMWithBothNegative() {
        //Given:
        int number1 = -4;
        int number2 = -7;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateLCM();
        //Assert that
        assertEquals(-1, res);
    }
    @Test
    void calculateLCMWith10and10() {
        //Given:
        int number1 = 10;
        int number2 = 10;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateLCM();
        //Assert that
        assertEquals(10, res);
    }
}