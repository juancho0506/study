package com.jtorres.hackerrank.interview.practice;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchantMySolution(int n, int[] ar) {

        TreeMap<Integer, Integer> pairs = new TreeMap<>();

        for (Integer elem : ar) {
            if (pairs.containsKey(elem))
            pairs.put(elem, pairs.get(elem) + 1);
            else
                pairs.put(elem, 1);
        }
       return pairs.values().stream()
                .filter(v -> v > 1)
                .mapToInt(e -> e / 2)
               .sum();

    }

    /**
     * This solution gives an O(n)
     * @param n
     * @param ar
     * @return
     */
    static int sockMerchantBestSolution(int n, int[] ar) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar[i])) {
                colors.add(ar[i]);
            } else {
                pairs++;
                colors.remove(ar[i]);
            }
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchantBestSolution(n, ar);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}