package com.interview.lld.rateLimiter;

import lombok.Data;
import lombok.Getter;

/**
 * Author: Prashant K Singh
 * Date: 13/10/2024
 * Time: 19:21
 */
@Getter
@Data
public class User {
    private final Integer userId;

    public User(Integer userId){
        this.userId = userId;
    }
}
