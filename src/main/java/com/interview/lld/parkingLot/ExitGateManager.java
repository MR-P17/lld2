package com.interview.lld.parkingLot;

import lombok.Data;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 01:21
 */
@Data
public class ExitGateManager {
    List<ExitGate> exitGates;

    public ExitGate findSuitableExitGate(Vehicle vehicle){
        return null;
    }
}
