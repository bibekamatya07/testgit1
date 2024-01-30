package com.Bibek.Practice;

import com.Bibek.Project.TicTacToeGame.TicTacToe;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }
    @Override
    void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;

        do {
            System.out.print("Enter row and column: ");
            row = scan.nextInt();
            col = scan.nextInt();
        }while (!isValidMove(row, col));

        TicTacToeGame.placeMarker(row, col, this.mark);
        TicTacToeGame.displayBoard();

    }
}
