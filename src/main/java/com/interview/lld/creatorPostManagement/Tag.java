package com.interview.lld.creatorPostManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 23:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
    private Integer tagId;
    private String name;
    private Integer usageCount;
    private Instant lastUsedAt;
}
