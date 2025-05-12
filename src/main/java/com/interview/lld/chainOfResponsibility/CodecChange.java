package com.interview.lld.chainOfResponsibility;

public class CodecChange extends  Operation{
    public CodecChange(Operation next){
        super(next);
    }
    @Override
    void operate() {
        System.out.println("Codec Change Operation Done !");
        if(super.getNext() != null){
            super.getNext().operate();
        }
    }
}
