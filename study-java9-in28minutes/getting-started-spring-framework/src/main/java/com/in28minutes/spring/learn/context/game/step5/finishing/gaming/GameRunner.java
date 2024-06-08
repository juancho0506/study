package com.in28minutes.spring.learn.context.game.step5.finishing.gaming;

import com.in28minutes.spring.learn.context.game.step5.finishing.gaming.console.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Spring Bean Code as Component for a Gaming simulator class
 */
@Component
public class GameRunner {
    //This represents tightly coupled with an external class.
    GamingConsole game;
    public GameRunner(@Qualifier("superContraGame") GamingConsole game) {
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
