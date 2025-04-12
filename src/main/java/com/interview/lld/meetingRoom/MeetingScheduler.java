package com.interview.lld.meetingRoom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 21:36
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeetingScheduler {
    private List<Meeting> meetings;
    private Queue<Meeting> meetingQueue = new LinkedList<>();
    private UserController userController;
    private RoomController roomController;

    public Room findAvailableRoom(Long startTime, Long endTime, Integer capacity){
        //Logic
        return null;
    }
    public Meeting bookMeeting(Long startTime, Long endTime, Integer capacity){
        //Logic
        return null;
    }
    public boolean cancelMeeting(Integer meetingId){
        return true;
    }
    public Meeting rescheduledMeeting(Integer meetingId, Long newStartTime, Long newEndTime){
        return null;
    }
    public void notifyParticipants(List<User> participants){
        //Logic
    }
}
