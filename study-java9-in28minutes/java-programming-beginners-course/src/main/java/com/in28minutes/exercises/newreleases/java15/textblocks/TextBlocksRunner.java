package com.in28minutes.exercises.newreleases.java15.textblocks;

/**
 * New Text block feature to print more text as is.
 */
public class TextBlocksRunner {
    public static void main(String[] args) {
        //Check that ALWAYS the first line should contain only the triple quotes.
        String example = """
                adadsadasdm,;asmvas""";
        String str = """
                Line 1
                    Line 2
                    Line 3
                        Line 4
                        Line 5""";
        System.out.println(str);
        String str1 = """
                Line 1
                    "Line 2"
                    Line 3
                        \\Line 4@@
                        %$# 'Line 5'
                """;
        System.out.println(str1);
        String textBlockFormatted = """
                Line 1: %s
                Line 2: %d
                Line 3: %b
                Line 4""".formatted("Some value", 1000, true);
        System.out.println(textBlockFormatted);
    }
}
