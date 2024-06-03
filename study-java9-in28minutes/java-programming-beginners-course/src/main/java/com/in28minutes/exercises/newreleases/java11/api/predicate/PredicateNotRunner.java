package com.in28minutes.exercises.newreleases.java11.api.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

    public static void main(String[] args) {
        List<Integer>  numbers = List.of(3, 4, 5, 67, 89, 88, 77, 102);
        System.out.println("Let's filter this list with even or odd numbers:");
        System.out.println(numbers);
        //Let's create a predicate for even numbers:
        Predicate<Integer> evenNumberPredicate = number->number%2==0;
        System.out.println("Using even numbers Predicate:");
        numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
        //But what happens if I need to negate this predicate or filter the opposite?
        //One way is to define another predicate (Not recommended)
        Predicate<Integer> oddNumberPredicate = number->number%2!=0;
        System.out.println("Using odd numbers Predicate:");
        numbers.stream().filter(oddNumberPredicate).forEach(System.out::println);
        //But predicate has a better method itself: negate()
        System.out.println("Using even numbers predicate with negate():");
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
        //Now also we can define a method reference for this. First define a method to filter even numbers.
        System.out.println("Using reference function for even numbers:");
        numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
        //If you want to negate this? then Predicate also has another method not();
        System.out.println("Using not() Predicate to negate the even reference function:");
        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
    }

    private static boolean isEven(Integer number) {
        return number%2==0;
    }
}
