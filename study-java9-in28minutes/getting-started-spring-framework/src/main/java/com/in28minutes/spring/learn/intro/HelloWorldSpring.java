package com.in28minutes.spring.learn.intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldSpring {
    public static void main(String[] args) {
        //Update: Let's use the try with resources new feature, to close the context at the end.
        try(
                //1: Launch a Spring Context
                //This creates a Spring context withing the JVM.
                var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)
        ){
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
            //Using multiple beans
            System.out.println(context.getBean("contact3nd"));
            //List all the beans managed by this context:
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
