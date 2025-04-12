package com.interview.lld.SnakeLadder.strategy;

import java.util.Collections;
import java.util.List;

public class MaxMovement implements MovementStrategy{
    @Override
    public int getDiceMovement(List<Integer> diceValues) {
        return Collections.max(diceValues);
    }
}
