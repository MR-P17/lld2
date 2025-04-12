package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:00
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {
    private Integer categoryId;
    private String categoryName;
    private List<Product> products;
    private Double price;

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public Product getById(Integer productId){
        return products.stream().filter(e -> e.getId().equals(productId)).findFirst().orElse(null);

    }
}
