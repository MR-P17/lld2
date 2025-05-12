package com.interview.lld.chainOfResponsibility;

public class MergeAudio extends Operation{
    public MergeAudio(Operation next){
        super(next);
    }
    @Override
    void operate() {
        System.out.println("Merge Audio operation Done !");
        if(super.getNext() != null){
            super.getNext().operate();
        }
    }
}
