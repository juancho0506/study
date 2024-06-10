package com.in28minutes.exercises.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void getLastDigitUsingStringNoZeroAtTheEnd() {
        int number = 4567;
        NumberUtils test = new NumberUtils();
        assertEquals(7, test.getLastDigitUsingString(number));
    }
    @Test
    void getLastDigitUsingStringZeroAtTheEnd() {
        int number = 1500;
        NumberUtils test = new NumberUtils();
        assertEquals(0, test.getLastDigitUsingString(number));
    }
    @Test
    void getLastDigitUsingStringNegatives() {
        int number = -5;
        NumberUtils test = new NumberUtils();
        assertEquals(-1, test.getLastDigitUsingString(number));
    }
    @Test
    void getLastDigitUsingModNoZeroAtTheEnd() {
        int number = 4567;
        NumberUtils test = new NumberUtils();
        assertEquals(7, test.getLastDigitUsingMod(number));
    }
    @Test
    void getLastDigitUsingModZeroAtTheEnd() {
        int number = 1500;
        NumberUtils test = new NumberUtils();
        assertEquals(0, test.getLastDigitUsingMod(number));
    }
    @Test
    void getLastDigitUsingModNegatives() {
        int number = -5;
        NumberUtils test = new NumberUtils();
        assertEquals(-1, test.getLastDigitUsingMod(number));
    }

    @Test
    void getNumberOfDigitsNegative() {
        int number = -5;
        NumberUtils test = new NumberUtils();
        assertEquals(-1, test.getNumberOfDigits(number));
    }
    @Test
    void getNumberOfDigitsValidNumber() {
        int number = 1500;
        NumberUtils test = new NumberUtils();
        assertEquals(4, test.getNumberOfDigits(number));
    }
    @Test
    void getNumberOfDigitsZeroValue() {
        int number = 0;
        NumberUtils test = new NumberUtils();
        assertEquals(1, test.getNumberOfDigits(number));
    }
    @Test
    void getSumOfDigitsZeroValue() {
        int number = 0;
        NumberUtils test = new NumberUtils();
        assertEquals(0, test.getSumOfDigits(number));
    }
    @Test
    void getSumOfDigitsValidNumber() {
        int number = 123;
        NumberUtils test = new NumberUtils();
        assertEquals(6, test.getSumOfDigits(number));
    }

    @Test
    void reverseNumberValidNumber123() {
        int number = 123;
        NumberUtils test = new NumberUtils();
        assertEquals(321, test.reverseNumber(number));
    }
    @Test
    void reverseNumberValidNumber5497() {
        int number = 5497;
        NumberUtils test = new NumberUtils();
        assertEquals(7945, test.reverseNumber(number));
    }
    @Test
    void reverseNumberValidNumber5AndZero() {
        int number = 5;
        NumberUtils test = new NumberUtils();
        assertEquals(5, test.reverseNumber(number));
        number = 0;
        assertEquals(0, test.reverseNumber(number));
    }
}