package com.interview.lld.meetingRoom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 21:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private Integer roomId;
    private Integer capacity;
    private Calender calender;
}
