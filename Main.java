package com.connectfour;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     CONNECT FOUR GAME");
        System.out.println("=================================");
        System.out.println("Game Started...");

        Game game = new Game();
        game.startGame();
    }
}