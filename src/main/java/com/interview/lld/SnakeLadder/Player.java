package com.interview.lld.SnakeLadder;

public class Player {
    private String name;
    private int position;
    private int holdCount; // If player lands at mine position.

    public Player(String name, int position, int holdCount) {
        this.name = name;
        this.position = position;
        this.holdCount = holdCount;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getHoldCount(){ return  holdCount;}

    public void setPosition(int position) {
        this.position = position;
    }
    public void setHoldCount(int holdCount) { this.holdCount = holdCount;}
}
