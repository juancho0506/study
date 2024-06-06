package com.in28minutes.spring.learn.game.step5.finishing;

import com.in28minutes.spring.learn.game.step5.finishing.gaming.GameRunner;
import com.in28minutes.spring.learn.game.step5.finishing.gaming.console.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Finishing touches: Use Spring Framework properly with different
 * ways of Dependency Injection, and more features.
 */
@Configuration
@ComponentScan //No package specification needed if all the objects are in the same package.
public class GamingAppSpringLauncher {
    public static void main(String[] args) {
        try (
            //Init the context:
            var context = new AnnotationConfigApplicationContext(GamingAppSpringLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            //Get the game and execute action.
            context.getBean(GamingConsole.class).up();
            //Now what we really want is to call the game runner:
            context.getBean(GameRunner.class).run();
            //Checking the DI on business class:
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}

//We can add more classes even here to be managed by Spring:
@Component
class YourBusinessClass{
    //Using Field Dependency Injection:
    @Autowired
    Depedency1 depedency1;
    //For this one we will use Setter injection:
    Depedency2 depedency2;
    //For this one we will use constructor injection
    Dependency3 dependency3;

    //Now using Constructor Injection:


    public YourBusinessClass(Dependency3 dependency3) {
        System.out.println("Generating constructor injection for dependency3 : " + dependency3);
        this.dependency3 = dependency3;
    }

    public Depedency2 getDepedency2() {
        return depedency2;
    }

    @Autowired
    public void setDepedency2(Depedency2 depedency2) {
        System.out.println("Using Setter injection on Dependency2: " + depedency2);
        this.depedency2 = depedency2;
    }

    @Override
    public String toString() {
        return "YourBusinessClass{" +
                "depedency1=" + depedency1 +
                ", depedency2=" + depedency2 +
                '}';
    }
}
@Component
class Depedency1{}
@Component
class Depedency2{}
@Component
class Dependency3{}