package com.interview.lld.chainOfResponsibility;

public class BitrateIncrease extends Operation{
    public BitrateIncrease(Operation next){
        super(next);
    }
    @Override
    void operate() {
        System.out.println("Bitrate operation done !");
        if(super.getNext() != null){
            super.getNext().operate();
        }
    }
}
