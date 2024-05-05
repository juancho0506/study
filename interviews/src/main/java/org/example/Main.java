package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * The problem: Given an integer array int[] A and its size N, find 2 non-subsequent (can't be adjacent in the array) elements with minimal sum.
 * Also, the answer must not contain the first or last elements (index 0 and n-1).
 * Also, the solution should be in O(n) time and space complexity.
 * E.g. when A = [5, 2, 4, 6, 3, 7] the answer is 5, since 2+3=5.
 * When A = [1, 2, 3, 3, 2, 1] the answer is 4, since 2+2=4 and you can't choose either of the 1's since they are at the ends of the array.
 * <p>
 * I thought, well, I will just find the 3 smallest numbers (besides the first and last) in the array,
 * and the solution will have to be two of those, since two of those have to not be adjacent to each other.
 * This also failed due to A = [2, 2, 1, 2, 4, 2, 6] -> 2+1=3 , which seems to work because I will find 2, 1, 2,
 * but assuming I am finding the 2, 1, 2 in indexes 1, 2, 3 this won't necessarily work
 */
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome! Testing a problem found in the internet.");
        int[] input = {2, 2, 1, 2, 4, 2, 6};
        int answer = solveOn(input);
        System.out.println("Answer is : " + answer);
        }

    /**
     * Method that solves the problem with O(n^2) complexity
     * @param array
     * @return
     */
    private static int solveOn2(int[] array) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        int answer = Integer.MAX_VALUE;
        for (int i = 3; i < array.length - 1; i++) {
            for (int j = 1; j < i - 1; j++) {
                if (array[i] + array[j] < answer) {
                    answer = array[i] + array[j];
                }
            }
        }
        return answer;
    }

    /**
     * Method that solves the problem with O(n) complexity
     * @param array
     * @return
     */
    private static int solveOn(int[] array) {
        int answer = Integer.MAX_VALUE;
        int min = array[1];
        for (int i = 3; i < array.length - 1; i++) {
            min = Math.min(min, array[i-2]);
            if (array[i] + min < answer) {
                answer = array[i] + min;
            }
        }
        return answer;
    }
}