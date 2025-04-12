package com.interview.lld.thread.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 21:34
 */

public class ThreadPoolExample {
    public static void main(String[] args) {
        int corePoolSize = 3;
        int maxPoolSize = 6;
        long keepAliveTime = 1;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(3);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.SECONDS, queue);

        for(int i=1; i<=10; i++){
            executor.submit(new Task(i));
        }
        executor.shutdown();
    }
}
