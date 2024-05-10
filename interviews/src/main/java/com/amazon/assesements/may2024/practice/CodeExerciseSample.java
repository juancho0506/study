package com.amazon.assesements.may2024.practice;

import java.util.Arrays;

/**
 * Given a grid of robot positions, indicate if it is valid a time series, for the
 * number of robots specified if robots can only travel up to 1 index further than
 * their position 1 step before.
 * Input format: An array of arrays, of which each index can be 0 or 1.
 * An index corresponds to the physical location which is either occupied (1) by a robot or empty(0)
 * <br>
 * Ex:
 * Grid: [[1,0,0,1], [0,1,1,0]] is a valid time series for 2 robots because the first robot moved from index 0 to index 1
 *  and robot 2 moved from index 3 to index 2.
 *  <br>
 *  Grid: [[1,0,0,0,1], [1,0,1,0,0]] is not valid because the second robot started at index 4
 *  but did not have a valid position on the next step.
 *  <br>
 *  Additional notes after asking the interviewer: <br>
 *  - Size of the arrays are equal. <br>
 *  - Number of robots could be zero. <br>
 *  - Minimum length for these arrays provided will be one. <br>
 *  - Time series would have same length or internal arrays length are equal.
 */
public class CodeExerciseSample {


    public static void main(String[] args) {
        int[][] testGrid = new int[][]{new int[]{1,0,0,1}, new int[]{0,1,1,0}};
        System.out.println("Grid with robots: " + Arrays.deepToString(testGrid));
        System.out.println("Is valid time series? : " + isValidPath(testGrid, testGrid.length));
    }

    private static boolean isValidPath(int[][] grid, int numRobots){

        return false;
    }
}
