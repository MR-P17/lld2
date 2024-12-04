package com.interview.lld.elevatorDesign;

import com.interview.lld.elevatorDesign.enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 19:36
 */
@Data
@AllArgsConstructor
public class ElevatorController {
    private ElevatorCar elevator;
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private Set<Integer> queuedFloors;


    ElevatorController(){
        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        this.queuedFloors = new HashSet<>();
    }

    public void move(Direction direction, Integer floor){

    }
}
