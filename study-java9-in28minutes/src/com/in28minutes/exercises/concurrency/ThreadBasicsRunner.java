package com.in28minutes.exercises.concurrency;

public class ThreadBasicsRunner {
    public static void main(String[] args) {
        //Task 1
        for (int i = 101; i <= 199; i++)
            System.out.println(i + " ");

        System.out.println("\nTask1 Done\n");

        //Task 2
        for (int i = 201; i <= 299; i++)
            System.out.println(i + " ");

        System.out.println("\nTask2 Done\n");

        //Task 3
        for(int i= 301; i<= 399; i++)
            System.out.println(i + " ");

        System.out.println("\nTask3 Done\n");

        System.out.println("\nMain Done\n");
    }
}
