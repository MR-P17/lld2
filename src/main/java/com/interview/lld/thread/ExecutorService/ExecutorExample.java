package com.interview.lld.thread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 21:01
 */

public class ExecutorExample {
    public static void main(String[] args) {

        //Using Cached thread pool
        ExecutorService executor = Executors.newCachedThreadPool();

        //Creating task1 by calling Task which implements Runnable
        Runnable task1 = new Task();

        //Creating task2 by overriding run() function using lambda.
        Runnable task2 = () -> {
            System.out.println("Executing task 2 ...");
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}
