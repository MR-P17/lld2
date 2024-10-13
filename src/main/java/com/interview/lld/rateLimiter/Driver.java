package com.interview.lld.rateLimiter;

/**
 * Author: Prashant K Singh
 * Date: 13/10/2024
 * Time: 19:33
 */

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter  = new RateLimiter();
        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);

        rateLimiter.addUser(user1, 10, 5L);
        rateLimiter.addUser(user2, 5, 2L);
        rateLimiter.addUser(user3, 7, 3L);

        for(int i=0;i<30;i++){
            rateLimiter.handleRequest(user1);
            rateLimiter.handleRequest(user2);
            rateLimiter.handleRequest(user3);
            Thread.sleep(500);
        }
    }
}
