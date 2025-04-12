package com.interview.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 13/04/2025
 * Time: 00:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EqualSplit extends Split{
    public EqualSplit(User user, Double amount){
        super(user, amount);
    }
}
