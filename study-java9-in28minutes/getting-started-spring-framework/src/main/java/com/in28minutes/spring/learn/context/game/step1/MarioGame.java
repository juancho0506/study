package com.in28minutes.spring.learn.context.game.step1;

/**
 * Represents a game type called Mario Game.
 * This class should represent a game implementing an
 * interface or blueprint for future games.
 */
public class MarioGame {
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
