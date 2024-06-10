package com.in28minutes.exercises.loops;

/**
 * In this problem, you are tasked with completing the implementation of a NumberUtils class
 * in Java that retrieves the last digit of a given integer.
 * The last digit of an integer n is the rightmost digit of the integer.
 * For instance, the last digit of 2345 is 5, and the last digit of 90 is 0.
 * If the input number is 0, return 0 as the last digit of 0 is 0.
 * If the input number is negative, return -1 as the last digit of negative numbers will not be considered in this problem.
 * Examples:
 * System.out.println(utils.getLastDigit(1234));   // Output: 4
 * System.out.println(utils.getLastDigit(90));     // Output: 0
 * System.out.println(utils.getLastDigit(9));      // Output: 9
 * System.out.println(utils.getLastDigit(0));      // Output: 0
 * System.out.println(utils.getLastDigit(-67));    // Output: -1
 */
public class NumberUtils {
    /**
     * This method will take one parameter, number (an integer),
     * and it should retrieve the last digit of this number.
     * If the input number is negative, it should return -1.
     *
     * @param number number to analyse and extract last digit
     * @return the rightest last number of the original.
     */
    public int getLastDigitUsingString(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            return -1;
        }
        String stringNumber = String.valueOf(number);
        return Integer.parseInt(stringNumber.substring(stringNumber.length() - 1));
    }
    /**
     * This method will take one parameter, number (an integer),
     * and it should retrieve the last digit of this number.
     * If the input number is negative, it should return -1.
     *
     * @param number number to analyse and extract last digit
     * @return the rightest last number of the original.
     */
    public int getLastDigitUsingMod(int number) {
        if (number < 0) {
            return -1;
        }
        return number%10;
    }
    /**
     * This method calculates and returns the number of digits in a given integer.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
     * @param number: an integer
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
    public int getNumberOfDigits(int number) {
        //Edge cases
        if(number < 0){
            return -1;
        }
        //Using loop division by 10
        //Division(/): Division in programming is similar to normal mathematical division.
        // If you divide an integer by 10, it will remove the last digit of the number.
        //For example,
        //12345 / 10 = 1234
        //90 / 10 = 9
        int numDigits = 0;
        do {
            number = number/10;
            numDigits++;
        } while (number !=0);
        return numDigits;
        //Using String class is also possible:
        //String stringNumber = String.valueOf(number);
        //return stringNumber.length();
    }

    /**
     * This method takes one parameter, number (an integer),
     * and it should return the sum of its digits.
     * If the input number is negative, it should return -1.
     * If the input number is 0, it should return 0.
     * @param number
     * @return
     */
    public int getSumOfDigits(int number) {
        //Edge cases
        if(number < 0){
            return -1;
        }
        //Using loop division by 10
        int sumDigits = 0;
        do {
            int digit = number%10;
            number = number/10;
            sumDigits += digit;
        } while (number !=0);
        return sumDigits;
    }
    /**
     * This method takes an integer as input and returns the reversed version of the number.
     * For instance, if the input is 123, the method should return 321.
     * The method handles two edge cases:
     * If the input number is zero, the method returns 0 since the reverse of 0 is 0.
     * If the input number is negative, the method returns -1 since the reverse of a negative number is undefined.
     * @param number: an integer
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
    public int reverseNumber(int number) {
        //Edge cases
        if(number < 0){
            return -1;
        }
        StringBuilder reverseNumber = new StringBuilder();
        do {
            String digit = String.valueOf(number % 10);
            number = number /10;
            reverseNumber.append(digit);
        } while (number !=0);
        return Integer.parseInt(reverseNumber.toString());
        //No String solution:
        // Multiply the reversed number by 10 and add the last digit
        //reversedNumber = reversedNumber * 10 + digit;

        // Remove the last digit from the number
        //number /= 10;
    }

}
