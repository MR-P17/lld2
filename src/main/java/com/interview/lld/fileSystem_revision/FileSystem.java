package com.interview.lld.fileSystem_revision;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 14:19
 */

@Data
@AllArgsConstructor
public abstract class FileSystem {
    private String name;

    public abstract void ls();
}
