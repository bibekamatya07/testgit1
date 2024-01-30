package com.Bibek.Practice;

abstract class Player {
    String name;
    char mark;

    abstract void makeMove();

    public boolean isValidMove(int row, int col){
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2){
            if (TicTacToeGame.board[row][col] ==' '){
                return true;
            }
        }
        return false;
    }
}
