package com.in28minutes.exercises.newreleases.java9.modularization.consumer;

import com.in28minutes.exercises.newreleases.java9.modularization.sort.util.ModularizationSortingUtil;

import java.util.List;
import java.util.logging.Logger;

/**
 * Java 9 Modularization Feature.
 * Example with no modularization and open dependency to use any class from a consumer.
 */
public class Java9ModularizationSortConsumer {
    private static final Logger logger = Logger.getLogger(Java9ModularizationSortConsumer.class.getName());
    public static void main(String[] args) {
        ModularizationSortingUtil sortingUtil = new ModularizationSortingUtil();
        List<String> sorted = sortingUtil.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));
        logger.info(sorted.toString());
    }
}
