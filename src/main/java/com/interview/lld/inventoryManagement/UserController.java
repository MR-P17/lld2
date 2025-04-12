package com.interview.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/04/2025
 * Time: 17:34
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    private List<User> userList;

    public void addUser(){
        //Logic
    }
    public void removeUser(){
        //Logic
    }
}
