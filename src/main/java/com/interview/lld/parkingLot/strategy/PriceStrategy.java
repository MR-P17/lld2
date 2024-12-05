package com.interview.lld.parkingLot.strategy;


import com.interview.lld.parkingLot.ClassificationType;

/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 00:33
 */
public interface PriceStrategy {
    Integer getPrice(ClassificationType classificationType);
}
