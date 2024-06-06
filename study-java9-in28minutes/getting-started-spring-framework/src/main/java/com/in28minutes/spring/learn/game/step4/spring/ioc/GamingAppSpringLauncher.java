package com.in28minutes.spring.learn.game.step4.spring.ioc;

import com.in28minutes.spring.learn.game.step4.spring.ioc.gaming.GameRunner;
import com.in28minutes.spring.learn.game.step4.spring.ioc.gaming.console.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Step4: Using now Spring Framework to create our Beans.
 * App gamer runner for multiple games and execute them.
 * First approach using Spring and the auto-wiring feature with IoC.
 * Steps:
 * - First move the configuration class to this main class and delete the previous one.
 * - Now guess what? You can remove the configuration class here as well, and move the logic
 * of the Bean creation to this main class, only need to leave the @Configuration annotation.
 * - Delete the beans and start let Spring create them for you using the @Component annotation
 * on each Bean class.
 * - Add the @ComponentScan annotation to let this class find your components package.
 * - Code commented will show you the steps to get the final version of this class.
 */

//First iteration:

//Configuration moved to app main class for simplicity
/*@Configuration
class AppGamingSpringConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacManGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}*/
/*@Configuration
public class GamingAppSpringLauncher {
    public static void main(String[] args) {
        try (
                //Init the context:
                var context = new AnnotationConfigApplicationContext(GamingAppSpringLauncher.class)) {
            //Get the game and execute action.
            context.getBean(GamingConsole.class).up();
            //Now what we really want is to call the game runner:
            context.getBean(GameRunner.class).run();
        }
    }
}*/

//2nd Iteration: Give all responsibility to the Main class:
/*@Configuration
public class GamingAppSpringLauncher {
    @Bean
    public GamingConsole game(){
        return new PacManGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
    public static void main(String[] args) {
        try (
                //Init the context:
                var context = new AnnotationConfigApplicationContext(GamingAppSpringLauncher.class)) {
            //Get the game and execute action.
            context.getBean(GamingConsole.class).up();
            //Now what we really want is to call the game runner:
            context.getBean(GameRunner.class).run();
        }
    }
}*/

//3rd Iteration and final step: Let all the annotations do the work:
@Configuration
@ComponentScan("com.in28minutes.spring.learn.game.step4.spring.ioc")
public class GamingAppSpringLauncher {
    public static void main(String[] args) {
        try (
                //Init the context:
                var context = new AnnotationConfigApplicationContext(GamingAppSpringLauncher.class)) {
            //Get the game and execute action.
            context.getBean(GamingConsole.class).up();
            //Now what we really want is to call the game runner:
            context.getBean(GameRunner.class).run();
        }
    }
}