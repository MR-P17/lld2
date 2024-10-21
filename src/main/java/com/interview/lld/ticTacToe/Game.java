package com.interview.lld.ticTacToe;

import lombok.Getter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Author: Prashant K Singh
 * Date: 22/10/2024
 * Time: 00:22
 */

@Getter
public class Game {
    private final Board board;
    private final Queue<Player> players;

    public Game(){
        this.board = new Board(3);
        this.players = new LinkedList<>();
    }
    public void addPlayer(Player player){
        players.add(player);
    }

    public void playGame(){
        Scanner sc = new Scanner(System.in);
        while(true){
            Player playerTurn = players.peek();

            System.out.println("Player " + playerTurn.getPlayerId() +" turn !!");
            int freeCells = board.getFreeCells();
            if(freeCells == 0){
                System.out.println("Game Tie.");
                board.printBoard();
                return;
            }
            board.printBoard();
            System.out.println("Player Turn : " + playerTurn.getPlayerId() + ", Enter row, column for piece " + playerTurn.getPlayingPiece().getPieceType().name() + " :");
            String input = sc.nextLine();
            String [] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int col = Integer.parseInt(values[1]);

            boolean addPiece = board.addPiece(row, col, playerTurn.getPlayingPiece());
            if(!board.isValid(row, col) && !addPiece){
                System.out.println("Invalid position selected !! Try again.");
                continue;
            }
            players.remove();
            players.add(playerTurn);

            boolean isWinner = board.checkIfWinner(row, col, playerTurn.getPlayingPiece().getPieceType());
            if(isWinner){
                System.out.println("Player " + playerTurn.getPlayerId() +" won the game.");
                board.printBoard();
                return;
            }
        }
    }
}
