package com.in28minutes.exercises.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfmarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public int getMaximumMark() {
        //int min = Integer.MIN_VALUE; is also possible.
        int max = 0;
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public int getMinimunMark() {
        int min = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        int totalSum = getTotalSumOfMarks();
        int numOfMarks = getNumberOfmarks();
        return new BigDecimal(totalSum ).divide(new BigDecimal(numOfMarks), 3, RoundingMode.UP);
    }

}
