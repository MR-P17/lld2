package com.interview.lld.ticTacToe;

import lombok.Getter;

/**
 * Author: Prashant K Singh
 * Date: 22/10/2024
 * Time: 00:04
 */

@Getter
public class Player {
    private final String playerId;
    private final PlayingPiece playingPiece;

    public Player(String playerId, PlayingPiece playingPiece){
        this.playerId = playerId;
        this.playingPiece = playingPiece;
    }
}
