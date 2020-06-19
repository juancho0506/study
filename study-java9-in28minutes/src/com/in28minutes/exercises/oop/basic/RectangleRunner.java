package com.in28minutes.exercises.oop.basic;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 8);
        System.out.println(rectangle);
        rectangle.setWidth(25);
        System.out.println(rectangle);
    }
}
