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
        int[][] testMatrix = new int[2][4];
        System.out.println("Grid with robots: " + Arrays.deepToString(testGrid));
        System.out.println("Is valid time series? : " + isValidPath(testGrid, testGrid.length));
    }

    private static boolean isValidPath(int[][] grid, int numRobots){
        //Edge cases
        //Edge case 1: Number of robots can be zero
        if (numRobots < 1)
            return false;

        //Edge case2: Only 1 series on the array
        if (grid.length < 2)
            return true;

        //TODO: Should I check if the internal arrays has at least a size of 2, to check a next position.

        //Algorithm: We can see this series of scenarios as a matrix where:
        //Each row represents a different scenario or series of movements, and each column will be the movements itself or robot position.
        for (int i=0; i<grid.length; i++) {
            int robotCounter = 0;
            for (int j=0; j< grid[0].length; j++){
                if (grid[i][j] == 1){
                    robotCounter++;
                    //Invalidate the process if the robot counter is greater than is supposed to be.
                    if (robotCounter>numRobots){
                        break;
                    }
                    //Check by key positions
                    //If robot is at the beginning edge.
                    if (i == 0 && j+1 < grid.length){
                        if (grid[i+1][j+1]!=1){
                            //TODO: Separete this to another function and use a unique way to compare.
                        }
                    }
                }
            }
        }

        return false;
    }
}
