package com.interview.lld.creatorPostManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 23:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatorManager {
    private List<Creator> creators;

    public void addCreator(Creator creator){
        creators.add(creator);
    }
    public void removeCreator(Creator creator){
        creators.remove(creator);
    }
}
