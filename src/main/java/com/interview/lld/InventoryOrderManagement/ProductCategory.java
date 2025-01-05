package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 13:49
 */

@Data
public class ProductCategory {
    private Integer id;
    private String name;
    private List<Product> products;
    private Double price;

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }
}
