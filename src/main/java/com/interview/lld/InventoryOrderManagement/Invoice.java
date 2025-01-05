package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:21
 */

@Data
public class Invoice {
    private Double totalCost;
    private Double gst;
    private Double discount;
    private Double finalAmount;
}
