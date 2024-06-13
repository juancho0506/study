package com.in28minutes.exercises.arrays;

import java.util.Arrays;

/**
 * ["aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
 * "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"]
 *
 * Sample Output
 * aaryanna - 4
 * aayanna - 3
 * Explaination:-
 * aaryanna has four distinct characters: 'a', 'n', 'r', and 'y'.
 * aayanna has three distinct characters: 'a', 'n', and 'y'.
 */
public class CharactersCounterRunner {
    public static void main(String[] args) {
        String[] words = new String[]{"aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
                "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"};

        int numberOfAA = countAAsStream(words);
        int numberOfDiffChars = diffChars(words);
        System.out.println(numberOfAA);
        System.out.println(numberOfDiffChars);
    }

    private static int diffChars(String[] words) {
        return (int) Arrays.stream(words)
                .map(w-> {
                    if (w.length() > 1){
                       return w;
                    }
                    return "";
                }).count();
    }

    /**
     * Calculates the words that has aa or AA in consecutive order at the beginning.
     * @param words an array of words that could contain double AA or aa
     *              characters at the beginning.
     * @return The count of the words with double aa or AA.
     */
    private static int countAAs(String[] words) {
        int count = 0;
        for (String word: words){
            int aa = 0;
            char[] charWord = word.toCharArray();
            if (charWord.length > 2){
                for (int i=0; i<2; i++){
                    if (charWord[i] == 'a' || charWord[i]=='A'){
                        aa++;
                        if (aa == 2){
                            count++;
                        }
                    }
                }
            }
        }
        return  count;
    }

    /**
     * Calculates the words that has aa or AA in consecutive order at the beginning.
     * @param words an array of words that could contain double AA or aa
     *              characters at the beginning.
     * @return The count of the words with double aa or AA.
     */
    private static int countAAsStream(String[] words) {
        return (int) Arrays.stream(words).filter(s-> s.contains("aa")).count();
    }

}

