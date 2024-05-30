package com.in28minutes.exercises.conditionals;

/**
 * You are tasked with implementing the functionality of a Student class
 * which calculates and assigns the student's grade based on the provided marks.
 */
public class Student {
    private final int marks;

    public Student(int marks) {
        //Assign 'marks' to the instance variable 'this.marks'
        this.marks = marks;
    }

    /**
     * This method should return a character representing the grade of the student, based on the marks they have received.
     * If marks are:
     * less than 0 or greater than 100, return 'X'
     * greater than or equal to 90, return 'A'
     * greater than or equal to 80, return 'B'
     * greater than or equal to 70, return 'C'
     * greater than or equal to 60, return 'D'
     * greater than or equal to 50, return 'E'
     * less than 50, return 'F'
     * @return grade assigned according to the mark.
     */
    public char assignGrade() {
        //Implement the method which assigns the grade based on marks.
        // If marks are less than 0 or greater than 100, return 'X'
        if (this.marks < 0 || this.marks > 100){
            return 'X';
        }
        // If marks are less than 50, return 'F'
        if (this.marks < 50) {
            return 'F';
        } else {
            // If marks are greater than or equal to 90, return 'A'
            if (this.marks >= 90){
                return 'A';
            }
            // If marks are greater than or equal to 80, return 'B'
            if (this.marks >= 80){
                return 'B';
            }
            // If marks are greater than or equal to 70, return 'C'
            if (this.marks >= 70 ){
                return 'C';
            }
            // If marks are greater than or equal to 60, return 'D'
            if (this.marks >= 60 ){
                return 'D';
            }
            // If marks are greater than or equal to 50, return 'E'
            return 'E';
        }
    }
}
