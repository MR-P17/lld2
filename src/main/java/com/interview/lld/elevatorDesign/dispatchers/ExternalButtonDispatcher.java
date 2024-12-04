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
 * Time: 19:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalButtonDispatcher {
    private Map<Integer, ElevatorController> idToElevatorMap;


    public ElevatorController fetchNearestElevatorDirectionWise(Direction direction){
        //It will fetch nearest elevator to serve.
        return null;
    }

    public void acceptRequestWithId(Integer elevatorId, Direction direction, Integer floor){

    }
}
