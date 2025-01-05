package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:18
 */

@Data
public class Order {
    private Integer id;
    private User user;
    private Warehouse warehouse;
    private Map<Integer, Integer> categoryIdToCountMap;
    private Invoice invoice;
    private Payment payment;
    private OrderStatus orderStatus;
}
