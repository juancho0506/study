package com.jtorres.hackerrank.daysOfCode30;

import java.util.Scanner;

public class Day7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //No validations of the String for this one, preconditions state that all are integer.
        for (int i = n-1, j = 0 ; i >= 0; i--, j++) {
            if (i!=0) {
                arr[j] = arrItems[i] + " ";
            }else{
                arr[j] = arrItems[i];
            }
            System.out.print(arr[j]);
        }

        scanner.close();
    }
}
