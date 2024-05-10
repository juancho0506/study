package com.in28minutes.exercises.concurrency;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.ExecutorService;

class Task1 extends Thread {

    public void run(){//Signature
        System.out.println("\nTask1 Started\n");
        for (int i = 101; i <= 199; i++)
            System.out.println(i + " ");

        System.out.println("\nTask1 Done\n");
    }
}

class Task2 implements Runnable { //Other way to implement the thread.

    @Override
    public void run() {
        System.out.println("\nTask2 Started\n");
        for (int i = 201; i <= 299; i++)
            System.out.println(i + " ");

        System.out.println("\nTask2 Done\n");
    }
}

public class ThreadBasicsRunnerImpl {
    public static void main(String[] args) throws InterruptedException {
        //Task 1
        System.out.println("\nTask1 Kicked off\n");
        Task1 task1 = new Task1();
        task1.setPriority(Thread.MIN_PRIORITY);
        task1.start(); //not run() method because is not being executed like a thread.

        //Task 2
        System.out.println("\nTask2 Kicked off\n");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(Thread.MAX_PRIORITY);
        task2Thread.start();

        //Task 3
        //wait for task1 to complete
        task1.join(); //waits until task1 dies.
        System.out.println("\nTask3 Kicked off\n");
        for(int i= 301; i<= 399; i++)
            System.out.println(i + " ");

        System.out.println("\nTask3 Done\n");

        System.out.println("\nMain Done\n");
    }
}
