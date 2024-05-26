package com.in28minutes.exercises.intro.section7;

/**
 * Class to develop section7 exercises from Java in28minutes Udemy course.
 */
public class Exercises {

    public static void main(String[] args) {
        System.out.println("Run exercises using testing with Junit or Groovy please.");

    }

    /**
     * A valid triangle is the one which the sum of all it's angles is equal to 180.
     * If any angle is less or equal to zero is invalid.
     * @param angle1
     * @param angle2
     * @param angle3
     * @return
     */
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0)
            return false;
       return (angle1 + angle2 + angle3) == 180;
    }

    /**
     * You have been given a class TriangleValidator with an incomplete method isRightAngled(int side1, int side2, int side3).
     * This method should take three integer values that represent the lengths of the sides of a triangle.
     * Your task is to complete the method, so it can accurately determine if the triangle with the given sides is a right-angled triangle.
     * The method should return true if the triangle is right-angled and false otherwise.
     * In a right-angled triangle, the square of the length of the hypotenuse (the side opposite the right angle)
     * is equal to the sum of the squares of the lengths of the other two sides.
     * This is known as the Pythagorean theorem. If any side has a non-positive length, it's not considered a valid triangle.
     * @param side1
     * @param side2
     * @param side3
     * @return
     */
    public boolean isRightAngled(double side1, double side2, double side3) {
        // write your code
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            return false;
        //Check each combination of sides with pythagorean theorem.
        if (checkPythagoreanTheorem(side1, side2, side3)){
            return true;
        }
        if (checkPythagoreanTheorem(side2, side3, side1)){
            return true;
        }
        return checkPythagoreanTheorem(side1, side3, side2);
    }

    private boolean checkPythagoreanTheorem(double side1, double side2, double hypotenuse) {
        return hypotenuse*hypotenuse == (side2*side2) + (side1*side1);
    }

    public long calculateSumOfSquares(int n) {
        // write your code here
        if (n<0) return -1;
        if (n==0) return 0;

        return ((long) n *n) + calculateSumOfSquares(n-1);

    }
    public long calculateSumOfSquaresOptimized(int n) {
        // write your code here
        if (n<0) return -1;
        if (n==0) return 0;
        return (n*(n+1)*(2L*n+1))/6;

    }

    public boolean isLeapYear(int year) {
        //Check first year is valid.
        if (year <= 0) return false;
        //Create different condition scenarios.
        boolean divisibleBy4 = year%4==0;
        boolean divisibleBy100 = year%100==0;
        boolean divisibleBy400 = year%400==0;

        if (!divisibleBy4)
            return false;
        return !divisibleBy100 || divisibleBy400;
    }

    public boolean isPerfectNumber(int number) {
        if (number <= 0)
            return false;

        if (number == 1)
            return false;
        long divisorSum = 0;
        for (int i=number-1; i>0; i--) {
            if (number%i == 0) {
                divisorSum += i;
            }
        }
        return divisorSum==number;
    }
}
