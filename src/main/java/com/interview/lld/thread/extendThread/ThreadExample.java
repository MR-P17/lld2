package com.interview.lld.thread.extendThread;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:03
 */

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}
