package com.interview.lld.chainOfResponsibility;

public abstract class Operation {
    private Operation next;

    public Operation(Operation next) {
        this.next = next;
    }

    public Operation getNext() {
        return next;
    }

    abstract void operate();
}
