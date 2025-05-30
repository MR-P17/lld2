package com.interview.lld.upiTransaction;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Data
public class TransactionRepository {
    private List<UpiTransaction> transactions = Collections.synchronizedList(new ArrayList<>());

    public void save(UpiTransaction transaction){

    }
    public List<UpiTransaction> findByUser(String upiId){
        return transactions.stream()
                .filter(t ->t.getSenderUpiId().equals(upiId) || t.getReceiverUpiId().equals(upiId))
                .collect(Collectors.toList());
    }
}
