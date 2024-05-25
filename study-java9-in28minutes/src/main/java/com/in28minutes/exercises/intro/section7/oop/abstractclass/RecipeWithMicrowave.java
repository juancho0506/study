package com.in28minutes.exercises.intro.section7.oop.abstractclass;

public class RecipeWithMicrowave extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials.");
        System.out.println("Switch on Microwave.");
    }

    @Override
    void doTheDish() {
        System.out.println("Get stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("Turn off the Microwave.");
    }
}
