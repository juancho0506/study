package com.in28minutes.spring.intro.game.step2.gaming;

import com.in28minutes.spring.intro.game.step2.gaming.console.GamingConsole;
import com.in28minutes.spring.intro.game.step2.gaming.games.MarioGame;

/**
 * Tighten coupled Java Code for a Gaming simulator class
 */
public class GameRunner {
    //This represents tightly coupled with an external class.
    GamingConsole game;
    public GameRunner(GamingConsole game) {
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
