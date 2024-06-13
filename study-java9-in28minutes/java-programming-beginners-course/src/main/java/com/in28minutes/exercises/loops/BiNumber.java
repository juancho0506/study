package com.in28minutes.exercises.loops;

import java.util.stream.IntStream;

/**
 * You have a class BiNumber with two integer attributes number1 and number2.
 * The task is to complete the method calculateLCM() in the BiNumber class.
 * The method calculateLCM() should calculate the Least Common Multiple (LCM) of number1 and number2 and return it.
 * If either number1 or number2 is negative, the method should return -1 because the LCM of negative numbers is undefined.
 * If either number1 or number2 is zero, the method should return 0 because the LCM of 0 and any other number is 0.
 * Examples
 * Given number1 is 5 and number2 is 10, when calculateLCM() is called, it should return 10.
 * Given number1 is 0 and number2 is 5, when calculateLCM() is called, it should return 0.
 * Given number1 is -2 and number2 is 5, when calculateLCM() is called, it should return -1.
 */
public class BiNumber {

    private final int number1;
    private final int number2;

    /**
     * Constructor that initializes the two numbers.
     *
     * @param number1: The first number.
     * @param number2: The second number.
     */
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Getter for the first number.
     *
     * @return the first number.
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Getter for the second number.
     *
     * @return the second number.
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     *
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateLCM() {
        // Edge Cases:
        if (this.number1 < 0 || this.number2 < 0)
            return -1;
        if (this.number1 * this.number2 == 0)
            return 0;

        //Calculate LCM
        int mcm = this.number1 * this.number2;
        int lcm = mcm;
        int multiplier;
        int secondMultiplier;
        //Using Max to find the greater number:
        multiplier = Math.max(this.number1, this.number2);
        for (int i = 1; i * multiplier < mcm; i++) {  // 6 and 8, mcm=48
            if (i * multiplier % this.number1 == 0 && i * multiplier % this.number2 == 0) { //6*2 =12, 12%8 !=0; 6*3=18 18%8!=0; 6*4=24 24%8==0
                lcm = i * multiplier;
                return lcm;
            }
        }
        return lcm;
        //Second way:
        // Find the maximum of the two numbers
        /*int max = Math.max(number1, number2);
        // Initialize lcm to the maximum number
        int lcm = max;

        // Loop until lcm is found
        while (lcm < this.number2*this.number2) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                return lcm;
            }
            // Increment lcm by max
            lcm += max;
        }
        // Return the calculated lcm
        return lcm;*/
    }

    /**
     * Calculates and returns the greatest common divisor (GCD) of the two numbers.
     * Edge case: If either number is negative, returns 1 as the GCD for negative numbers is 1.
     * Edge case: If either number is zero, returns 0 as the GCD of 0 and any other number is 0.
     * Edge case: If two numbers are equal, returns the number as the GCD of two equal numbers is the number itself.
     *
     * @return GCD of the two numbers, or 1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateGCDIntStream() {
        System.out.printf("Calculating GCD for numbers: %d and %d%n", this.number1, this.number2);
        //Edge cases
        if (this.number1 < 0 || this.number2 < 0)
            return 1;
        if (this.number1 == 0 || this.number2 == 0)
            return 0;
        if (this.number2 == this.number1)
            return this.number2;

        //Calculate GCD
        int minNumber = Math.min(this.number1, this.number2);
        return IntStream.rangeClosed(1, minNumber)
                .filter(number -> this.number1 % number == 0 && this.number2 % number == 0)
                .max().orElse(1);
    }

    /**
     * Iterative version to resolve the problem
     *
     * @return GCD of the two numbers, or 1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateGCDLoop() {
        System.out.printf("Calculating GCD for numbers: %d and %d%n", this.number1, this.number2);
        //Edge cases
        if (this.number1 < 0 || this.number2 < 0)
            return 1;
        if (this.number1 == 0 || this.number2 == 0)
            return 0;
        if (this.number2 == this.number1)
            return this.number2;

        //Calculate GCD
        int minNumber = Math.min(this.number1, this.number2);
        int gcd = 1; //6*8 = 48
        for (int i = minNumber; i >= 1; i--) { //i=47; 47>1
            if (this.number1 % i == 0 && this.number2 % i == 0) //i=24?
                return i;
        }
        return gcd;
    }
}