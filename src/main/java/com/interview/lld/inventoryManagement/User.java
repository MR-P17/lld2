package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:32
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private Address address;
    private Cart cart;
    private List<Integer> orderIds;
}
