package com.interview.lld.upiTransaction;

import com.interview.lld.upiTransaction.enums.TransactionInitiationType;
import org.springframework.beans.factory.annotation.Autowired;

public class UpiController {
    @Autowired
    private TransactionService transactionService;

    public boolean pay(){
        return transactionService.processTransaction("","","",0D, TransactionInitiationType.UPI_ID);
    }
}
