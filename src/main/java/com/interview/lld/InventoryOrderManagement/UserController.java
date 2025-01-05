package com.interview.lld.InventoryOrderManagement;

import lombok.Data;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 05/01/2025
 * Time: 14:15
 */
@Data
public class UserController {
    private List<User> users;

    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
}
