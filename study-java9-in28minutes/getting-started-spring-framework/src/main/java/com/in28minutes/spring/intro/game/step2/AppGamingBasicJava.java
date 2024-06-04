package com.in28minutes.spring.intro.game.step2;

import com.in28minutes.spring.intro.game.step2.gaming.GameRunner;
import com.in28minutes.spring.intro.game.step2.gaming.games.MarioGame;
import com.in28minutes.spring.intro.game.step2.gaming.games.PacManGame;
import com.in28minutes.spring.intro.game.step2.gaming.games.SuperContraGame;

/**
 * Step2: Loosing coupling...
 * App gamer runner for multiple games and execute them.
 * First approach using plain Java Basic impl.
 */
public class AppGamingBasicJava {
    public static void main(String[] args) {
        //Just one game allowed?
        var marioGame = new MarioGame();
        //What about another game?
        var superContraGame = new SuperContraGame();
        //The constructor should receive any game.
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
        //Let's fix the constructor error, implementing a GameConsoleInterface.
        var gameRunner2 = new GameRunner(superContraGame);
        gameRunner2.run();
        //Great! now it works for both, what about a third game?
        var gameRunner3 = new GameRunner(new PacManGame()); //Pac Man game also has to implement GameConsole Interface.
        gameRunner3.run();

    }
}
