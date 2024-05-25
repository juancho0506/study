package com.in28minutes.exercises.intro.section7.variablearguments;

import java.util.Arrays;

public class VariableArgumentsRunner {
    public static void main(String[] args) {
        printElements(1, 2, 10, 20, 50, 125, 145, 170, 1000000);
        System.out.println(sumElements(1, 2, 10, 20, 50, 125, 145, 170, 1000000));
    }

    private static void printElements(int... values) {
        System.out.println(Arrays.toString(values));
    }

    private static int sumElements(int... values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return sum;
    }
}
