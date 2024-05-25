package com.in28minutes.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ranga"));
        students.add(new Student(100, "Adam"));
        students.add(new Student(2, "Eve"));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students, new DescendingStudentComparator());
        System.out.println("Descending Comparator: " + students);
    }
}
