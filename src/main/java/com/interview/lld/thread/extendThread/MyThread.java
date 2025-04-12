package com.interview.lld.thread.extendThread;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 19:59
 */

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5; i++){
            System.out.println("Thread " + Thread.currentThread().getId() + ": count " + i);
        }
    }
}
