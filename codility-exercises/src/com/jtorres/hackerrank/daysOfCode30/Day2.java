package com.jtorres.hackerrank.daysOfCode30;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Day2 {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double grossTip = meal_cost * (tip_percent / 100.0);
        double grossTax = meal_cost * (tax_percent / 100.0);

        int totalCost = (int) Math.round(meal_cost + grossTip + grossTax);

        System.out.println(totalCost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
