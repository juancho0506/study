package com.in28minutes.spring.learn.game.step3.spring.wiring.gaming.games;

import com.in28minutes.spring.learn.game.step3.spring.wiring.gaming.console.GamingConsole;

/**
 * Represents a game type called Super Contra Game.
 * This class implements an
 * interface or blueprint for future games.
 */
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Look up");
    }
    public void down(){
        System.out.println("Lay down");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Walk");
    }
}
