package com.interview.lld.fileSystem;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 21:08
 */
@Data
public class File implements FileSystem{
    private String fileName;
    private Byte[] content;

    File(String fileName){
        this.fileName = fileName;
        this.content = new Byte[100];
    }

    @Override
    public void addFileSystem(FileSystem fileSystem) {
        System.out.println("INVALID ACTION :: You cannot add file or directory inside a file !!!");
    }

    @Override
    public void removeFileSystem(FileSystem fileSystem) {
        System.out.println("INVALID ACTION :: You cannot remove file or directory inside a file !!!");
    }

    @Override
    public void ls() {
        System.out.println("File name is " + fileName);
    }
}
