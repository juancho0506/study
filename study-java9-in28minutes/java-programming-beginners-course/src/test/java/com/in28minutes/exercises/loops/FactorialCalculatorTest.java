package com.in28minutes.exercises.loops;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

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
    @Test
    void calculateFactorialLoop20() {
        int number = 9;
        FactorialCalculator calc = new FactorialCalculator();
        assertEquals(362880, calc.calculateFactorialLoop(number));
    }
    @Test
    void calculateFactorialStreams20() {
        int number = 9;
        FactorialCalculator calc = new FactorialCalculator();
        assertEquals(362880, calc.calculateFactorialStreams(number));
    }
    @Test
    void calculateFactorialBigInteger100() {
        int number = 20;
        FactorialCalculator calc = new FactorialCalculator();
        BigInteger expected = new BigInteger("2432902008176640000");
        assertEquals(expected, calc.calculateFactorialBigInteger(number));
    }

    /**
     * Testing bigger numbers with Guava!
     */
    @Test
    void calculateFactorialGuava100() {
        int number = 100;
        FactorialCalculator calc = new FactorialCalculator();
        BigInteger expected = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
        assertEquals(expected, calc.calculateFactorialGuava(number));
    }
}