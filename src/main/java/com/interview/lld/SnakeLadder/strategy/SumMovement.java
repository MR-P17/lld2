package com.interview.lld.SnakeLadder.strategy;

import java.util.List;

public class SumMovement implements MovementStrategy{
    @Override
    public int getDiceMovement(List<Integer> diceValues) {
        int totalDiceValue = 0;
        for(Integer value : diceValues){
            totalDiceValue += value;
        }
        return totalDiceValue;
    }
}
