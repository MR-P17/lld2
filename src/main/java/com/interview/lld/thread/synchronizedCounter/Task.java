package com.interview.lld.thread.synchronizedCounter;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:17
 */

public class Task implements Runnable{
    private Counter counter;
    public Task(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            counter.increment();
            System.out.println("Current Thread " +  Thread.currentThread().getId() + " |  Current count :: "+ this.counter.getCount());
        }
    }
}
