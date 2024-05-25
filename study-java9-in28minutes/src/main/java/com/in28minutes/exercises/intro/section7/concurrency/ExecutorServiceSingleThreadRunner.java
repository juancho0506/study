package com.in28minutes.exercises.intro.section7.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceSingleThreadRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //Task 1
        System.out.println("\nTask1 Kicked off\n");
        executorService.execute(new Task1());

        //Task 2
        System.out.println("\nTask2 Kicked off\n");
        executorService.execute(new Task2());

        //Task 3
        System.out.println("\nTask3 Kicked off\n");
        for(int i= 301; i<= 399; i++)
            System.out.println(i + " ");

        System.out.println("\nTask3 Done\n");

        System.out.println("\nMain Done\n");

        executorService.shutdown();
    }
}
