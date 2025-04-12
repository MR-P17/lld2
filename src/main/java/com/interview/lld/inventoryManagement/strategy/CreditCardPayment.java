package com.interview.lld.inventoryManagement.strategy;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:56
 */

public class CreditCardPayment extends Payment{
    @Override
    boolean makePayment() {
        return true;
    }
}
