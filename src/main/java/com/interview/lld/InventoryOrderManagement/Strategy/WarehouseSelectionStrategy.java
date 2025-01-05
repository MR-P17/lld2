package com.interview.lld.InventoryOrderManagement.Strategy;

import com.interview.lld.InventoryOrderManagement.User;
import com.interview.lld.InventoryOrderManagement.Warehouse;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:00
 */

public interface WarehouseSelectionStrategy {
    Warehouse getSuitableWarehouse(User user);
}
