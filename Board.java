package com.connectfour;

public class Board {

    private final int ROWS = 6;
    private final int COLS = 7;
    private char[][] board;

    public Board() {
        board = new char[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = '.';
            }
        }
    }

    public void printBoard() {
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("0 1 2 3 4 5 6");
    }

    public boolean dropPiece(int column, char symbol) {

        if (column < 0 || column >= COLS) {
            return false;
        }

        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][column] == '.') {
                board[row][column] = symbol;
                return true;
            }
        }

        return false;
    }

    public char[][] getBoard() {
        return board;
    }
}