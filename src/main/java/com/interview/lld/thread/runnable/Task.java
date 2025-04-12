package com.interview.lld.thread.runnable;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:05
 */

public class Task implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Thread " + Thread.currentThread().getId() + " : count " + i);
        }
    }
}
