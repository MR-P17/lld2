package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:20
 */
public enum OrderStatus {
    ORDERED,
    PAYMENT_PENDING,
    PAYMENT_DONE,
    TRANSIT,
    DELIVERED
}
