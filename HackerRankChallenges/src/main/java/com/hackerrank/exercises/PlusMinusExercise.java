/**
 * 
 */
package com.hackerrank.jtorres.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class PlusMinusExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int arraySize;
		 Scanner in = new Scanner(System.in);
		 try {
			 System.out.println("Enter the size array numbers: ");
		     arraySize = Integer.parseInt(in.nextLine());
		     
		     if(arraySize > 0){
		    	 int[] numbers = new int[arraySize];
		    	 System.out.println("Your array size : " + numbers.length);
		    	 System.out.println("Please enter the numbers to store in the array (space separated): ");
		    	 //in = new Scanner(System.in);
		    	 String numbersStr = in.nextLine();
		    	 numbers = convertStrArrayToIntArray(numbersStr.trim().split(" "), arraySize);
		    	 //print the result generated:
		    	 printResults(numbers);
		     }else{
		    	 System.err.println("Size of array must be greater than zero!");
		     }
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("The size of the numbers array doesn't match with the numbers quantity entered: " + e.getMessage());
		}catch (NumberFormatException e){
			System.err.println("Only numbers are valid! : " + e.getMessage());
		}finally {
			if (in != null) {
				in.close();
			}
		}
		 
	}

	/**
	 * Converts and validates an array of String to an Int Array.
	 * @param strArray
	 * @param size
	 * @return
	 * @throws IllegalArgumentException
	 */
	private static int[] convertStrArrayToIntArray(String[] strArray, int size) throws ArrayIndexOutOfBoundsException, NumberFormatException{
		int[] result = new int[size]; 
		for (int i = 0; i<strArray.length; i++) {
			result[i] = Integer.parseInt(strArray[i]);
		}
		return result;
	}
	
	/**
	 * Prints the results generated from numbers array.
	 * The fraction of numbers that are greater than zero, less than zero and equal to zero are printed in that order.
	 * @param numbers
	 */
	private static void printResults(final int[] numbers) {
		double contPositive= 0;
		double contNegative = 0;
		double contZero = 0;
		for (int number : numbers) {
			if(number>0){
				contPositive++;
			}else if(number < 0){
				contNegative++;
			}else{
				contZero++;
			}
		}
		double positive = BigDecimal.valueOf(contPositive/numbers.length)
			    .setScale(6, RoundingMode.HALF_UP)
			    .doubleValue();
		double negative = BigDecimal.valueOf(contNegative/numbers.length)
			    .setScale(6, RoundingMode.HALF_UP)
			    .doubleValue();
		double zero = BigDecimal.valueOf(contZero/numbers.length)
			    .setScale(6, RoundingMode.HALF_UP)
			    .doubleValue();
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(zero);
	}

}
