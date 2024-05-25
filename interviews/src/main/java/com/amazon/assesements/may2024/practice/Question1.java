package com.amazon.assesements.may2024.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An Amazon Fulfillment Associate has a set of items that need to be packed into two boxes.
 * Given an integer array of the item weights (arr) to be packed, divide the item weights into two subsets, A and B
 * for packing into the associate boxes, while respecting the following conditions:
 * * The intersection of A and B is null.
 * * The union A and B is equal to the original array
 * * The number of elements in subset A is minimal.
 * * The sum of A's weights is greater than the sum of B's weights.
 * ---
 * Return a subset of A in increasing order where the sum of A's weights is greater than the sum of B's weights.
 * If more than one subset A exists, return the one with the maximal total weight.
 * Example:
 * n = 5
 * arr = [3, 7, 5, 6, 2] total weight = 23
 * The 2 possible subsets in arr for A are: [5, 7] and [6, 7]:
 * - A is minimal (size 2)
 * - Sum(A) = (5+7) = 12 > Sum(B) = (2+3+6) = 11
 * - Sum (A) = (6+7) = 13 > Sum(B) = (2+3+5) = 10
 * The intersection of A and B is null and their union is equal to arr.
 * The subset A where the sum of its weight is maximal is [6, 7]
 * Other example: arr = [18, 1, 1, 2, 1] total weight = 23
 */

class Question1 {

    /*
     * Complete the 'minimalHeaviestSetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     * Constraints:
     * 1<=n<=10^5
     * 1<=arr[i]<=10^5 (Where 0<=i<=n))
     */

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        // Write your code here
        Integer maxWeight = arr.getFirst();
        int itemsTotal = arr.size();
        List<Integer> listA = new ArrayList<>();

        int totalWeight = getTotalWeight(arr, maxWeight, listA);
        System.out.println("Total weight : " + totalWeight);
        System.out.println("Total items : " + itemsTotal);

        int minimumTotalWeight = (totalWeight / 2) + 1;
        int listAweight = 0;
        List<Integer> finalList = new ArrayList<>();
        //Order listA from ASC
        listA.sort(Collections.reverseOrder()); //Complexity of O(Nlog(n))
        System.out.println("ListA sorted asc: " + listA);
        for (Integer current : listA) {
            finalList.add(current);
            listAweight += current;
            if (listAweight >= minimumTotalWeight) {
                return finalList;
            }
        }

        return listA;
    }

    private static int getTotalWeight(List<Integer> arr, Integer maxWeight, List<Integer> listA) {
        int totalWeight = 0;
        for (Integer current : arr) {
            totalWeight += current;

            if (current >= maxWeight) {
                maxWeight = current;
                //Add current maxWeight item on the list to A list.
                listA.add(current);

            } else {
                //Add items that are close to the max weight:
                int minPortionWeightDiff = (int) Math.round(maxWeight * 0.6);
                if (current >= minPortionWeightDiff) {
                    listA.add(current);
                }
            }
        }
        return totalWeight;
    }


    public static void main(String[] args) throws IOException {

        List<Integer> arr = List.of(100, 1, 3, 6, 2, 7, 10, 5);
        System.out.printf("Initial list: %s%n", arr);
        List<Integer> result = minimalHeaviestSetA(arr);
        System.out.printf("List A result: %s%n", result);
    }

}
