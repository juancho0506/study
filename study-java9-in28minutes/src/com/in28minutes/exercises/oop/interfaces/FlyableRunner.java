package com.in28minutes.exercises.oop.interfaces;

public class FlyableRunner {

    interface Flyable {
        void fly();
    }

    static class Bird implements Flyable{

        @Override
        public void fly() {
            System.out.println("With wings..");
        }
    }

    static class Aeroplane implements Flyable{

        @Override
        public void fly() {
            System.out.println("With fuel..");
        }
    }

    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for (Flyable flyable : flyingObjects) {
            flyable.fly();
        }
        int[] numbers = {};
    }
}
