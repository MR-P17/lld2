package com.interview.lld.parkingLot;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 01:12
 */
@Data
public class Ticket {
    private Long entryTime;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
}
