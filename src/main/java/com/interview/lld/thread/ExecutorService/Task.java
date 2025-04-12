package com.interview.lld.thread.ExecutorService;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 21:04
 */

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Executing Task 1 ...");
    }
}
