package com.interview.lld.elevatorDesign;

import com.interview.lld.elevatorDesign.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 19:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElevatorCar {
    private Integer id;
    private Display display;
    private InternalButton button;
    private Status status;
    private Integer capacity;
}
