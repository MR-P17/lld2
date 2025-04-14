package com.interview.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 13/04/2025
 * Time: 00:19
 */

@Data
public class ExactSplit extends Split{
    public ExactSplit(User user, Double amount){
        super(user, amount);
    }
}
