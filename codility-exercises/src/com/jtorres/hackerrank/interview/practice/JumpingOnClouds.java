package com.jtorres.hackerrank.interview.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int contJumps = 0;
        for (int i=0; i<c.length; i++){
            if ((i+1) < c.length && c[i+1] != 1){
                //Check if I can advance one more step
                if ((i+2) < c.length && c[i+2] != 1){
                    contJumps ++;
                    i = i+1;
                }else{
                    contJumps++;
                }
            }else{
                if ((i+2) < c.length && c[i+2] != 1){
                    contJumps ++;
                    i = i+1;
                }else{
                    break;
                }
            }

        }
        return contJumps;
    }

    static int jumpingOnCloudsV2(int[] c) {
        int contJumps = 0;
        for (int i=0; i<c.length; i++){
            if ((i+2) < c.length && c[i+2] != 1){ //Check if I can advance 2 steps at once.
                contJumps ++;
                i = i+1;
            } else if ((i+1) < c.length && c[i+1] != 1){ //Try to advance 1 step at least..
                contJumps++;
            } else{ //Game over...
                break;
            }
        }
        return contJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnCloudsV2(c);

        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
