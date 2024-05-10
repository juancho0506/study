package com.hackerrank.daysOfCode30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //No validations of the String for this one, preconditions state that all are integer.
        for (int i = n-1, j = 0 ; i >= 0; i--, j++) {
            if (i!=0) {
                arr[j] = arrItems[i] + " ";
            }else{
                arr[j] = arrItems[i];
            }
            System.out.print(arr[j]);
        }

        scanner.close();*/

        //V2 using List:
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();
        StringBuilder response = new StringBuilder();
        for (int i = arr.size() - 1; i >= 0; i--) {
            response.append(i > 0 ? arr.get(i) + " " : arr.get(i));
        }

        System.out.println(response);
    }
}
