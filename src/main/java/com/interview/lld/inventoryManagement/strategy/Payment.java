package com.interview.lld.inventoryManagement.strategy;

import com.interview.lld.inventoryManagement.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:52
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Payment {
    private PaymentMode paymentMode;
    abstract boolean makePayment();
}
