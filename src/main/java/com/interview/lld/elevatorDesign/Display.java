package com.interview.lld.elevatorDesign;

import com.interview.lld.elevatorDesign.enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 19:26
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Display {
    private Integer currFloor;
    private Direction direction;
}
