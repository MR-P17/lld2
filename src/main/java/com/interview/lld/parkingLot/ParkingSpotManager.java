package com.interview.lld.parkingLot;


/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 00:53
 */

public interface ParkingSpotManager {
    void addParkingSpot(ParkingSpot spot);
    void removeParkingSpot(ParkingSpot spot);
    void updateParkingSpot(ParkingSpot spot, Vehicle vehicle, Boolean isEmpty);
}
