package com.in28minutes.spring.learn.game.step3.spring.wiring;

import com.in28minutes.spring.learn.game.step3.spring.wiring.config.AppGamingSpringConfiguration;
import com.in28minutes.spring.learn.game.step3.spring.wiring.gaming.GameRunner;
import com.in28minutes.spring.learn.game.step3.spring.wiring.gaming.console.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Step3: Loosing coupling using now Spring Framework.
 * App gamer runner for multiple games and execute them.
 * First approach using Spring and the auto-wiring feature.
 */
public class AppGamingSpringContext {
    public static void main(String[] args) {
        try (
                //Init the context:
                var context = new AnnotationConfigApplicationContext(AppGamingSpringConfiguration.class)) {
            //Get the game and execute action.
            context.getBean(GamingConsole.class).up();
            //Now what we really want is to call the game runner:
            context.getBean(GameRunner.class).run();
        }
    }
}
