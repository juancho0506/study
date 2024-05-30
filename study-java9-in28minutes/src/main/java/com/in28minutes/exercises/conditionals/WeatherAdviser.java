package com.in28minutes.exercises.conditionals;

/**
 * In this problem, you have to complete the implementation of a WeatherAdviser class in Java
 * that provides advice on what to wear based on the current temperature.
 * Your task is to implement the provideWeatherAdvisory(int temperature) method in the WeatherAdviser class.
 */
public class WeatherAdviser {

    public static final String FREEZING = "It's freezing! Wear a heavy coat.";
    public static final String WARM = "It's warm! Enjoy the day.";
    public static final String COOL = "It's cool! A light jacket will do.";
    public static final String COLD = "It's cold! Bundle up.";

    /**
     * This method will take one parameter, temperature (an integer), and it should return a String containing advice on what
     * to wear according to the following guidelines:
     * If the temperature is less than 0, return "It's freezing! Wear a heavy coat."
     * If the temperature is between 0 and 10, inclusive, return "It's cold! Bundle up."
     * If the temperature is between 11 and 20, inclusive, return "It's cool! A light jacket will do."
     * If the temperature is above 20, return "It's warm! Enjoy the day."
     * @param temperature the temperature units to check
     * @return a weather advisory to the user so he can prepare.
     */
    public String provideWeatherAdvisory(int temperature) {
        if (temperature < 0)
            return FREEZING;
        if (temperature > 20)
            return WARM;
        if (temperature >=11)
            return COOL;
        return COLD;
    }
}
