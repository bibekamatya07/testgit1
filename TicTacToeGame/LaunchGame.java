package com.Bibek.Project.TicTacToeGame;

public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

        HumanPlayer p1 = new HumanPlayer("Bibek", 'X');
        AIPlayer p2 = new AIPlayer('O');

        Player cp;
        cp = p1;

        while (true){
            System.out.println(cp.name + " turns.");
            cp.makeMove();
            TicTacToe.displayBoard();
            if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagonalWin()){
                System.out.println(cp.name + " has won.");
                break;
            } else if (TicTacToe.checkDraw()) {
                System.out.println("Game was a draw.");
                break;
            } else{
                if (cp == p1)
                    cp = p2;
                else{
                    cp = p1;
                }
            }
        }
    }
}
