package com.in28minutes.exercises.intro.section7.concurrency;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Hello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("in28Minutes"));
        System.out.println("Callable executed.");
        System.out.println("Is callable completed? : " + welcomeFuture.isDone());

        System.out.println("Value in callable: " + welcomeFuture.get());

        System.out.println("Is callable completed? : " + welcomeFuture.isDone());

        executorService.shutdown();
        System.out.println("Main completed !");
    }
}
