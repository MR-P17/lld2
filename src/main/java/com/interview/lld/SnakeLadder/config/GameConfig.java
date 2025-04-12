package com.interview.lld.SnakeLadder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "game")
@Component
public class GameConfig {
    private int numberOfPlayers;
    private int boardSize;
    private int numberOfSnake;
    private int numberOfLadder;
    private int numberOfDice;
    private String movementStrategy;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public int getNumberOfSnake() {
        return numberOfSnake;
    }

    public int getNumberOfLadder() {
        return numberOfLadder;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public String getMovementStrategy() {
        return movementStrategy;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public void setNumberOfSnake(int numberOfSnake) {
        this.numberOfSnake = numberOfSnake;
    }

    public void setNumberOfLadder(int numberOfLadder) {
        this.numberOfLadder = numberOfLadder;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public void setMovementStrategy(String movementStrategy) {
        this.movementStrategy = movementStrategy;
    }
}
