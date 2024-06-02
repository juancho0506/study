package com.in28minutes.exercises.newreleases.java9.modularization.consumer;

import com.in28minutes.exercises.newreleases.java9.modularization.sort.algorithm.MyBubbleSort;

import java.util.List;
import java.util.logging.Logger;

/**
 * Direct consumer using the Bubble sort class skipping the good practice
 * to use the utility class.
 */
public class NoModularizationDirectConsumer {
    private static final Logger logger = Logger.getLogger(NoModularizationDirectConsumer.class.getName());

    public static void main(String[] args) {
        MyBubbleSort bubbleSort = new MyBubbleSort();
        List<String> sorted = bubbleSort.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));
        logger.info(sorted.toString());
    }
}
