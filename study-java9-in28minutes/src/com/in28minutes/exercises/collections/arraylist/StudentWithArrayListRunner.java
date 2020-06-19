package com.in28minutes.exercises.collections.arraylist;

import java.math.BigDecimal;

public class StudentWithArrayListRunner {

    public static void main(String[] args) {
        StudentWithArrayList student = new StudentWithArrayList("Ranga", 97, 98, 100);
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
        System.out.println(student.toString());
        student.addNewMark(150);
        //print the student:
        System.out.println(student.toString());
        student.removeMarkAt(0);
        System.out.println(student.toString());
    }
}

