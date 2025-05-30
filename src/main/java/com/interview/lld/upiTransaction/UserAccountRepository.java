package com.interview.lld.upiTransaction;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class UserAccountRepository {
    private Map<String, UserAccount> upiMap = new ConcurrentHashMap<>();
    private Map<String, String> mobileNoToUpiMap= new ConcurrentHashMap<>();

    public void addUserAccount(UserAccount account){
        upiMap.put(account.getUpiId(), account);
        mobileNoToUpiMap.put(account.getMobileNo(), account.getUpiId());
    }

    public UserAccount findByUpiId(String upiId){
        return null;
    }

    public UserAccount findByMobileNo(String mobileNo){
        return null;
    }
}
