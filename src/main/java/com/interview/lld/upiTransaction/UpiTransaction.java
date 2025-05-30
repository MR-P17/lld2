package com.interview.lld.upiTransaction;

import com.interview.lld.upiTransaction.enums.TransactionStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class UpiTransaction {
    private UUID transactionId;
    private String senderUpiId;
    private String receiverUpiId;
    private Double amount;
    private TransactionStatus transactionStatus;

    public UpiTransaction(UUID transactionId, String senderUpiId, String receiverUpiId, Double amount) {
        this.transactionId = transactionId;
        this.senderUpiId = senderUpiId;
        this.receiverUpiId = receiverUpiId;
        this.amount = amount;
    }
}
