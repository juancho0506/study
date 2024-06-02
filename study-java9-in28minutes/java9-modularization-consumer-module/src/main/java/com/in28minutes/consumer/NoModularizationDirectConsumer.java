package com.in28minutes.consumer;

import java.util.List;
import java.util.logging.Logger;

/**
 * Direct consumer using the Bubble sort class skipping the good practice
 * to use the utility class.
 */
public class NoModularizationDirectConsumer {
    private static final Logger logger = Logger.getLogger(NoModularizationDirectConsumer.class.getName());

    public static void main(String[] args) {
        //Can't access now the BubbleSort class given is not exposed on the service module.
        //MyBubbleSort bubbleSort = new MyBubbleSort(); //Commented to avoid compilation errors.
        //List<String> sorted = bubbleSort.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));
        //logger.info(sorted.toString());
    }
}
