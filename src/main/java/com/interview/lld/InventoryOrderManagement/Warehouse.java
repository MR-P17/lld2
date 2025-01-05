package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 13:56
 */

@Data
public class Warehouse {
    private Inventory inventory;
    private Address address;

    public void addItemToInventory(Integer categoryId, Product product){

    }

    public void removeItemToInventory(Integer categoryId, Product product){

    }
}
