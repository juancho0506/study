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
}