package com.interview.lld.fileSystem_revision;

import lombok.Data;
import lombok.Getter;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 14:31
 */

@Getter
public class File extends FileSystem{
    private Byte[] content;
    public File(String name, Byte[] content){
        super(name);
        this.content = content;
    }
    @Override
    public void ls() {
        System.out.println("Filename :" + this.getName() + ", fileSize : " + content.length);
    }
}
