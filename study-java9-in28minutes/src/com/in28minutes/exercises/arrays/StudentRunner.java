package com.in28minutes.exercises.arrays;

import java.math.BigDecimal;

public class StudentRunner {

    public static void main(String[] args) {
	    int[] marks = {97, 98, 100};
	    Student student = new Student("Ranga", marks);
	    int totalNumOfMarks = student.getNumberOfmarks();
        System.out.println("Number of Marks : " + totalNumOfMarks);
        int totalSum = student.getTotalSumOfMarks();
        System.out.println("Total number of marks: " + totalSum);
        int maximuMark = student.getMaximumMark();
        System.out.println("Maximum mark : " + maximuMark);
        int minimumMark = student.getMinimunMark();
        System.out.println("Minimum Mark: " + minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("Average of marks: " + average);

    }
}

