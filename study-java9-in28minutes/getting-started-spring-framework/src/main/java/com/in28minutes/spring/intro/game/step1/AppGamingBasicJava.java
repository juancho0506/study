package com.in28minutes.spring.intro.game.step1;

/**
 * Step1: A Tighten coupled approach.
 * App gamer runner for multiple games and execute them.
 * First approach using plain Java Basic impl.
 */
public class AppGamingBasicJava {
    public static void main(String[] args) {
        //Just one game allowed?
        var marioGame = new MarioGame();
        //The constructor should receive any game.
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
