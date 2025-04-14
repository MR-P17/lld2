package com.interview.lld.creatorPostManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 23:46
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private CreatorManager creatorManager = new CreatorManager();
    private PostManager postManager = new PostManager();
    private ProductManager productManager = new ProductManager();
    private List<Tag> tags = new ArrayList<>();

    public List<Tag> findTrendingTag(){
        //Logic
        return new ArrayList<>();
    }
    public List<Post> findPostsByTag(String tagName){
        //Logic
        return new ArrayList<>();
    }
    public List<Post> findPostsByCreatorId(Integer creatorId){
        //Logic
        return new ArrayList<>();
    }
    public List<Product> findPopularProducts(){
        //Logic
        return new ArrayList<>();
    }
}
