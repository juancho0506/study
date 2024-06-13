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

    @Test
    void calculateGCDStream_7and4() {
        //Given:
        int number1 = 4;
        int number2 = 7;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDIntStream();
        //Assert that
        assertEquals(1, res);
    }
    @Test
    void calculateGCDStream_6and8() {
        //Given:
        int number1 = 6;
        int number2 = 8;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDIntStream();
        //Assert that
        assertEquals(2, res);
    }
    @Test
    void calculateGCDStream_0and8() {
        //Given:
        int number1 = 0;
        int number2 = 8;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDIntStream();
        //Assert that
        assertEquals(0, res);
    }
    @Test
    void calculateGCDStream_minus1and8() {
        //Given:
        int number1 = -1;
        int number2 = 8;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDIntStream();
        //Assert that
        assertEquals(1, res);
    }
    @Test
    void calculateGCDStream_8and12() {
        //Given:
        int number1 = 8;
        int number2 = 12;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDIntStream();
        //Assert that
        assertEquals(4, res);
    }
    @Test
    void calculateGCDS_7and4() {
        //Given:
        int number1 = 4;
        int number2 = 7;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDLoop();
        //Assert that
        assertEquals(1, res);
    }
    @Test
    void calculateGCD6and8() {
        //Given:
        int number1 = 6;
        int number2 = 8;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDLoop();
        //Assert that
        assertEquals(2, res);
    }
    @Test
    void calculateGCD0and8() {
        //Given:
        int number1 = 0;
        int number2 = 8;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDLoop();
        //Assert that
        assertEquals(0, res);
    }
    @Test
    void calculateGCD_minus1and8() {
        //Given:
        int number1 = -1;
        int number2 = 8;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDLoop();
        //Assert that
        assertEquals(1, res);
    }
    @Test
    void calculateGCD_60and48() {
        //Given:
        int number1 = 60;
        int number2 = 48;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDLoop();
        //Assert that
        assertEquals(12, res);
    }
    @Test
    void calculateGCD_8and12() {
        //Given:
        int number1 = 8;
        int number2 = 12;
        BiNumber biNumber = new BiNumber(number1, number2);
        //Then
        int res = biNumber.calculateGCDLoop();
        //Assert that
        assertEquals(4, res);
    }
}