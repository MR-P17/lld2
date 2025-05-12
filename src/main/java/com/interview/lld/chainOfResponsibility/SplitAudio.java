package com.interview.lld.chainOfResponsibility;

public class SplitAudio extends Operation{
    public SplitAudio(Operation next){
        super(next);
    }
    @Override
    void operate() {
        System.out.println("Split Audio Operation Done!");
        if(super.getNext() != null){
            super.getNext().operate();
        }
    }
}
