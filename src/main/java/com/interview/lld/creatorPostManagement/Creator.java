package com.interview.lld.creatorPostManagement;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 23:25
 */
@Data
public class Creator {
    private Integer creatorId;
    private String creatorName;
    private String emailId;
    private List<Integer> postIds = new ArrayList<>();
}
