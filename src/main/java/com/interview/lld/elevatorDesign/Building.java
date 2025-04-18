package com.interview.lld.elevatorDesign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 19:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Building {
    private List<Floor> floors;
}
