package com.in28minutes.exercises.intro.section7.oop.abstractclass;

public class Recipe1 extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials.");
        System.out.println("Get the utensils.");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup utensils.");
    }
}
