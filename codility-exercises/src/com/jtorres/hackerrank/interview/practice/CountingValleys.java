package com.jtorres.hackerrank.interview.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    private static final char STEP_UP = 'U';
    private static final char STEP_DOWN = 'D';

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int numValleys = 0;
        char[] steps = s.toCharArray();
        char prev = 0;
        for (int i=0; i<n; i++) {
            if(prev == STEP_DOWN && steps[i] == STEP_DOWN){
                if (i+1 < n && steps[i+1] == STEP_UP){
                    numValleys++;
                    prev = steps[i+1];
                    i = i+1;
                }else {
                    prev = steps[i];
                }
            }else{
                prev = steps[i];
            }
        }
        return numValleys;
    }

    static int countingValleysFixed(int n, String s) {
        int numValleys = 0;
        char[] steps = s.toCharArray();
        int lvl = 0;   // current level
        for(char c : steps) {
            if (c == STEP_UP) ++lvl;
            if (c == STEP_DOWN) --lvl;

            // if we just came UP to sea level
            if (lvl == 0 && c == STEP_UP)
                ++numValleys;
        }
        return numValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleysFixed(n, s.toUpperCase());

        System.out.println(result);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        String first = "HackeRank ";
        String second = "is the best place to learn and practice coding!";
        System.out.println(first+second);

        scanner.close();
    }
}
