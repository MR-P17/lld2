package com.interview.lld.parkingLot;

import com.interview.lld.parkingLot.strategy.PriceStrategy;
import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 05/12/2024
 * Time: 23:05
 */

@Data
public class ParkingSpot {
    private Integer id;
    private Boolean isEmpty;
    private Vehicle vehicle;
    private Integer price;
    private ClassificationType classificationType;
    private PriceStrategy priceStrategy;
}
