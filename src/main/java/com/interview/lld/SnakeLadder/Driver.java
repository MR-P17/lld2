package com.interview.lld.SnakeLadder;

import com.interview.lld.SnakeLadder.config.GameConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Prashant K Singh
 * Date: 11/04/2025
 * Time: 18:03
 */

public class Driver {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(Driver.class, args);
        GameConfig gameConfig = context.getBean(GameConfig.class);

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of snake : ");
        int snakeCount = sc.nextInt();

        int start, end;
        List<Snake> snakes = new ArrayList<>();
        System.out.println("Please enter all " + snakeCount + " snakes start and end position :: ");
        for(int i=0;i<snakeCount;i++){
            start = sc.nextInt();
            end = sc.nextInt();
        }

        System.out.print("Please enter number of ladder : ");
        int ladderCount = sc.nextInt();
        List<Ladder> ladders = new ArrayList<>();
        System.out.println("Please enter all " + ladderCount + " ladders start and end position :: ");
        for(int i=0;i<ladderCount;i++){
            start = sc.nextInt();
            end = sc.nextInt();
            ladders.add(new Ladder(start, end));
        }

        //Enter Zero if you don't want any crocodile.
        System.out.print("Please enter number of crocodiles : ");
        int numberOfCrocodiles = sc.nextInt();
        List<Integer> crocodilePositions = new ArrayList<>();
        int crocodilePosition;
        if(numberOfCrocodiles > 0)
            System.out.println("Please enter all " + numberOfCrocodiles + " positions in separate line ::");
        for(int i=0;i<numberOfCrocodiles;i++){
            crocodilePosition = sc.nextInt();
            crocodilePositions.add(crocodilePosition);
        }

        //Enter Zero if you don't want any mines.
        System.out.print("Please enter number of mines : ");
        int numberOfMines = sc.nextInt();
        List<Integer> minePositions = new ArrayList<>();
        int minePosition;
        if(numberOfMines > 0)
            System.out.println("Please enter all " + numberOfMines + " positions in separate line ::");
        for(int i=0;i<numberOfMines;i++){
            minePosition = sc.nextInt();
            minePositions.add(minePosition);
        }

        System.out.print("Please enter number of players : ");
        int numberOfPlayer = sc.nextInt();
        String name;
        List<Player> players = new ArrayList<>();
        System.out.println("Please enter all " + numberOfPlayer + " players name and starting point :: ");
        for(int i=0;i<numberOfPlayer;i++){
            name = sc.next();
            start = sc.nextInt();
            players.add(new Player(name, start, 0));
        }

        // Note  : BoardSize, diceCount, movementStrategy is being fetched from application.yml file
        // through GameConfig configuration
        // snake, Ladder, Player info is being capture from input

        int boardSize = gameConfig.getBoardSize() * gameConfig.getBoardSize();
        int numberOfDice = gameConfig.getNumberOfDice();
        String movementStrategy = gameConfig.getMovementStrategy();


        Board board = new Board(boardSize, snakes, ladders, crocodilePositions, minePositions);
        Game game = new Game(board, players, numberOfDice, movementStrategy);

        System.out.println("Game Starting !!");
        System.out.println("______________________________________");
        System.out.println();

        game.playGame();
    }
}
