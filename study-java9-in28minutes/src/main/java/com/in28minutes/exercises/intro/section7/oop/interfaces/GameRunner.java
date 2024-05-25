package com.in28minutes.exercises.intro.section7.oop.interfaces;

public class GameRunner {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println("Using Mario Game class");
        MarioGame game = new MarioGame();
        game.up();
        game.down();
        game.left();
        game.right();

        System.out.println("*******************************************");
        System.out.println("Using Chess Game class");
        ChessGame chessGame = new ChessGame();
        chessGame.up();
        chessGame.down();
        chessGame.left();
        chessGame.right();

        System.out.println("*******************************************");
        System.out.println("Using Interface with instance of Mario class");
        GamingConsole gamingConsole = new MarioGame();
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
