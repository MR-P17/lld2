package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:57
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderController {
    private List<Order> orders;

    public Order getOrderById(Integer id){
        //Logic
        return null;
    }
    public List<Order> getOrdersByUserId(Integer userId){
        //Logic
        return new ArrayList<>();
    }
    public Order placeOrder(Integer userId){
        //Logic
        //Step1 : reduce items from inventory.
        //Step2 : Generate invoice
        //Step3 : make payment
        //Step4.1 : if payment successful -> create a order
        //Step4.2 : if payment failed -> add items back to inventory;
        return null;
    }
}
