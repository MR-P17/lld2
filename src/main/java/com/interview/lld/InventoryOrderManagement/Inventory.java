package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 13:53
 */

@Data
public class Inventory {
    private List<ProductCategory> productCategoryList;

    public void addProductCategory(ProductCategory category){
        productCategoryList.add(category);
    }

    public void removeProductCategory(ProductCategory category){
        productCategoryList.remove(category);
    }
}
