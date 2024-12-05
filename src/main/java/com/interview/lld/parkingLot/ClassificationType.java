package com.interview.lld.parkingLot;

import com.interview.lld.parkingLot.enums.SubType;
import com.interview.lld.parkingLot.enums.Type;
import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 06/12/2024
 * Time: 00:28
 */
@Data
public class ClassificationType {
    private Type type;
    private SubType subType;
}
