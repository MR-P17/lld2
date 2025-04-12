package com.interview.lld.thread.Deadlock;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:51
 */

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        //Passing new Runnable object with override run() function
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                resource1.method1(resource2);
            }
        });

        //Using Lambda to override run() function
        Thread thread2 = new Thread(() -> resource2.method1(resource1));

        thread1.start();
        thread2.start();
    }
}
