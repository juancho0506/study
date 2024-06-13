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
}