package com.interview.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 13/04/2025
 * Time: 00:17
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Split {
    private User user;
    private Double amount;
}
