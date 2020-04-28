package com.jtorres.codility.exercises;

import java.util.Scanner;

/**
 * Binary Gap:
 * binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded
 * by ones at both ends in the binary representation of N.
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4
 * and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1.
 * The number 15 has binary representation 1111 and has no binary gaps.
 * The number 32 has binary representation 100000 and has no binary gaps.
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..2,147,483,647].
 */
public class Lesson1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number to calculate binary gap: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int result = longestBinaryGap(number);
        System.out.println("Longest Binary Gap : " + result);
    }

    private static int longestBinaryGap(int n) {
        String binaryString = Integer.toBinaryString(n);
        int binaryGap = 0;
        if (binaryString.contains("0")) {
            for (int i = 0; i < binaryString.length(); i++) {
                char current = binaryString.charAt(i);
                int j = i + 1;
                if (current == '1' && j < binaryString.length()) {
                    current = binaryString.charAt(j);
                    int currentGap = 0;
                    while (current == '0' && j < binaryString.length()) {
                        currentGap++;
                        j++;
                        if (j < binaryString.length()) {
                            current = binaryString.charAt(j);
                            if (currentGap > binaryGap && current == '1') {
                                binaryGap = currentGap;
                            }
                        }
                    }
                    i = j;
                }
            }
        }
        return binaryGap;
    }
}
