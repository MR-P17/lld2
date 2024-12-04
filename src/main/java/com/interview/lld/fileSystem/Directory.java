package com.interview.lld.fileSystem;

import com.interview.lld.elevatorDesign.enums.Direction;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 21:12
 */
@Data
public class Directory implements FileSystem{
    private String directoryName;
    private List<FileSystem> fileSystems;

    Directory(String directoryName){
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }
    @Override
    public void addFileSystem(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void removeFileSystem(FileSystem fileSystem) {
        fileSystems.remove(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Inside directory " + directoryName);
        for (FileSystem fs : fileSystems){
            fs.ls();
        }
    }
}
