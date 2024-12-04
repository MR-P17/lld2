package com.interview.lld.elevatorDesign;

import com.interview.lld.elevatorDesign.dispatchers.InternalButtonDispatcher;
import com.interview.lld.elevatorDesign.enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 19:29
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InternalButton {
    private Integer buttonNumber;
    private InternalButtonDispatcher dispatcher;


    public void acceptRequest(Direction direction, Integer floor){

    }
}
