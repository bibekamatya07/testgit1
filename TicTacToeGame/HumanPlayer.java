package com.Bibek.Project.TicTacToeGame;

import java.util.Scanner;

public class HumanPlayer  extends Player{
    private static Scanner scan = new Scanner(System.in);

    public HumanPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }

    // Make a move
    @Override
    public void makeMove(){
        int row;
        int col;

        do{
            System.out.println("Enter row and col: ");
            row = scan.nextInt();
            col = scan.nextInt();
        }while (!isValidMove(row, col));
        TicTacToe.placeMarker(row, col, this.mark);
    }
    public String getName() {
        return name;
    }

    public char getMark() {
        return mark;
    }
}
