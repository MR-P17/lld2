package com.interview.lld.ticTacToe;

import lombok.Getter;

/**
 * Author: Prashant K Singh
 * Date: 22/10/2024
 * Time: 00:06
 */

@Getter
public class Board {
    private final Integer size;
    private final PlayingPiece [][] board;

    public Board(Integer size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(Integer row, Integer col, PlayingPiece playingPiece){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] == null) System.out.print(" ");
                else System.out.print(board[i][j].getPieceType().name());
                if(j != size-1) System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public int getFreeCells(){
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] == null) count++;
            }
        }
        return count;
    }

    public boolean checkIfWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diaMatch = true;
        boolean RDiaMatch = true;

        for(int i=0; i< size; i++){
            if(board[row][i] == null || board[row][i].getPieceType() != pieceType){
                rowMatch = false;
            }
        }

        for(int i=0; i< size; i++){
            if(board[i][col] == null || board[i][col].getPieceType() != pieceType){
                colMatch = false;
            }
        }

        for(int i=0, j=0; i<size; i++, j++){
            if(board[i][j] == null || board[i][j].getPieceType() != pieceType){
                diaMatch = false;
            }
        }
        for(int i=0, j=size-1; i<size; i++, j--){
            if(board[i][j] == null || board[i][j].getPieceType() != pieceType){
                RDiaMatch = false;
            }
        }

        return rowMatch || colMatch || diaMatch || RDiaMatch;
    }

    public boolean isValid(int row, int col){
        return row >= 0 && row < size && col >=0 && col < size;
    }
}
