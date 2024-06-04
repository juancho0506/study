package com.in28minutes.exercises.newreleases.java14.newswitch;

public class SwitchExpressionRunner {
    /**
     * Returns the day of the week using a traditional switch statement,
     * @param day of the week to check
     * @return returns the string day according to the value of an integer code.
     */
    public static String findDayOfTheWeekSwitch(int day){
        //Using break statements:
        String dayOfWeek = "";
        switch(day) {
            case 0: dayOfWeek="Sunday"; break;
            case 1: dayOfWeek="Monday"; break;
            case 2: dayOfWeek="Tuesday"; break;
            case 3: dayOfWeek="Wednesday"; break;
            default: throw new IllegalArgumentException("Invalid Option: " + day);
        }
        return dayOfWeek;
    }

    /**
     * Returns the day of the week using the new switch expression,
     * @param day of the week to check
     * @return returns the string day according to the value of an integer code.
     */
    public static String findDayOfTheWeekWithSwitchExpression(int day){
        //Using break statements:
        String dayOfWeek = switch(day) {
            //IMPORTANT: As you can see above there's no fallthrough steps on the new switch expression.
            //Only returned values, it means each case returns a value if falls into it.
            case 0 -> {
                System.out.println("Adding more complex logic on Case0..");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default-> throw new IllegalArgumentException("Invalid Option: " + day);
        };
        return dayOfWeek;
    }
    public static void main(String[] args) {

    }
}
