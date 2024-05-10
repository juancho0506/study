package net.projecteuler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>If we list all the natural numbers below <b>10</b> that are multiples of <b>3</b> or <b>5</b>, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.</p>
 * <p>Find the sum of all the multiples of 3 or 5 below 1000.</p>
 */
public class Problem1 {


    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Finding and total sum of 3 or 5 multiples.");
        System.out.println("Please input max number to reach: ");
        double maxIterations = input.nextDouble();

        //lazyWayToDoIt(maxIterations);
        betterWayToDoIt(maxIterations-1);
        input.close();
    }

    private static void lazyWayToDoIt(double maxIterations) {
        int totalSum = 0;
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i< maxIterations; i++){
            if (i%3 == 0 || i%5 ==0){
                totalSum += i;
                multiples.add(i);
            }
        }
        //System.out.printf("Found numbers: %s%n", multiples); // |-> Just for small sizes of the list.
        System.out.printf("Total sum: %d%n", totalSum);
    }

    private static void betterWayToDoIt(double maxIterations) {
        System.out.printf("Result: %d", sumDivisibleBy(3, maxIterations) + sumDivisibleBy(5, maxIterations) - sumDivisibleBy(15, maxIterations));
    }

    private static long sumDivisibleBy(int n, double maxIterations) {
        long lastMultiplierForN = (long) (maxIterations/n);
        return (n*(lastMultiplierForN*(lastMultiplierForN+1)))/2;
    }
}
