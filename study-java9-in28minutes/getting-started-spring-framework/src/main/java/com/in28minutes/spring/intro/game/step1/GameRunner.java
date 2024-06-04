package com.in28minutes.spring.intro.game.step1;

/**
 * Tighten coupled Java Code for a Gaming simulator class
 */
public class GameRunner {
    //This represents tightly coupled with an external class.
    MarioGame game;
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        //Change this to logger pattern.
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
