package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {
    private Integer warehouseId;
    private Inventory inventory;
    private Address address;

    public void addItemToInventory(Integer categoryId, Product product){
        //Logic
    }
    public void removeItemFromInventory(Integer categoryId, Product product){
        //Logic
    }
}
