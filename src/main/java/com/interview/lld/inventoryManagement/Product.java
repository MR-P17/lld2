package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 16:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private Date expiryDate;
    private String description;
}
