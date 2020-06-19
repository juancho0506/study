package com.in28minutes.exercises.oop.basic;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.2354, "GREEN");
        System.out.println(fan);
        System.out.println("Switch on the fan...");
        fan.switchOn();
        System.out.println(fan);
        System.out.println("Increasing speed...");
        fan.setSpeed((byte) 3);
        System.out.println(fan);
        System.out.println("Switching off the fan...");
        fan.switchOff();
        System.out.println(fan);
    }
}
