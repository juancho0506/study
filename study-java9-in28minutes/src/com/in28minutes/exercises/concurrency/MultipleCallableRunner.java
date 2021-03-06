package com.in28minutes.exercises.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
                new CallableTask("Ranga"), new CallableTask("Adam"));
        List<Future<String>> results = executorService.invokeAll(tasks);

        //Also we can use invokeAny to print the fastest result:
        String anyResult = executorService.invokeAny(tasks);
        System.out.println("Printing any result: " + anyResult);

        for (Future<String> result : results ){
            System.out.println(result.get());
        }
        executorService.shutdown();
    }
}
