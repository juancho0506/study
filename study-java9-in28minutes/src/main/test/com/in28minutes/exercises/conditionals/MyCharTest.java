package com.in28minutes.exercises.conditionals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCharTest {

    @Test
    void isVowelTrue() {
        //Given
        char testA = 'a';
        char testE = 'E';
        char testI = 'i';
        char testO = 'o';
        //Then
        MyChar myChar = new MyChar();
        //Assert That
        assertTrue(myChar.isVowel(testA));
        assertTrue(myChar.isVowel(testE));
        assertTrue(myChar.isVowel(testI));
        assertTrue(myChar.isVowel(testO));
    }
    @Test
    void isVowelFalse() {
        //Given
        char testB = 'B';
        char testC = 'C';
        char testZ = 'z';
        char test2 = '2';
        //Then
        MyChar myChar = new MyChar();
        //Assert That
        assertFalse(myChar.isVowel(testB));
        assertFalse(myChar.isVowel(testC));
        assertFalse(myChar.isVowel(testZ));
        assertFalse(myChar.isVowel(test2));
    }
}