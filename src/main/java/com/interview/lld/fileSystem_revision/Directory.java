package com.interview.lld.fileSystem_revision;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 14:34
 */
@Getter
public class Directory extends FileSystem{
    private List<FileSystem> directoryItems = new ArrayList<>();
    public Directory(String name){
        super(name);
    }

    public void addToDirectory(FileSystem fileSystem){
        directoryItems.add(fileSystem);
    }

    public void removeFromDirectory(FileSystem fileSystem){
        directoryItems.remove(fileSystem);
    }


    @Override
    public void ls() {
        System.out.println("Iterating Directory " + getName() + " ----");
        for (FileSystem fileSystem : directoryItems){
            fileSystem.ls();
        }
        System.out.println("-----------------------------------------");
    }
}
