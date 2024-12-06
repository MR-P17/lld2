package com.interview.lld.undoRedo;

/**
 * Author: Prashant K Singh
 * Date: 07/12/2024
 * Time: 00:43
 */

public class Driver {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.onClickAddText("Hello Mr Stark! ");
        invoker.onClickAddText("How are you? ");
        invoker.onClickAddText("3000");

        System.out.println(invoker.getContent());

        invoker.undo();

        System.out.println(invoker.getContent());

        invoker.redo();

        System.out.println(invoker.getContent());

        invoker.undo();
        invoker.undo();

        System.out.println(invoker.getContent());

        invoker.redo();

        System.out.println(invoker.getContent());
    }
}
