package com.interview.lld.thread.synchronizedCounter;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:22
 */

public class CounterExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Task runnable = new Task(counter);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread2.setPriority(Thread.MAX_PRIORITY); //setting Max priority to thread.

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.out.println("Final Count :: " + counter.getCount());
    }
}
