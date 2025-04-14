package com.interview.lld.creatorPostManagement;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 23:30
 */

@Data
@NoArgsConstructor
public class Post {
    private Integer postId;
    private String title;
    private String description;
    private Creator creator;
    private Set<Tag> tags;
    private Set<Product> products;
    private Integer likes;
    private Integer comments;
}
