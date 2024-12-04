package com.interview.lld.elevatorDesign.dispatchers;

import com.interview.lld.elevatorDesign.ElevatorController;
import com.interview.lld.elevatorDesign.enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 19:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InternalButtonDispatcher {
    private Map<Integer, ElevatorController> idToElevatorMap;


    public void acceptRequestWithId(Integer elevatorId, Direction direction, Integer floor){

    }
}
