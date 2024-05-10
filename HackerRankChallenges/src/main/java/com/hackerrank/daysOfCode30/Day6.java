package com.hackerrank.daysOfCode30;

import java.util.Scanner;

public class Day6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T = scanner.nextInt();
        scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        StringBuilder result = new StringBuilder();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < T; i++) {
            result.append(evenAndOdds(scanner.nextLine().toCharArray()));
        }
        scanner.close();
        System.out.println(result);
    }

    private static String evenAndOdds(char[] wordChars) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();
        for (int j = 0; j < wordChars.length; j++) {
            if (j % 2 == 0) {
                evenChars.append(wordChars[j]);
            } else
                oddChars.append(wordChars[j]);
        }
        return String.format("%s %s%n", evenChars, oddChars);
    }
}
