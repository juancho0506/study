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

    /**
     * You are given a class LeapYearChecker with a method isLeapYear(int year).
     * Your task is to complete the implementation of the method to determine if a given year is a leap year.
     * The rules are a little tricky. Read them carefully.
     * A year is a leap year in the Gregorian calendar if:
     * It is divisible by 4 (AND)
     * It is NOT divisible by 100 (except when it is divisible by 400)
     * Not Divisible by 4 - NOT Leap Year (2041)
     * Divisible by 4 and NOT divisible by 100 - Leap Year (2048)
     * Divisible by 4 and divisible by 100 - Additional check needed
     * Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)
     * Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)
     * @param year the year to check as leap.
     * @return true if a leap year or false otherwise.
     */
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

    /**
     * Method that validates if a number is a perfect number, by iterating on
     * a loop, finding the sum of its divisors.
     * @param number The number to validate.
     * @return true if it is a perfect number, false otherwise.
     */
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

    /**
     * Method that validates if a number is a perfect number, by iterating on
     * a loop using the square root and the divisor found on the loop to reduce complexity,
     * as a result finding the sum of its divisors.
     * Time complexity: O(Sqrt(n))
     * @param number The number to validate.
     * @return true if it is a perfect number, false otherwise.
     */
    public boolean isPerfectNumberOptimized(int number) {
        if (number <= 0)
            return false;

        if (number == 1)
            return false;
        //Number 1 is divisor of all numbers.
        long divisorSum = 1;
        //Premise: If i is a divisor then number/i is also a divisor.
        for (int i=2; i*i <= number; i++) {
            if (number%i == 0) {
                // n is a perfect square
                // Ex: let's take 25 we need to add 5 only once
                // sum += i + n / i will add it twice
                if (i * i == number)
                    divisorSum += i;
                else
                    divisorSum += i + (number / i);
            }
        }
        return divisorSum==number;
    }

}
