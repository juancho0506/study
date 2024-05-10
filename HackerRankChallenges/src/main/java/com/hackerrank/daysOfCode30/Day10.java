package com.hackerrank.daysOfCode30;

import java.util.*;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //Fist way with more complexity:
        /*Deque<Integer> binaryNumber = getBinaryDigitsStack(n);
        int cont = 0;
        int maxCont = 0;
        if (binaryNumber.size() == 1) {
            maxCont = 1;
        }else {
            for (int binary:binaryNumber) {
                if (binary == 1) {
                    cont++;
                    if (cont > maxCont){
                        maxCont = cont;
                    }
                }else {
                    cont = 0;
                }
            }
        }
        System.out.println(maxCont);
        */

        //Second more efficient way:
        if (n ==1) {
            System.out.println(1);
        } else {
            System.out.println(countBinaryConsecutiveOnes(n));
        }
        scanner.close();
    }
    private static LinkedList<Integer> getBinaryDigitsList(int n) {
        LinkedList<Integer> binaryNumber = new LinkedList<>();

        while (n > 0){
            int remainder = n %2;
            n = n /2;
            binaryNumber.addFirst(remainder);
        }
        return binaryNumber;
    }
    private static Deque<Integer> getBinaryDigitsStack(int n) {
        Deque<Integer> binaryDeque = new ArrayDeque<>();
        while (n > 0){
            int remainder = n %2;
            n = n /2;
            binaryDeque.push(remainder);
        }
        return binaryDeque;
    }

    private static int countBinaryConsecutiveOnes(int n){
        int cont=0;
        int maxCont = 0;
        while (n > 0){
            int remainder = n %2;
            n = n /2;
            if (remainder == 1){
                cont++;
                if (cont > maxCont){
                    maxCont = cont;
                }
            } else {
                cont = 0;
            }
        }
        return maxCont;
    }

}
