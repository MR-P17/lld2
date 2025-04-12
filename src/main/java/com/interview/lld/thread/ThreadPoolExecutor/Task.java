package com.interview.lld.thread.ThreadPoolExecutor;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 21:31
 */

public class Task implements Runnable{
    private final Integer taskId;

    public Task(Integer taskId){
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " processing task " + taskId);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
