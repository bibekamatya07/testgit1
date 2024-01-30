package com.Bibek.Practice;

import java.util.Random;

public class AIPlayer extends Player{
    static Random random = new Random();

    public AIPlayer(char mark){
        this.name = "Computer";
        this.mark = mark;
    }

    @Override
    void makeMove() {
       int row;
       int col;

       do {
           row = random.nextInt(3);
           col = random.nextInt(3);
       }while (!isValidMove(row, col));

       TicTacToeGame.placeMarker(row, col, this.mark);
       TicTacToeGame.displayBoard();
    }
}
