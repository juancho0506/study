package com.in28minutes.exercises.newreleases.java9.modularization.sort.util;

import com.in28minutes.exercises.newreleases.java9.modularization.sort.algorithm.MyBubbleSort;

import java.util.List;

/**
 * Class to show the direct use of the Bubble sort class bypassing the utility class
 * that should be used according to the design, abstraction and encapsulation principles.
 * NOTE: this is just a mere example to show the bad practice to expose functionality to be
 * used by other external clients or members.
 */
public class ModularizationSortingUtil {
    public List<String> sort(List<String> names){
        MyBubbleSort bubbleSort = new MyBubbleSort();
        return bubbleSort.sort(names);
    }
}
