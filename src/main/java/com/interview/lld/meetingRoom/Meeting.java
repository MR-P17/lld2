package com.interview.lld.meetingRoom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 21:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meeting {
    private Integer meetingId;
    private Long startTime;
    private Long endTime;
    private Integer capacity;
    private User bookedBy;
    private List<User> userInvited;
    private Room room;
}
