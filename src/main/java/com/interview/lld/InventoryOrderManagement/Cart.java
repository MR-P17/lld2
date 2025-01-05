package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:06
 */

@Data
public class Cart {
    private Map<Integer, Integer> categoryIdToCountMap;


    public void addItemToCart(Integer categoryId){
        if(categoryIdToCountMap.containsKey(categoryId)){
            categoryIdToCountMap.put(categoryId, categoryIdToCountMap.get(categoryId) + 1);
        }else{
            categoryIdToCountMap.put(categoryId, 1);
        }
    }

    public void removeItemToCart(Integer categoryId){
        if(categoryIdToCountMap.containsKey(categoryId) ){
            if(categoryIdToCountMap.get(categoryId) > 1){
                categoryIdToCountMap.put(categoryId, categoryIdToCountMap.get(categoryId) - 1);
            }else{
                categoryIdToCountMap.remove(categoryId);
            }
        }else{
            System.out.println("No Item(s) for this category.");
        }
    }

    public void viewCart(){

    }

    public void emptyCart(){
        categoryIdToCountMap.clear();
    }
}
