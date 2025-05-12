package com.interview.lld.chainOfResponsibility;

public class Driver {
    public static void main(String[] args) {
        Operation operation = new BitrateIncrease(new SplitAudio(new MergeAudio(new CodecChange(null))));
        operation.operate();
    }
}
