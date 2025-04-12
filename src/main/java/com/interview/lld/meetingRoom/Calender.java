package com.interview.lld.meetingRoom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 21:15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calender {
    private Map<Long, Long> timeInterval;
}
