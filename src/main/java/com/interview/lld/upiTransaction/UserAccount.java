package com.interview.lld.upiTransaction;

import lombok.Data;

import java.util.UUID;

@Data
public class UserAccount {
    private UUID userId;
    private String username;
    private String mobileNo;
    private String upiId;
    private Double amount;
    private String password;
}
