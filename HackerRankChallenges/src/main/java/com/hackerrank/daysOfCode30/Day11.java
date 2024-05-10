package com.hackerrank.daysOfCode30;

import java.util.Scanner;

/**
 * Objective
 * Today, we're building on our knowledge of Arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video!
 * <br>
 * Context
 * Given a  2D Array, A:
 * <br>
 * 1 1 1 0 0 0 <br>
 * 0 1 0 0 0 0 <br>
 * 1 1 1 0 0 0 <br>
 * 0 0 0 0 0 0 <br>
 * 0 0 0 0 0 0 <br>
 * 0 0 0 0 0 0 <br>
 * We define an hourglass in A to be a subset of values with indices falling in this pattern in 's graphical representation:
 * <br>
 * a b c <br>
 *   d   <br>
 * e f g <br>
 * There are 16  hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
 * <br>
 * Task
 *  Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 */
public class Day11 {
    private static final Scanner scanner = new Scanner(System.in);

    private static int findMaxHourglass(int[][] matrix, int rowSize, int colSize){
        for(int i = 0; i < rowSize; i++) {
            // print the row of space-separated values
            for(int j = 0; j < colSize; j++) {
                // Mini internal loop to loop over the current hourglass.
                int hourGlassCol = 1;
                int hourGlassRow = 1;
                for (int l = i; l <= (i + 2) && (i + 2) < rowSize;  l++, hourGlassRow++) {
                    for (int k = j; k <= (j + 2) && (j + 2) < colSize;  k++, hourGlassCol++) {
                        if (hourGlassRow == 2 && hourGlassCol == 1){
                            System.out.print(" ");
                        }else if (hourGlassRow == 2 && hourGlassCol == 3){
                            System.out.print(" ");
                        }else {
                            System.out.print(matrix[l][k] + " ");
                        }
                    }
                    hourGlassCol = 1;
                    System.out.println();
                }
                // end of row is reached, print newline
                hourGlassRow = 1;
                System.out.println();
            }

        }
        return 0;
    }

    private static void print2DArray(int[][] matrix, int rowSize, int colSize){
        for(int i = 0; i < rowSize; i++) {
            // print the row of space-separated values
            for(int j = 0; j < colSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // end of row is reached, print newline
            System.out.println();
        }
    }

    /**
     * Input Format
     * <br>
     * There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A;
     * every value in A will be in the inclusive range of:
     * <br>
     * Constraints: <br>
     *  * -9 <= A[i][j] <= 0 <br>
     *  * 0<=i,j<=5 <br>
     * <br>
     * Output Format: Print the maximum hourglass sum in A.
     */
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxHourglass = findMaxHourglass(arr, 6, 6);

        scanner.close();
    }
}
