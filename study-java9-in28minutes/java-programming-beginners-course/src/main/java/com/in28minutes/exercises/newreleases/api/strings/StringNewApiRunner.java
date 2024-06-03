package com.in28minutes.exercises.newreleases.api.strings;

/**
 * Java 11, 12 and 15 new API Features for String
 */
public class StringNewApiRunner {
    public static void main(String[] args) {
        //Given:
        String empty = "";
        String trailingAndLeadingSpaces = " L R ";
        String SPACE_SEPARATOR = "@";
        System.out.println("Testing String new API functions with different strings values.");
        System.out.println("isBlank() String? " + empty.isBlank());
        System.out.println("Using strip() " + trailingAndLeadingSpaces.strip().replace(" ", SPACE_SEPARATOR));
        System.out.println("Using stripLeading() " + trailingAndLeadingSpaces.stripLeading().replace(" ", SPACE_SEPARATOR));
        System.out.println("Using stripTrailing() " + trailingAndLeadingSpaces.stripTrailing().replace(" ", SPACE_SEPARATOR));

        //Line separator:
        System.out.println("Using lines separator:");
        "Line1\nLine2\nLine3\nLine4\n".lines().forEach(System.out::println);
        String stringToTransform = "UPPER";
        System.out.println("Using transform on :" + stringToTransform);
        System.out.println((String) stringToTransform.transform(s -> s.substring(2)));
        //Use the formatted function as example:
        System.out.println("My name is %s. My age is %d".formatted("Juan", 42));
    }
}
