package com.jtorres.hackerrank.daysOfCode30;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secondInteger;
        double secondDouble;
        String someString = "";
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        secondInteger = scan.nextInt();
        scan.nextLine(); //to make pass this line and continue with next.
        secondDouble = Double.parseDouble(scan.nextLine());
        someString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+secondInteger);
        /* Print the sum of the double variables on a new line. */
        System.out.println(Double.sum(d, secondDouble));
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        String res = s+someString;
        System.out.println(res);
        scan.close();
    }
}