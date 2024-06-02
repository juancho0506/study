package com.in28minutes.exercises.conditionals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void assignGrade100() {
        //Given
        Student student = new Student(100);
        //Then
        char grade = student.assignGrade();
        //Assert that
        assertEquals('A', grade);
    }
    @Test
    void assignGrade101() {
        //Given
        Student student = new Student(101);
        //Then
        char grade = student.assignGrade();
        //Assert that
        assertEquals('X', grade);
    }
    @Test
    void assignGrade49() {
        //Given
        Student student = new Student(49);
        //Then
        char grade = student.assignGrade();
        //Assert that
        assertEquals('F', grade);
    }
    @Test
    void assignGrade66() {
        //Given
        Student student = new Student(66);
        //Then
        char grade = student.assignGrade();
        //Assert that
        assertEquals('D', grade);
    }
}