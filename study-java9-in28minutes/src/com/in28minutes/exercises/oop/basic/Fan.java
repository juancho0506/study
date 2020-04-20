package com.in28minutes.exercises.oop.basic;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; //1 to 5.

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchOn() {
        isOn = true;
        setSpeed((byte) 1);
    }

    public void switchOff(){
        isOn = false;
        setSpeed((byte) 0);
    }

    public byte getSpeed() {
        return speed;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return String.format("Make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
                make, radius, color, isOn, speed);
    }
}
