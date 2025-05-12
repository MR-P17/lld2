package com.interview.lld.thread.CallableAndFuture;

import java.util.concurrent.*;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 21:17
 */

public class CallableAndFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //Callable have return type unlike Runnable.
        //Callable can throw checked exceptions unlike Runnable.
        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 49;
        };

        Callable<String> task2 = new CallableExample();
        Future<String> future1 = executor.submit(task2);
        System.out.println("Waiting for Callable Result ...");
        String result1 = future1.get();
        System.out.println("Result1 : " + result1);


        //Future holds result of asynchronous process.
        Future<Integer> future = executor.submit(task);
        System.out.println("Waiting for the Result ...");
        Integer result = future.get();
        System.out.println("Result : " + result);
    }
}
