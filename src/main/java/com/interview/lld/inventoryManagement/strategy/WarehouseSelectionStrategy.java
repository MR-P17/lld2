package com.interview.lld.inventoryManagement.strategy;

import com.interview.lld.inventoryManagement.User;
import com.interview.lld.inventoryManagement.Warehouse;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:22
 */

public interface WarehouseSelectionStrategy {
    Warehouse findSuitableWarehouse(User user);

}
