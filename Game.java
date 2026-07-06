package com.connectfour;

import java.util.Scanner;

public class Game {

    private Board board;
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public Game() {
        board = new Board();
        player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        scanner = new Scanner(System.in);
    }

    public void startGame() {

        System.out.println("Players Created Successfully!");
        System.out.println(player1.getName() + " Symbol : " + player1.getSymbol());
        System.out.println(player2.getName() + " Symbol : " + player2.getSymbol());

        Player currentPlayer = player1;

        while (true) {

            board.printBoard();

            System.out.print(currentPlayer.getName()
                    + " (" + currentPlayer.getSymbol()
                    + ") Enter Column (0-6): ");

            int column = scanner.nextInt();

            boolean success = board.dropPiece(
                    column,
                    currentPlayer.getSymbol());

            if (!success) {
                System.out.println("Invalid Move! Try Again.");
                continue;
            }

            // Winner Check
            if (WinChecker.checkWinner(
                    board.getBoard(),
                    currentPlayer.getSymbol())) {

                board.printBoard();
                System.out.println();
                System.out.println(currentPlayer.getName()
                        + " Wins the Game!");
                break;
            }

            // Change Turn
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }

        scanner.close();
    }
}