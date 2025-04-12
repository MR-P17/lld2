package com.interview.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 13/04/2025
 * Time: 00:24
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private Integer groupId;
    private String groupName;
    private List<User> users;
    private BalanceSheet balancesheet;

    public void addUser(){

    }
    public void removeUser(){

    }
}
