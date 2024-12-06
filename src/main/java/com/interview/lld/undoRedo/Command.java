package com.interview.lld.undoRedo;

/**
 * Author: Prashant K Singh
 * Date: 07/12/2024
 * Time: 00:29
 */

public interface Command {
    void execute();
    void undo();
}
