package com.in28minutes.spring.learn.intro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Primary //Added to avoid conflicts with other beans.
    public Contact contact() {
        return new Contact(new Person("Juan", 30),
                new Address("Some address in a city", "Bogota - Colombia"));
    }
    //What happens if I have another bean with same type?
    @Bean
    public Contact contact2nd(){
        return new Contact(new Person("Felipe", 27),
                new Address("Some address in a city", "Cali - Colombia"));
    }
    //The code above will generate an exception for having multiple beans that matches.
    //That is why you have to do 2 options:
    // - Add the @Primary annotation to one of the beans, so compiler knows which one is by default.
    // - Use the @Qualifier annotation to change the bean name in the context.
    @Bean
    @Qualifier("PersonFelipe")
    public Person personFelipe() {
        return new Person("Felipe", 27);
    }
    @Bean
    public Address addres() {
        return new Address("Some address in a city", "Cali - Colombia");
    }
    //Not let's create a Bean with initialization params of other beans.
    @Bean
    @Qualifier("Contact3nd")
    public Contact contact3nd(@Qualifier("PersonFelipe") Person person, Address address){
        return new Contact(person, address);
    }
    //But still it is us the ones initializing the beans!
    // So we are not using spring to do the work.

}

record Person (String name, int age){}
//Now with more complex objects:
record Address (String address, String city){}
record Contact (Person person, Address address){}
