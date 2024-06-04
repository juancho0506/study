package com.in28minutes.spring.intro.game.step3.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    //Just an example bean (It could be any primitive or java type).
    @Bean
    public String name() {
        return "Hello World!! from Spring Context!";
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20);
    }

    //Let's create a bean with custom name
    @Bean(name = "ContactInformation")
    public Contact contact() {
        return new Contact(new Person("Juan", 30),
                new Address("Some address in a city", "Bogota - Colombia"));
    }
    //But still it is us the ones initializing the beans!
    // So we are not using spring to do the work.
}
record Person (String name, int age){}
//Now with more complex objects:
record Address (String address, String city){}
record Contact (Person person, Address address){}
