package com.interview.lld.InventoryOrderManagement;

import lombok.Data;
import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:00
 */

@Data
public class User {
    private Integer id;
    private String name;
    private Address address;
    private Cart cart;
    private List<Integer> orderIds;
}
