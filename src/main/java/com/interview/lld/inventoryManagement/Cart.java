package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:35
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Map<Integer, Integer> categoryIdToCountMap = new HashMap<>();

    public void addItemToCart(Integer productCategoryId){
        categoryIdToCountMap.put(productCategoryId, 1 + (categoryIdToCountMap.getOrDefault(productCategoryId, 0)));
    }
    public void removeItemFromCart(Integer productCategoryId){
        if(categoryIdToCountMap.containsKey(productCategoryId)){
            if(categoryIdToCountMap.get(productCategoryId) > 0){
                categoryIdToCountMap.put(productCategoryId, categoryIdToCountMap.get(productCategoryId) -1);
            }else{
                categoryIdToCountMap.remove(productCategoryId);
            }
        }
    }
    public Map<Integer, Integer> viewCart(){
        return categoryIdToCountMap;
    }
    public void emptyCart(){
        categoryIdToCountMap.clear();
    }
}
