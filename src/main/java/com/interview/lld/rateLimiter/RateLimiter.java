package com.interview.lld.rateLimiter;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 13/10/2024
 * Time: 19:25
 */
@Getter
public class RateLimiter {
    private final List<User> users;
    private final Map<Integer, TokenBucket> userBucketMap;
    public RateLimiter(){
        this.users = new ArrayList<>();
        this.userBucketMap = new HashMap<>();
    }

    public void addUser(User user, Integer capacity, Long refillRate){
        users.add(user);
        userBucketMap.put(user.getUserId(), new TokenBucket(capacity, refillRate));
    }

    public boolean isAllowed(Integer userId){
        TokenBucket tokenBucket = userBucketMap.get(userId);
        if(tokenBucket != null){
            return tokenBucket.consumeToken();
        }
        return false;
    }

    public void handleRequest(User user){
        if(isAllowed(user.getUserId())){
            System.out.println("Request from user of Id " + user.getUserId() + " is allowed.");
        }else {
            System.out.println("Request from user of Id " + user.getUserId() + " is denied due to rate limit.");
        }
    }
}
