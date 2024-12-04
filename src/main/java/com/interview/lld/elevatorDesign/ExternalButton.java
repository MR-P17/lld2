package com.interview.lld.elevatorDesign;

import com.interview.lld.elevatorDesign.dispatchers.ExternalButtonDispatcher;
import com.interview.lld.elevatorDesign.enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 19:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalButton {
    private ExternalButtonDispatcher dispatcher;


    public void acceptRequest(Direction direction, Integer currentFloor){
        ElevatorController elevatorController = dispatcher.fetchNearestElevatorDirectionWise(direction);
        dispatcher.acceptRequestWithId(elevatorController.getElevator().getId(), direction, currentFloor);

    }
}
