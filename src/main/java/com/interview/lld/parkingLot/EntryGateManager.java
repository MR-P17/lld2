package com.interview.lld.parkingLot;

import lombok.Data;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 01:19
 */
@Data
public class EntryGateManager {
    List<EntryGate> entryGates;
    List<Floor> floors;

    public EntryGate findSuitableEntryGate(Vehicle vehicle){
        return null;
    }
}
