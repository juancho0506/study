package com.in28minutes.exercises.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void calculateFactorialRecursive5() {
        int number = 5;
        FactorialCalculator calc = new FactorialCalculator();
        assertEquals(120, calc.calculateFactorialRecursive(number));
    }
    @Test
    void calculateFactorialRecursive100() {
        int number = 100;
        FactorialCalculator calc = new FactorialCalculator();
        assertEquals(9.33262154439441E157, calc.calculateFactorialRecursive(number));
    }
    @Test
    void calculateFactorialRecursiveMinus10() {
        int number = -10;
        FactorialCalculator calc = new FactorialCalculator();
        assertEquals(-1.0, calc.calculateFactorialRecursive(number));
    }
}