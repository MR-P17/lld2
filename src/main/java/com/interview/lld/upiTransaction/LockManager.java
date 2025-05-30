package com.interview.lld.upiTransaction;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;

@Data
public class LockManager {
    private Map<String, Lock> locks = new ConcurrentHashMap<>();

    public void lock(String senderUpiId, String receiverUpiId){

    }
    public void unlock(String senderUpiId, String receiverUpiId){

    }
}
