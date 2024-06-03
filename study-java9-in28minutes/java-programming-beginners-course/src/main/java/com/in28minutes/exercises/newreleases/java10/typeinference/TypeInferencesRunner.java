package com.in28minutes.exercises.newreleases.java10.typeinference;

import java.util.List;

/**
 * Java10 new feature to infer variable types "var" type.
 * Local Variable Type Inference.
 */
public class TypeInferencesRunner {
    public static void main(String[] args) {
        //Let's define complex types:
        List<String> names1 = List.of("Ranga", "Sathish", "Ravi", "Boba", "Hans");
        List<String> names2 = List.of("Yoda", "Luke", "Neela", "Leia", "Padme");
        //Old style:
        List<List<String>> names = List.of(names1, names2);
        //But using var is simpler:
        var namesList = names;
        //It works in compile time to check for errors and read methods:
        namesList.stream().forEach(System.out::println);


    }
}
