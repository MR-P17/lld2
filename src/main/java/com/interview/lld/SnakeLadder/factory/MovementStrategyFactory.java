package com.interview.lld.SnakeLadder.factory;


import com.interview.lld.SnakeLadder.strategy.MaxMovement;
import com.interview.lld.SnakeLadder.strategy.MinMovement;
import com.interview.lld.SnakeLadder.strategy.MovementStrategy;
import com.interview.lld.SnakeLadder.strategy.SumMovement;

public class MovementStrategyFactory {
    public static MovementStrategy getMovementStrategy(String strategyName) throws Exception {
        if(strategyName.equals("SUM")){
            return new SumMovement();
        }else if(strategyName.equals("MAX")){
            return new MaxMovement();
        }else if(strategyName.equals("MIN")){
            return new MinMovement();
        }else {
            throw new Exception("Not Valid strategy Name!!");
        }
    }
}
