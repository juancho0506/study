package com.jtorres.hackerrank.interview.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * FizzBuzz
 * Given a number n, for each integer i in the range from 1 to n inclusive, print one value per line as follows:
 * if i is mutiple of 3 and 5 print FizzBuzz
 * if i is a multiple 3 (but not 5), print Fizz
 * if i is a multiple 5 (but not 3), print Buzz
 * If i is not multiple of 3 or 5, print the value of i.
 */
class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here
        for (int i=1; i<=n; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}
public class RappiSampleTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
