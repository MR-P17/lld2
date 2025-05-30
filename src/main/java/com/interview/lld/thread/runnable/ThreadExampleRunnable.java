package com.interview.lld.thread.runnable;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:07
 */

public class ThreadExampleRunnable {
    public static void main(String[] args) {
        Runnable runnable = new Task();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
