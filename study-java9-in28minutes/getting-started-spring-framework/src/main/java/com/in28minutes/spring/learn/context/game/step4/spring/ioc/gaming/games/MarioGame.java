package com.in28minutes.spring.learn.context.game.step4.spring.ioc.gaming.games;

import com.in28minutes.spring.learn.context.game.step4.spring.ioc.gaming.console.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Represents a game type called Mario Game.
 * This class implements an
 * interface or blueprint for future games.
 */
@Component
@Primary //Added to resolve the multiple implementations for Spring Bean Factory.
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
