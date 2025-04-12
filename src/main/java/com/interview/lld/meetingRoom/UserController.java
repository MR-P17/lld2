package com.interview.lld.meetingRoom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 21:27
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    private List<User> users;

    public void addUser(User user){
        //Logic
    }
    public void removeUser(User user){
        //Logic
    }
}
