package com.interview.lld.parkingLot;

import com.interview.lld.parkingLot.factory.ParkingManagerFactory;
import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 01:09
 */
@Data
public class EntryGate {
    private ParkingManagerFactory parkingManagerFactory;
    private ParkingSpotManager parkingSpotManager;

    public ParkingSpot fetchSuitableParkingSpot(ParkingSpotManager parkingSpotManager){
        return null;
    }

    public Ticket createTicket(Vehicle vehicle, ParkingSpotManager parkingSpotManager){
        return null;
    }

}
