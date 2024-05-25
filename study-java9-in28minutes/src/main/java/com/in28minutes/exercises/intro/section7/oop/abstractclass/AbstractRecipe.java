package com.in28minutes.exercises.intro.section7.oop.abstractclass;

public abstract class AbstractRecipe {
    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();

    abstract void doTheDish();

    abstract void cleanup();
}
