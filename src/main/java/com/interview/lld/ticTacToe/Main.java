package com.interview.lld.ticTacToe;

/**
 * Author: Prashant K Singh
 * Date: 22/10/2024
 * Time: 01:16
 */

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("alpha-17", new PieceX());
        Player player2 = new Player("beta-23", new PieceO());
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.playGame();
    }
}
