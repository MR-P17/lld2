package com.interview.lld.thread.CallableAndFuture;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "Hello Mr P";
    }
}
