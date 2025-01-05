package com.interview.lld.InventoryOrderManagement;

import lombok.Data;
import java.sql.Date;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 00:20
 */

@Data
public class Product {
    private Integer id;
    private Date expiryDate;
    private String description;
}
