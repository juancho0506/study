package com.in28minutes.exercises.intro.section7.funtional.programing.behindscenes;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}

class EvenNumberForEachConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer element) {
        System.out.println("element - " + element);
    }
}

class EvenNumberMapperFunction implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}

public class LambdaBehindScreensRunner {
    public static void main(String[] args) {
        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(n -> n%2 == 0)
                .map(e -> e * e)
                .forEach(System.out::println);
        //Behind the screens :
        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(new EvenNumberPredicate())
                .map(e -> e * e)
                .forEach(new EvenNumberForEachConsumer());
    }

    private static void printWithoutFP(List<String> list){
        for (String element:list){
            System.out.println("element - " + element);
        }
    }

    private static void printWithFP(List<String> list){
        list.stream().forEach(element -> System.out.println("element - " + element));
    }

    private static void printWithFPWithFiltering(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("at")) //Functional Interface..
                .forEach(element -> System.out.println("element - " + element));
    }
}
