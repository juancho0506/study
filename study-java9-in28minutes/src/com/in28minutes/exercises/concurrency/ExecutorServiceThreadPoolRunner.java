package com.in28minutes.exercises.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    private final int number;

    public Task(int number){
        this.number = number;
    }

    public void run(){
        System.out.print("\nTask " + number + " Started.");
        for (int i = number*100; i<=number*100+99; i++)
            System.out.print(i + " ");

        System.out.print("\nTask" + number + " Done!");
    }
}

public class ExecutorServiceThreadPoolRunner {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //Generating tasks
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));

        System.out.println("\nMain Done\n");
        executorService.shutdown();
    }
}
