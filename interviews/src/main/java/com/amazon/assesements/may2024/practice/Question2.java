package com.amazon.assesements.may2024.practice;

import java.io.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Amazon would like to know how much inventory exists on their closed inventory compartment.
 * Given a string s consisting of items as "*" as closed compartments, as an open and close "|",
 * an array of starting indices starIndices, and an array of ending indices endIndices,
 * determine the number of items in closed compartments within the substring between the
 */
public class Question2 {
    public static void main(String[] args) throws IOException {

    }

    /**
     * Complete the 'numberOfItems' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY startIndices
     *  3. INTEGER_ARRAY endIndices
     **/
    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here
        SortedSet<Integer> test = new TreeSet<>();
        return Collections.emptyList();
    }

    public static List<String> processLogs(List<String> logs, int threshold) {
        // Write your code here
        List<String> result = new ArrayList<>();
        Map<String, Integer> userIdsOrdered = new TreeMap<>();
        //Edge cases:
        //n = 1
        if (logs.size() == 1) {
            String[] log =  logs.get(0).split(" ");
            result.add((Integer.parseInt(log[0])>Integer.parseInt(log[1]))?log[0]:log[1]);
        } else { //Main algorithm
            for (String log: logs) {
                String[] logSplit = log.split(" ");
                userIdsOrdered = extractUserIdsAsc(logSplit, userIdsOrdered);
            }
            //Count the occurrences and check threshold
            Map<String, Integer> finalUserIdsOrdered = userIdsOrdered;
            result = userIdsOrdered.keySet().stream().filter(id -> finalUserIdsOrdered.get(id) >= threshold).collect(Collectors.toList());
        }

        return result;
    }

    private static Map<String, Integer> extractUserIdsAsc(String[] users, Map<String, Integer> userIdsOrdered){
        for (int i = 0; i< users.length-1; i++){
            if(userIdsOrdered.containsKey(users[i])){
                userIdsOrdered.put(users[i], userIdsOrdered.get(users[i])+1);
            } else {
                userIdsOrdered.put(users[i], 1);
            }
        }
        return userIdsOrdered;
    }
}

