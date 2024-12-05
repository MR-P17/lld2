package com.interview.lld.parkingLot;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 01:14
 */
@Data
public class ExitGate {
    private Ticket ticket;
    private Invoice invoice;

    public Integer calculateCost(Ticket ticket){
        return null;
    }
    public Invoice getInvoice(Ticket ticket){
        Integer cost = calculateCost(ticket);
        return null;
    }
}
