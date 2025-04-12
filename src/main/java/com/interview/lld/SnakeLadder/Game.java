package com.interview.lld.SnakeLadder;

import com.interview.lld.SnakeLadder.factory.MovementStrategyFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Board board;
    private List<Player> players;
    private int numberOfDies;
    private String movementStrategy;

    public Game(Board board, List<Player> players, int numberOfDies, String movementStrategy) {
        this.board = board;
        this.players = players;
        this.numberOfDies = numberOfDies;
        this.movementStrategy = movementStrategy;
    }

    private int rollDie() {
        return new Random().nextInt(6) + 1;
    }

    private int calculateSteps(List<Integer> dieValues) throws Exception {
        return MovementStrategyFactory.getMovementStrategy(movementStrategy).getDiceMovement(dieValues);
    }
    public void playGame() throws Exception {
        int currentPlayerIndex = 0;

        while (true) {
            Player currentPlayer = players.get(currentPlayerIndex);

            if(currentPlayer.getHoldCount() > 0){
                currentPlayer.setHoldCount(currentPlayer.getHoldCount() - 1);
            }else{
                List<Integer> dieValues = new ArrayList<>();
                for (int i = 0; i < numberOfDies; i++) {
                    dieValues.add(rollDie());
                }

                int steps = calculateSteps(dieValues);

                int newPosition = board.movePlayer(currentPlayer.getPosition(), steps, currentPlayer, players);
                currentPlayer.setPosition(newPosition);

                if (newPosition == board.getSize()) {
                    System.out.println(currentPlayer.getName() + " won the game!");
                    break;
                }
            }
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }
}
