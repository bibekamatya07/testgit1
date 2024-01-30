package com.Bibek.Practice;

import com.Bibek.Project.TicTacToeGame.TicTacToe;

public class GameLauncher {
    public static void main(String[] args) {
        TicTacToeGame t = new TicTacToeGame();

        HumanPlayer p1 = new HumanPlayer("Bibek", 'X');
        AIPlayer p2 = new AIPlayer('O');

        Player cp;
        cp = p1;

        while (true){
            System.out.println(cp.name + " turn.");
            cp.makeMove();

            if (TicTacToeGame.checkColWin() || TicTacToeGame.checkRowWin() || TicTacToeGame.checkDiagonalWin()){
                System.out.println(cp.name + " has won!");
                break;
            } else if (TicTacToeGame.checkDraw()) {
                System.out.println("Game was drawn.");
                break;
            }else{
                if (cp == p1)
                    cp = p2;
                else
                    cp = p1;
            }
        }
    }
}
