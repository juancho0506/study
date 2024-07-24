package com.in28minutes.exercises.referencetypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMagicTest {

    @Test
    void countUppercaseLettersNoUppercase() {
        //Given
        String test = "lorem ipsum etc";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.countUppercaseLetters(test);
        //Assert that:
        assertEquals(0, res);
    }
    @Test
    void countUppercaseLettersEmptySpace() {
        //Given
        String test = " ";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.countUppercaseLetters(test);
        //Assert that:
        assertEquals(0, res);
    }
    @Test
    void countUppercaseLettersWith5() {
        //Given
        String test = "LorEm IpsUm eTc";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.countUppercaseLetters(test);
        //Assert that:
        assertEquals(5, res);
    }
    @Test
    void countUppercaseLettersWith1() {
        //Given
        String test = "this is a String test";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.countUppercaseLetters(test);
        //Assert that:
        assertEquals(1, res);
    }

    @Test
    void hasCharDuplicatesHello() {
        //Given
        String test = "Hello";
        StringMagic sm = new StringMagic();
        //Then
        boolean res = sm.hasCharDuplicates(test);
        //Assert that:
        assertTrue(res);
    }
    @Test
    void hasCharDuplicatesSeveralRepetitions() {
        //Given
        String test = "Hello world boss!!";
        StringMagic sm = new StringMagic();
        //Then
        boolean res = sm.hasCharDuplicates(test);
        //Assert that:
        assertTrue(res);
    }
    @Test
    void hasCharDuplicatesNoDuplicates() {
        //Given
        String test = "Hi";
        StringMagic sm = new StringMagic();
        //Then
        boolean res = sm.hasCharDuplicates(test);
        //Assert that:
        assertFalse(res);
    }
    @Test
    void hasCharDuplicatesOneChar() {
        //Given
        String test = "H";
        StringMagic sm = new StringMagic();
        //Then
        boolean res = sm.hasCharDuplicates(test);
        //Assert that:
        assertFalse(res);
    }
    @Test
    void hasCharDuplicatesNoAdjacent() {
        //Given
        String test = "hi how are you?";
        StringMagic sm = new StringMagic();
        //Then
        boolean res = sm.hasConsecutiveDuplicatesOldStyle(test);
        //Assert that:
        assertFalse(res);
    }

    @Test
    void getRightmostDigitExample1() {
        //Given
        String test = "My team scores 5 goals and yours just scored 2.";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.getRightmostDigit(test);
        //Assert that:
        assertEquals(2, res);
    }
    @Test
    void getRightmostDigitExample2() {
        //Given
        String test = "My ID is: 987466521 and is a secret.";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.getRightmostDigit(test);
        //Assert that:
        assertEquals(1, res);
    }
    @Test
    void getRightmostDigit_6months() {
        //Given
        String test = "6months";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.getRightmostDigit(test);
        //Assert that:
        assertEquals(6, res);
    }
    @Test
    void getRightmostDigit_singleDigit() {
        //Given
        String test = "5";
        StringMagic sm = new StringMagic();
        //Then
        int res = sm.getRightmostDigit(test);
        //Assert that:
        assertEquals(5, res);
    }

    @Test
    void findLongestWordEmpty() {
        //Given
        String test = "";
        StringMagic sm = new StringMagic();
        //Then
        String res = sm.findLongestWord(test);
        //Assert that:
        assertEquals("", res);
    }
    @Test
    void findLongestWord_2greater_words() {
        //Given
        String test = "I'm  a Computer Science Engineer nice to meet you.";
        StringMagic sm = new StringMagic();
        //Then
        String res = sm.findLongestWord(test);
        //Assert that:
        assertEquals("Computer", res);
    }
    @Test
    void findLongestWordStreams_2greater_words() {
        //Given
        String test = "I'm  a Computer Science Engineer nice to meet you.";
        StringMagic sm = new StringMagic();
        //Then
        String res = sm.findLongestWordStreamFlavor(test);
        //Assert that:
        assertEquals("Engineer", res);
    }
    @Test
    void findLongestWordStreams_3longest_words() {
        //Given
        String test = "a b c abcdefg abcdefg 1234567";
        StringMagic sm = new StringMagic();
        //Then
        String res = sm.findLongestWordStreamFlavor(test);
        //Assert that:
        assertEquals("1234567", res);
    }
}