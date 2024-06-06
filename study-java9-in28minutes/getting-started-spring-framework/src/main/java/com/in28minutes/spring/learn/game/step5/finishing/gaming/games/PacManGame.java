package com.in28minutes.spring.learn.game.step5.finishing.gaming.games;

import com.in28minutes.spring.learn.game.step5.finishing.gaming.console.GamingConsole;
import org.springframework.stereotype.Component;

/**
 * Represents a game type called Mario Game.
 * This class implements an
 * interface or blueprint for future games.
 */
@Component
public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("Go Up");
    }
    public void down(){
        System.out.println("Go Down");
    }
    public void left(){
        System.out.println("Go left");
    }
    public void right(){
        System.out.println("Go Right");
    }
}
