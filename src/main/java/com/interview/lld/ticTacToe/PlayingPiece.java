package com.interview.lld.ticTacToe;

import lombok.Getter;

/**
 * Author: Prashant K Singh
 * Date: 21/10/2024
 * Time: 23:58
 */

@Getter
public class PlayingPiece {
    private final PieceType pieceType;
    public PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
    }
}
