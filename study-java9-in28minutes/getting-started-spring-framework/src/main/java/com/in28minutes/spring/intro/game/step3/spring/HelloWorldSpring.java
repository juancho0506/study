package com.in28minutes.spring.intro.game.step3.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        //This creates a Spring context withing the JVM.
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2 Configure the things that we want Spring to manage. @Configuration
        //Created a HelloWorldConfiguration class for this.
        //name - @Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        //Another Bean, this time is a class
        System.out.println(context.getBean("person"));
        //A complex bean
        System.out.println(context.getBean("ContactInformation"));
        //Calling it with the class name in context:
        System.out.println(context.getBean(Contact.class));
    }
}
