package com.in28minutes.exercises.conditionals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAdviserTest {

    @Test
    void provideWeatherAdvisoryFreezing() {
        //Given
        int temp = -5;
        //then
        WeatherAdviser adviser = new WeatherAdviser();
        //Assert that
        assertEquals(WeatherAdviser.FREEZING, adviser.provideWeatherAdvisory(temp));
    }

    @Test
    void provideWeatherAdvisoryCool() {
        //Given
        int temp = 12;
        //then
        WeatherAdviser adviser = new WeatherAdviser();
        //Assert that
        assertEquals(WeatherAdviser.COOL, adviser.provideWeatherAdvisory(temp));
    }
    @Test
    void provideWeatherAdvisoryWarm() {
        //Given
        int temp = 25;
        //then
        WeatherAdviser adviser = new WeatherAdviser();
        //Assert that
        assertEquals(WeatherAdviser.WARM, adviser.provideWeatherAdvisory(temp));
    }
    @Test
    void provideWeatherAdvisoryCold() {
        //Given
        int temp = 7;
        //then
        WeatherAdviser adviser = new WeatherAdviser();
        //Assert that
        assertEquals(WeatherAdviser.COLD, adviser.provideWeatherAdvisory(temp));
    }
}