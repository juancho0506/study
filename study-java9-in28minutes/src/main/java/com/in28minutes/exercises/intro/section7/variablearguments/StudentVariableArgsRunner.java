package com.in28minutes.exercises.intro.section7.variablearguments;

import java.math.BigDecimal;

public class StudentVariableArgsRunner {

    public static void main(String[] args) {
        StudentVariableArgs student = new StudentVariableArgs("Ranga", 97, 98, 100);
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

