package com.interview.lld.meetingRoom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 21:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomController {
    private List<Room> rooms;

    public void addRoom(Room room){
        //Logic
    }
    public void removeRoom(Integer roomId){
        //Logic
    }
    public Room findAvailableRoom(Long startTime, Long endTime, Integer capacity){
        //Logic
        return null;
    }
}
