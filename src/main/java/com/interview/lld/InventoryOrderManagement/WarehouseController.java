package com.interview.lld.InventoryOrderManagement;

import com.interview.lld.InventoryOrderManagement.Strategy.WarehouseSelectionStrategy;
import lombok.Data;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:03
 */
@Data
public class WarehouseController {
    private List<Warehouse> warehouseList;
    private WarehouseSelectionStrategy warehouseSelectionStrategy;


    public void addWarehouse(Warehouse warehouse){
        warehouseList.add(warehouse);
    }

    public void removeWarehouse(Warehouse warehouse){
        warehouseList.remove(warehouse);
    }
}
