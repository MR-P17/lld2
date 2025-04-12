package com.interview.lld.SnakeLadder;

import java.util.List;

public class Board {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private List<Integer> crocodilePositions;
    private List<Integer> minePositions;

    public Board(int size, List<Snake> snakes, List<Ladder> ladders, List<Integer> crocodilePositions, List<Integer> minePositions) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
        this.crocodilePositions = crocodilePositions;
        this.minePositions = minePositions;
    }

    public int getSize(){
        return size;
    }

    public Snake getSnakeAt(int position) {
        for (Snake snake : snakes) {
            if (snake.getHead() == position) {
                return snake;
            }
        }
        return null;
    }

    public Ladder getLadderAt(int position) {
        for (Ladder ladder : ladders) {
            if (ladder.getBottom() == position) {
                return ladder;
            }
        }
        return null;
    }
    public int movePlayer(int currentPosition, int steps, Player player, List<Player> allPlayers) {
        int newPosition = currentPosition + steps;

        if(newPosition == size){
            System.out.println(player.getName() + " rolled a " + steps + " and moved from " + currentPosition + " to " + newPosition);
            return newPosition;
        }

        if (newPosition > size) {
            System.out.println(player.getName() + " rolled a " + steps + " and moved from " + currentPosition + " to " + currentPosition);
            return currentPosition;
        }

        System.out.print(player.getName() + " rolled a " + steps + " and moved from " + currentPosition + " to " + newPosition);

        Snake snake = getSnakeAt(newPosition);
        if (snake != null) {
            System.out.print(" and bitten by snake at " + newPosition + " and moved from " + newPosition + " to " + snake.getTail());
            newPosition = snake.getTail();
        }

        Ladder ladder = getLadderAt(newPosition);
        if (ladder != null) {
            System.out.print(" and climbed the ladder at " + newPosition + " and moved from " + newPosition + " to " + ladder.getTop());
            newPosition = ladder.getTop();
        }

        for(Player current : allPlayers){
            if(current.getPosition() == newPosition){
                System.out.print(" and kicked back " + current.getName() + " back to position 1!");
                current.setPosition(1);
                break;
            }
        }

        //Handling crocodile encounter.
        if(crocodilePositions.contains(newPosition)){
            System.out.print(" and encountered crocodile at " + newPosition + " and moved from " + newPosition + " to " + Math.max(1, newPosition-5));
            newPosition = Math.max(1, newPosition-5);
        }

        //Handling mine encounter.
        if(minePositions.contains(newPosition)){
            System.out.print(" and encountered mine at " + newPosition + " and it will hold " + player.getName() + " turns for 2 times!" );
            player.setHoldCount(2);
        }

        System.out.println();
        return newPosition;
    }
}


//List of validations :
// 1 : out of bound check for snake, Ladder
// 2 : snake, ladder start, end position validadity
// 3 : there should not be snake head on ladder top.
// 4 : there should not be snake tail on ladder bottom.
