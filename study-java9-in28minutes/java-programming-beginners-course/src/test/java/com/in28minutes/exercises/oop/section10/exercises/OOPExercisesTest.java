package com.in28minutes.exercises.oop.section10.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OOPExercisesTest {
    //OOPExercises exercises;
    @BeforeEach
    void setUp() {
        //exercises = new OOPExercises();
    }

    @Test
    void testDimensionFeetInches25() {
        //Given
        int inches = 25;
        //Then
        OOPExercises.Dimension d = new OOPExercises.Dimension(inches);
        //Assert that
        assertEquals(2, d.getFeet());
        assertEquals(1, d.getInches());
    }

    @Test
    void testDimensionFeetInches30() {
        //Given
        int inches = 30;
        //Then
        OOPExercises.Dimension d = new OOPExercises.Dimension(inches);
        //Assert that
        assertEquals(2, d.getFeet());
        assertEquals(6, d.getInches());
    }
    @Test
    void testSquareShape30() {
        //Given
        int side = 30;
        //Then
        OOPExercises.Square shape = new OOPExercises.Square(side);
        //Assert that
        assertEquals(900, shape.calculateArea());
        assertEquals(120, shape.calculatePerimeter());
    }
    @Test
    void testPointClassMove() {
        //Given
        OOPExercises.Point point = new OOPExercises.Point(3, 5);
        //Then
        point.move(2, 2);
        //Assert that
        assertEquals(5, point.getX());
        assertEquals(7, point.getY());
    }
    @Test
    void testPointClassDistanceTo() {
        //Given
        OOPExercises.Point point1 = new OOPExercises.Point(3, 5);
        OOPExercises.Point point2 = new OOPExercises.Point(4, 7);
        //Then
        double distance = point1.distanceTo(point2);
        //Assert that
        assertEquals(2, distance);
    }

    @Test
    void testRGBCreationAndInversion() {
        //Given
        OOPExercises.RGBColor rgbColor = new OOPExercises.RGBColor(180, 200, 0);
        //Then
        rgbColor.invert();
        //Assert that
        assertEquals(75, rgbColor.getRed());
        assertEquals(55, rgbColor.getGreen());
        assertEquals(255, rgbColor.getBlue());
    }
}