package com.interview.lld.inventoryManagement;

import com.interview.lld.inventoryManagement.strategy.WarehouseSelectionStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:21
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseController {
    private List<Warehouse> warehouseList;
    private WarehouseSelectionStrategy warehouseSelectionStrategy;

    public void addWarehouse(){
        //Logic
    }
    public void removeWarehouse(){
        //Logic
    }
    public Warehouse selectWarehouse(){
        //Logic
        return null;
    }
}
