package com.interview.lld.creatorPostManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 23:35
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostManager {
    private List<Post> posts;

    public void addPost(Post post){
        posts.add(post);
    }
    public void removePost(Post post){
        posts.remove(post);
    }
}
