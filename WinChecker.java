package com.connectfour;

public class WinChecker {

    public static boolean checkWinner(char[][] board, char symbol) {

        // Horizontal Check
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[row][col] == symbol &&
                    board[row][col + 1] == symbol &&
                    board[row][col + 2] == symbol &&
                    board[row][col + 3] == symbol) {
                    return true;
                }
            }
        }

        // Vertical Check
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 7; col++) {
                if (board[row][col] == symbol &&
                    board[row + 1][col] == symbol &&
                    board[row + 2][col] == symbol &&
                    board[row + 3][col] == symbol) {
                    return true;
                }
            }
        }

        // Diagonal (Left to Right)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[row][col] == symbol &&
                    board[row + 1][col + 1] == symbol &&
                    board[row + 2][col + 2] == symbol &&
                    board[row + 3][col + 3] == symbol) {
                    return true;
                }
            }
        }

        // Diagonal (Right to Left)
        for (int row = 0; row < 3; row++) {
            for (int col = 3; col < 7; col++) {
                if (board[row][col] == symbol &&
                    board[row + 1][col - 1] == symbol &&
                    board[row + 2][col - 2] == symbol &&
                    board[row + 3][col - 3] == symbol) {
                    return true;
                }
            }
        }

        return false;
    }
}