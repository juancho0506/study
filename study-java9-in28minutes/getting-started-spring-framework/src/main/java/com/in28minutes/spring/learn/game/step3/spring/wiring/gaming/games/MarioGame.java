package com.in28minutes.spring.learn.game.step3.spring.wiring.gaming.games;

import com.in28minutes.spring.learn.game.step3.spring.wiring.gaming.console.GamingConsole;

/**
 * Represents a game type called Mario Game.
 * This class implements an
 * interface or blueprint for future games.
 */
public class MarioGame  implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into a hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
