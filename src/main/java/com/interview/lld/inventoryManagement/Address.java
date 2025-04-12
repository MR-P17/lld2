package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Integer pinCode;
    private String city;
    private String state;
}
