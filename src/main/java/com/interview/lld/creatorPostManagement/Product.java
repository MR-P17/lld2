package com.interview.lld.creatorPostManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 23:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer productId;
    private String name;
    private String description;
    private List<Integer> postIds;
}
