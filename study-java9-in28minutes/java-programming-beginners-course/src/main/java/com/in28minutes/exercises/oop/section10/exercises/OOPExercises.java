package com.in28minutes.exercises.oop.section10.exercises;

/**
 * Class to develop section7 exercises from Java in28minutes Udemy course.
 */
public class OOPExercises {

    public static void main(String[] args) {
        System.out.println("Run exercises using testing with Junit or Groovy please.");
    }

    /**
     * In this problem, you have to complete the implementation of a Dimension class in Java
     * that represents measurements in feet and inches.
     * Task
     * Your task is to implement the Dimension(int inches) constructor and getFeet() & getInches() methods in the Dimension class.
     * Dimension(int inches) - This constructor will take one parameter, inches (an integer),
     *      and it should convert the given inches into feet and inches.
     *      If the input inches are less than 0, set feet and inches to -1 to indicate invalid input.
     *      One foot is equal to 12 inches.
     * getFeet() - This method should return the calculated feet from the constructor.
     * getInches() - This method should return the remaining inches (less than 12) from the constructor.
     */
    public static final class Dimension {
        private final int feet;
        private final int inches;

        public Dimension(int inches) {
            //Convert the total inches into feet and inches. One foot is 12 inches.
            //Store the feet and inches in their respective instance variables.
            if (inches >=0){
                this.feet = inches/12;
                this.inches = inches%12;
            } else {
                this.feet = -1;
                this.inches = -1;
            }

        }

        public int getFeet() {
            return feet;
        }

        public int getInches() {
           return inches;
        }
    }

    /**
     * In this exercise, you're tasked to implement a class called Square in Java.
     * This class is responsible for modeling a geometric shape - a square.
     * A Square object has one private instance variable, side (of type int),
     * which denotes the length of a side of the square.
     * The Square class has a constructor that takes an integer argument. This argument should be used to initialize the side attribute.
     * Your task is to complete the implementation of the constructor and these two methods.
     */
    public static final class Square {

        private final int side;

        /**
         * Implement the Square constructor.
         * This constructor should take an integer argument and initialize
         * the side attribute with the value of this argument.
         * @param side the value of one of its sides.
         */
        public Square(int side) {
            this.side = side;
        }

        /**
         * Implement the calculateArea() method.
         * If the side attribute is less than or equal to zero, return -1.
         * Otherwise, calculate and return the area of the square using the formula: side * side.
         * @return the area of the shape.
         */
        public int calculateArea() {
            if (this.side <= 0) return -1;
            return this.side*this.side;
        }

        /**
         * Implement the calculatePerimeter() method.
         * If the side attribute is less than or equal to zero, return -1.
         * Otherwise, calculate and return the perimeter of the square using the formula: 4 * side.
         * @return the perimeter of the shape.
         */
        public int calculatePerimeter() {
            if (this.side <= 0) return -1;
            return 4*this.side;
        }

    }

    /**
     * In this exercise, you have to complete the implementation of the Point class in Java.
     * A point is an entity that has an x-coordinate and a y-coordinate in a two-dimensional space.
     * Defining a Point class to represent a point in 2-dimensional space
     * Your task is to complete the implementation of the following methods in the Point class:
     */

    public static class Point {

        // x-coordinate of the point
        private int x;

        // y-coordinate of the point
        private int y;

        // Constructor for the Point class
        public Point(int x, int y) {
            this.x = x;  // Assigning x-coordinate of the point
            this.y = y;  // Assigning y-coordinate of the point
        }

        // Method to get the x-coordinate of the point
        public int getX() {
            return x;
        }

        // Method to get the y-coordinate of the point
        public int getY() {
            return y;
        }

        /**
         * Implement the method to move the point by dx and dy in x and y direction respectively
         * This method adjusts the current position of the point in the 2-dimensional space.
         * The parameters dx and dy represent the changes in x-coordinate and y-coordinate respectively.
         * After calling this method, the new coordinates of the point should be (current x + dx, current y + dy).
         * Example: If we have a point at (3, 4) and call the move method with arguments 1 and 2,
         * the new coordinates of the point should be (3+1, 4+2) i.e., (4, 6).
         * @param dx delta x
         * @param dy delta y
         */
        public void move(int dx, int dy) {
            this.x += dx;
            this.y += dy;
        }

        /**
         * This method calculates and returns the Euclidean distance between the current point and another point other.
         * The Euclidean distance d between two points (x1, y1) and (x2, y2) is calculated as:
         * d = sqrt((x2-x1)^2 + (y2-y1)^2).
         * Example: If we have a point at (3, 4) and want to calculate the distance to another point at (6, 8),
         * the distance should be sqrt((6-3)^2 + (8-4)^2) i.e., sqrt(9+16) i.e., sqrt(25) i.e., 5.0.
         * TIP: Use the Math.sqrt function to compute the square root of a number.
         */
        public double distanceTo(Point other) {
            int diffX = other.getX() - this.x;
            int diffY = other.getY() - this.y;
            double distance =  Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
            return Math.round(distance);
            //Other way no Math pow:
            //return Math.sqrt(diffX*diffX + diffY*diffY);
        }
    }
    /**
     * The Red-Green-Blue (RGB) model is a popular way to represent colors in computer systems.
     * In this model, each color is represented as a combination of the primary colors red, green, and blue.
     * Each of these primary colors can have intensity values ranging from 0 to 255.
     * In this exercise, you are tasked with completing the RGBColor class that models a color in the RGB model.
     * The class has fields for the red, green, and blue intensities, and methods to get these values.
     * Additionally, there's an invert method that changes the color to its complementary color (the inverse color on a color wheel).
     * You need to implement the constructor, the getter methods for the red, green, and blue values, and the invert method.
     * The invert method should subtract the current intensity value of each primary color from 255 to get the inverted color.
     * RGBColor class representing a color using Red Green Blue (RGB) model.
     */
    public static class RGBColor {

        // The Red, Green, Blue color values range from 0 to 255.
        private int red;
        private int green;
        private int blue;
        //Constant
        private static final int MAX_RGB_VALUE = 255;

        // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
        public RGBColor(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        // Getter method to get the red value of the color.
        public int getRed() {
            // write your code here
            return this.red;
        }

        // Getter method to get the green value of the color.
        public int getGreen() {
            // write your code here
            return this.green;
        }

        // Getter method to get the blue value of the color.
        public int getBlue() {
            // write your code here
            return this.blue;
        }

        // Method to invert the color. The inversion is done by subtracting each color component from 255.
        public void invert() {
            // write your code here
            this.red = MAX_RGB_VALUE - this.red;
            this.green = MAX_RGB_VALUE - this.green;
            this.blue = MAX_RGB_VALUE - this.blue;
        }
    }
}
