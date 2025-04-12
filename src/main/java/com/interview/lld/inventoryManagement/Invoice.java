package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:50
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private Double baseAmount;
    private Double taxAmount;
    private Double totalAmount;
}
