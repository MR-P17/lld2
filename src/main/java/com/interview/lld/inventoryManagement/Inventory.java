package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    private List<ProductCategory> productCategories;
    private Map<Integer, Integer> categoryToCountMap;

    public void addProductCategory(ProductCategory productCategory){
        productCategories.add(productCategory);
    }
    public void removeProductCategory(){
        // logic
    }
}
