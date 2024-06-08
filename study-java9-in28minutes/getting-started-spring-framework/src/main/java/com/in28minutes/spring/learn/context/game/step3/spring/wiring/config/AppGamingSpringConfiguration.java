package com.in28minutes.spring.learn.context.game.step3.spring.wiring.config;

import com.in28minutes.spring.learn.context.game.step3.spring.wiring.gaming.GameRunner;
import com.in28minutes.spring.learn.context.game.step3.spring.wiring.gaming.console.GamingConsole;
import com.in28minutes.spring.learn.context.game.step3.spring.wiring.gaming.games.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingSpringConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacManGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
