package com.interview.lld.SnakeLadder.strategy;

import java.util.Collections;
import java.util.List;

public class MinMovement implements MovementStrategy{
    @Override
    public int getDiceMovement(List<Integer> diceValues) {
        return Collections.min(diceValues);
    }
}
