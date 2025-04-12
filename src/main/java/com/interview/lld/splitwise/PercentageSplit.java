package com.interview.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 13/04/2025
 * Time: 00:20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PercentageSplit extends Split{
    private Double percentage;
    public PercentageSplit(User user, Double percentage){
        super(user, 0D);
        this.percentage = percentage;
    }
}
