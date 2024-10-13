package com.interview.lld.rateLimiter;

/**
 * Author: Prashant K Singh
 * Date: 13/10/2024
 * Time: 18:56
 */

public class TokenBucket {
    private final Integer capacity;
    private Integer tokens;
    private final Long refillRate;
    private Long lastRefillTime;


    public TokenBucket(Integer capacity, Long refillRate){
        this.capacity = capacity;
        this.tokens = capacity;
        this.refillRate = refillRate;
        this.lastRefillTime = System.nanoTime();
    }

    private void refill(){
        Long now = System.nanoTime();
        long elapsedTime = now - lastRefillTime;
        Integer extraToken = (int) (elapsedTime/1000000000L * refillRate);
        tokens = Math.min(capacity, tokens + extraToken);
        lastRefillTime = System.nanoTime();
    }

    public synchronized boolean consumeToken(){
        refill();
        if(tokens > 0){
            tokens --;
            return true;
        }
        return false;
    }
}
