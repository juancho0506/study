package com.in28minutes.exercises.loops;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/**
 * In this problem, you are tasked with completing the implementation of a FactorialCalculator class in Java that calculates the factorial of a given number.
 * The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
 * The factorial function can be defined by the product:
 * n! = n * (n-1) * (n-2) * ... * 3 * 2 * 1
 */
public class FactorialCalculator {
    /**
     * This method will take one parameter, number (an integer),
     * and it should calculate the factorial of this number.
     * If the input number is negative, it should return -1.
     * @param number number to calculate factorial.
     * @return the factorial result of a number.
     */
    public long calculateFactorialRecursive(int number) {
        // Write your code here
        if (number==0 || number == 1)
            return 1;
        if (number < 0)
            return -1;
        return number * calculateFactorialRecursive(number-1);
    }

    /**
     * Classic factorial Impl with Loops (Too limited as well)
     * @param number number to calculate factorial.
     * @return the factorial result of a number.
     */
    public long calculateFactorialLoop(int number){
        //Edge case negative numbers.
        if (number < 0)
            return -1;
        // We start by initializing our factorial variable to 1.
        // This covers the edge case where number is 0 or 1, as the factorial of both 0 and 1 is 1.
        int factorial = 1;

        // Next, we use a for loop to calculate the factorial. The loop starts from 2
        // (since 0 and 1 are covered already) and goes up to the input number.
        for (int i = 2; i <= number; i++) {
            // On each iteration, we multiply the current value of factorial by the loop index i.
            factorial = factorial * i;
        }
        // After the loop finishes, we have our result. We simply return this value.
        return factorial;
    }
    /**
     * Factorial Impl using Java 8 Streams API (Too limited as well)
     * @param number number to calculate factorial.
     * @return the factorial result of a number.
     */
    public long calculateFactorialStreams(int number){
        return LongStream.rangeClosed(1,number)
                .reduce(1, (long x, long y) -> x*y);
    }
    /**
     * Factorial Impl using BigInteger (More capacity, still some limited)
     * @param number number to calculate factorial.
     * @return the factorial result of a number.
     */
    public BigInteger calculateFactorialBigInteger(int number){
        BigInteger result = BigInteger.ONE;
        for (int i=2; i <= number; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    /**
     * Factorial Impl using Google Guava library, is really effective
     * to calculate big numbers (optimized algorithm)
     * @param number number to calculate factorial.
     * @return the factorial result of a number.
     */
    public BigInteger calculateFactorialGuava(int number){
        return BigIntegerMath.factorial(number);
    }
}
