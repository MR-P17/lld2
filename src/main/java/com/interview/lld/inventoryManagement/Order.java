package com.interview.lld.inventoryManagement;

import com.interview.lld.inventoryManagement.enums.OrderStatus;
import com.interview.lld.inventoryManagement.strategy.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:44
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer orderId;
    private User user;
    private Invoice invoice;
    private Payment payment;
    private Address deliveryAddress;
    private Map<Integer, Integer> categoryToCountMap;
    private OrderStatus oderStatus;
}
