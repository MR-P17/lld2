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

        //Future holds result of asynchronous process.
        Future<Integer> future = executor.submit(task);
        System.out.println("Waiting for the Result ...");
        Integer result = future.get();
        System.out.println("Result : " + result);
    }
}
