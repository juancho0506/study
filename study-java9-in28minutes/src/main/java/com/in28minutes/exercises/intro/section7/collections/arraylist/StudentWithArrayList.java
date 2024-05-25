package com.in28minutes.exercises.intro.section7.collections.arraylist;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentWithArrayList {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public StudentWithArrayList(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfmarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public int getMaximumMark() {
        return Collections.max(marks);
    }

    public int getMinimunMark() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        int totalSum = getTotalSumOfMarks();
        int numOfMarks = getNumberOfmarks();
        return new BigDecimal(totalSum).divide(new BigDecimal(numOfMarks), 3, RoundingMode.UP);
    }

    public void addNewMark (int mark) {
        this.marks.add(mark);
    }

    public void removeMarkAt(int index){
        this.marks.remove(index);
    }

    @Override
    public String toString() {
        return name + marks;
    }
}
