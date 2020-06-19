package com.jtorres.hackerrank.daysOfCode30;

import java.util.*;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        LinkedList<Integer> binaryNumber = new LinkedList<>();

        while (n > 0){
            int remainder = n%2;
            n = n /2;
            binaryNumber.addFirst(remainder);
        }
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
        scanner.close();
    }
}
