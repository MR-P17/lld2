package com.interview.lld.fileSystem;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 21:06
 */

public interface FileSystem {
    void addFileSystem(FileSystem fileSystem);
    void removeFileSystem(FileSystem fileSystem);
    void ls();
}
