package com.Bibek.Project.TicTacToeGame;

import java.util.Random;

public class AIPlayer extends Player{
    private static Random random = new Random();

    public AIPlayer(char mark){
        this.name = "Computer";
        this.mark = mark;
    }

    // make a move
    @Override
    public void makeMove(){
        int row;
        int col;

        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        }while (!isValidMove(row, col));
        TicTacToe.placeMarker(row, col, this.mark);
    }
}
