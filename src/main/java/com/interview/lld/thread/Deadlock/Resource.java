package com.interview.lld.thread.Deadlock;

/**
 * Author: Prashant K Singh
 * Date: 29/01/2025
 * Time: 20:47
 */

public class Resource {
    public synchronized void method1(Resource other){
        //Some logic
        this.method2(other);
        //some logic
    }

    public synchronized void method2(Resource other){
        //some logic
        this.method1(other);
        //some logic
    }
}
