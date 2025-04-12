package com.interview.lld.thread.synchronizedCounter;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:18
 */

public class Counter {
    private Integer count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized Integer getCount(){
        return count;
    }
}
