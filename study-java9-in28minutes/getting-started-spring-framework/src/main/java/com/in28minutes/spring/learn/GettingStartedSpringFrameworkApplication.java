package com.in28minutes.spring.learn;

import com.in28minutes.spring.learn.context.game.step2.AppGamingBasicJava;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GettingStartedSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(GettingStartedSpringFrameworkApplication.class, args);
		AppGamingBasicJava.main(args);
	}

}
